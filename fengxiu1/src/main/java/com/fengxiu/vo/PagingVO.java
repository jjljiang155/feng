package com.fengxiu.vo;

import com.fengxiu.common.Paging;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class PagingVO<T,K> extends Paging {




    public PagingVO(Page<T> pageT, Class<K> kClass) {

        super(pageT);
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();

        List<T> tlist = this.getItems();

        List<K> list = new ArrayList();

        tlist.forEach((item)->{
            K map = mapper.map(item, kClass);
            list.add(map);
        });

        this.setItems(list);
    }


}
