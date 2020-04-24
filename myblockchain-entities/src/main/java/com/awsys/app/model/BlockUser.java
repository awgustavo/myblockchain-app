package com.awsys.app.model;

import com.awsys.app.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BlockUser extends BaseEntity {
   
    private static final long serialVersionUID = 1650783499448992364L;

    private String displayName;
    private String email;
    private String password;
    private String confirmedPassword;

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