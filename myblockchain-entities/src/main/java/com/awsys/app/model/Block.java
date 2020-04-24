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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Block extends BaseEntity {
   
    private static final long serialVersionUID = 8812289409304727494L;

    private double value;
    private String hash;
    private String previousHash;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transactionId")
    private Transaction transaction;

    @Override
    public String toString() {
        return "{" +
            " value='" + value + "'" +
            ", hash='" + hash + "'" +
            ", previousHash='" + previousHash + "'" +
            ", transaction=" + transaction.toString() + "" +
            "}";
    }
   
}