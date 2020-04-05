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
public class BlockUserVO extends BaseVO {
   
    private String displayName;
    private String email;

}