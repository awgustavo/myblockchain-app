package com.awsys.app.business;

import com.awsys.app.base.BaseBusiness;
import com.awsys.app.model.Block;
import com.awsys.app.viewobjects.BlockVO;
import org.springframework.stereotype.Service;

@Service
public class BlockBusiness extends BaseBusiness<Block, BlockVO>{ 

    public Block toEntity(BlockVO blockVO) {
        return this.mapEntity(blockVO, Block.class);
    }

    public BlockVO toVO(Block block) {
        return this.mapVO(block, BlockVO.class);
    }

    public BlockVO beforePersist(BlockVO vo) {
        return vo;
    }

    public BlockVO beforeReturn(BlockVO vo) {
        return vo;
    }


}