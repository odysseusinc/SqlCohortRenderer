package org.ohdsi.webapi.common;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class Executable extends CommonEntity {
    private String version;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "username", column = @Column(name = "author_username")),
            @AttributeOverride(name = "name", column = @Column(name = "author_name"))
    })
    private User author;

    public String getVersion() {

        return version;
    }

    public void setVersion(String version) {

        this.version = version;
    }

    public User getAuthor() {

        return author;
    }

    public void setAuthor(User author) {

        this.author = author;
    }
}
