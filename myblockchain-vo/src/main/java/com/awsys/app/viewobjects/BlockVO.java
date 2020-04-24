package com.awsys.app.viewobjects;

import com.awsys.app.base.BaseVO;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlockVO extends BaseVO {

    private static final long serialVersionUID = -3127341978200065062L;
    
    private String hash;
    private String previousHash;
    private Long dificulty;
    private TransactionVO transaction;

}