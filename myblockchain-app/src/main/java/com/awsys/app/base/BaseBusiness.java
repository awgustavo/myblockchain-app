package com.awsys.app.base;

import org.modelmapper.ModelMapper;

public abstract class BaseBusiness<Entity, VO> { 


    private ModelMapper modelMapper;

    public BaseBusiness() {
        this.modelMapper = new ModelMapper();
    }
    
    public abstract Entity toEntity(VO vo);

    public abstract VO toVO(Entity entity);

    public VO beforePersist(VO vo) {
        return vo;
    }

    public VO beforeReturn(VO vo) {
        return vo;
    }

    public Entity mapEntity(VO obj, Class cls) {
        return (Entity)this.modelMapper.map(obj, cls);
    }

    public VO mapVO(Entity obj, Class cls) {
        return (VO)this.modelMapper.map(obj, cls);
    }
}