package com.awsys.app.base;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseVO implements Serializable {

    private static final long serialVersionUID = -8193607365747968971L;

    private Long id;

}