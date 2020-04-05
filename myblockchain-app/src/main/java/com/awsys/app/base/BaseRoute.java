package com.awsys.app.base;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;

public class BaseRoute<Entity, VO> { 

    //@Autowired
    private CrudRepository<Entity, Long> dao;
    private BaseBusiness<Entity, VO> business;

    public BaseRoute(CrudRepository<Entity, Long>  dao, BaseBusiness<Entity, VO> business){
        this.dao = dao;
        this.business = business;
    }

    @GetMapping(path="/")
    public ResponseEntity<?>  getAllFilter() {
        return new ResponseEntity(dao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        java.util.Optional<Entity>  entity = dao.findById(id);
        return new ResponseEntity(business.toVO(entity.get()), HttpStatus.OK);
    }

    @PostMapping(path="/")
    public ResponseEntity<?> create(@RequestBody VO vo) {
        Entity entity = business.toEntity(vo);
        return new ResponseEntity(dao.save(entity), HttpStatus.OK);
    }

    @PutMapping(path="/")
    public ResponseEntity<?> update(@RequestBody VO vo) {
        Entity entity = business.toEntity(vo);
        return new ResponseEntity(dao.save(entity), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id) {
        dao.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}