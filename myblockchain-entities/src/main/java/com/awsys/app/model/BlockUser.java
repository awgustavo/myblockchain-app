package com.awsys.app.model;

import com.awsys.app.base.BaseEntity;
import javax.persistence.Entity;

@Entity
public class BlockUser extends BaseEntity {
   
    private String displayName;
    private String email;

    public BlockUser() {
    }

    public BlockUser(String displayName, String email) {
        this.displayName = displayName;
        this.email = email;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", displayName='" + getDisplayName() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }

}