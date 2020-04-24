package com.awsys.app.viewobjects;

import com.awsys.app.base.BaseVO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlockUserVO extends BaseVO {
   
    private static final long serialVersionUID = 442746440800479286L;

    private String displayName;
    private String email;
    @JsonIgnore
    private String password;
    @JsonIgnore
    private String confirmedPassword;

}