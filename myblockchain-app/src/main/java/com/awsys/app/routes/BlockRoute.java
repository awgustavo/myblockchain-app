package com.awsys.app.routes;

import com.awsys.app.base.BaseRoute;
import com.awsys.app.model.Block;
import com.awsys.app.viewobjects.BlockVO;
import com.awsys.app.dao.BlockDAO;
import com.awsys.app.business.BlockBusiness;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("block")
public class BlockRoute extends BaseRoute<Block, BlockVO>{ 

    public BlockRoute(BlockDAO dao, BlockBusiness blockBusiness) {
        super(dao, blockBusiness);
        System.out.println(dao.toString());
    }

}