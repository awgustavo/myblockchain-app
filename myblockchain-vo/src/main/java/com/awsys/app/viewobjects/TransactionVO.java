package com.awsys.app.viewobjects;

import com.awsys.app.base.BaseVO;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionVO extends BaseVO {
   
    private Double amount;
    private BlockUserVO blockUserPayer;
    private BlockUserVO blockUserReceiver;
    private Timestamp timestamp; 

}