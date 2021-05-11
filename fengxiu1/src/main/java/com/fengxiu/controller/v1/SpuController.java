package com.fengxiu.controller.v1;


import com.fengxiu.exception.NotFundException;
import com.fengxiu.models.Spu;
import com.fengxiu.vo.PagingVO;
import com.fengxiu.vo.SpuSimpleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spu")
@Validated
public class SpuController {

//
//    @Autowired
//    private SpuService spuservice;
//
//
//    @RequestMapping("findById/{id}")
//    public Spu findByName(@PathVariable Long id) throws Exception
//    {
//       Spu spu = spuservice.findById(id);
//
//       if (spu == null)
//       {
//           throw new NotFundException(30001);
//       }
//       return spu;
//    }
//
//
//    @RequestMapping("findByPage")
//    public PagingVO findByPage(@RequestParam(defaultValue = "0") Integer page
//            , @RequestParam(defaultValue = "1") Integer pageSize) throws Exception
//    {
//        Page<Spu> pageinfo = spuservice.findByPage(page,pageSize);
//
//        PagingVO pagevo = new PagingVO<>(pageinfo,SpuSimpleVO.class);
//
//
//        if (pagevo == null)
//        {
//            throw new NotFundException(30001);
//        }
//        return pagevo;
//    }



}
