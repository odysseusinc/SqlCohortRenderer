package org.ohdsi.webapi.dto;

import org.ohdsi.webapi.common.Executable;
import org.ohdsi.webapi.common.User;

public abstract class ExecutableDTO extends CommonEntityDTO {
    private User author;
    private String version;

    public ExecutableDTO() {

    }

    public ExecutableDTO(Executable executable){
        super(executable);
        this.author = executable.getAuthor();
        this.version = executable.getVersion();
    }

    public User getAuthor() {

        return author;
    }

    public void setAuthor(User author) {

        this.author = author;
    }

    public String getVersion() {

        return version;
    }

    public void setVersion(String version) {

        this.version = version;
    }
}
