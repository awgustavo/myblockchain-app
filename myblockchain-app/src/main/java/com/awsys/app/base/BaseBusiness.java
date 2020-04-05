package com.awsys.app.base;

import org.modelmapper.ModelMapper;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.List;
import java.util.Optional;

public abstract class BaseBusiness<Entity, VO> { 


    private ModelMapper modelMapper;

    public BaseBusiness() {
        this.modelMapper = new ModelMapper();
    }
    
    public abstract Entity toEntity(VO vo);

    public abstract VO toVO(Entity entity);

    public abstract VO beforePersist(VO vo);

    public abstract VO beforeReturn(VO vo);

    public Entity mapEntity(VO obj, Class cls) {
        return (Entity)this.modelMapper.map(obj, cls);
    }

    public VO mapVO(Entity obj, Class cls) {
        return (VO)this.modelMapper.map(obj, cls);
    }
}