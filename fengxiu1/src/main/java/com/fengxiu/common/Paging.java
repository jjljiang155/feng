package com.fengxiu.common;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
@Data
public class Paging<T> {

    private Long total;

    private Integer totalPage;

    private List<T> items;

    private Integer page;

    private Integer size;


    public Paging(Page<T> pageT) {

        total = pageT.getTotalElements();

        totalPage = pageT.getTotalPages();

        items = pageT.getContent();
        page = pageT.getNumber();
        size = pageT.getSize();

    }
}
