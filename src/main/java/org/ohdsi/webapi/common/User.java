package org.ohdsi.webapi.common;

import javax.persistence.Embeddable;

@Embeddable
public class User {
    private String username;
    private String name;

    public User() {

    }

    public User(String username, String name) {

        this.username = username;
        this.name = name;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
