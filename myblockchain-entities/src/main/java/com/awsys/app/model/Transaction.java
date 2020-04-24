package com.awsys.app.model;

import com.awsys.app.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction extends BaseEntity {
   
    private static final long serialVersionUID = -5098893550230249125L;

    private Double amount;
    
   // private Long blockUserPayerId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "blockUserPayerId")
    private BlockUser blockUserPayer;

    //private Long blockUserReceiverId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "blockUserReceiverId")
    private BlockUser blockUserReceiver;

    private Timestamp timestamp; 

    public Transaction() {
    }

    public Transaction(Double amount, BlockUser blockUserPayer, BlockUser blockUserReceiver, Timestamp timestamp) {
        this.amount = amount;
        this.blockUserPayer = blockUserPayer;
        this.blockUserReceiver = blockUserReceiver;
        this.timestamp = timestamp;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BlockUser getBlockUserPayer() {
        return this.blockUserPayer;
    }

    public void setBlockUserPayer(BlockUser blockUserPayer) {
        this.blockUserPayer = blockUserPayer;
    }

    public BlockUser getBlockUserReceiver() {
        return this.blockUserReceiver;
    }

    public void setBlockUserReceiver(BlockUser blockUserReceiver) {
        this.blockUserReceiver = blockUserReceiver;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        return "{" +
            " amount='" + getAmount() + "'" +
            ", timestamp='" + getTimestamp() + "'" +
            "}";
    }

}