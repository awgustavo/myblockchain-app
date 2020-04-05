package com.awsys.app.dao;

import com.awsys.app.base.BaseDAO;
import com.awsys.app.model.Block;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface BlockDAO extends CrudRepository<Block, Long> { 
    List<Block> findByHash(String hash);
}