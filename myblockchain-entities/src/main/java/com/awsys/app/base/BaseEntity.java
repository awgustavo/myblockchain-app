package com.awsys.app.base;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.Column;

@MappedSuperclass
public class BaseEntity implements Serializable {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(columnDefinition = "serial")
    private Long id;
   
   public BaseEntity(){ }

   public Long getId() {
       return this.id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        BaseEntity baseEntity = (BaseEntity) o;
        return id != null ?  id.equals(baseEntity.id) : this.id==null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}