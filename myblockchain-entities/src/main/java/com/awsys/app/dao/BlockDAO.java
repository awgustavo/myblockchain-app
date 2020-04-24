package com.awsys.app.dao;

import com.awsys.app.model.Block;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface BlockDAO extends PagingAndSortingRepository<Block, Long> { 
    List<Block> findByHash(String hash);
}