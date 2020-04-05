package com.awsys.app.model;

import com.awsys.app.base.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;


@Entity
public class Block extends BaseEntity {
   
    private double value;
    private String hash;
    private String previousHash;
    //private Long transactionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transactionId")
    private Transaction transaction;

    public Block() {
    }

    public Block(double value, String hash, String previousHash, Transaction transaction, long timestamp) {
        this.value = value;
        this.hash = hash;
        this.previousHash = previousHash;
        this.transaction = transaction;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return this.previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public Transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            ", hash='" + getHash() + "'" +
            ", previousHash='" + getPreviousHash() + "'" +
            ", transaction=" + getTransaction().toString() + "" +
            "}";
    }
   
}