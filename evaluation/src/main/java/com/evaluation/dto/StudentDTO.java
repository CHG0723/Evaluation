package com.evaluation.dto;

import com.evaluation.entity.StudentEntity;

/**
 * @author: chg
 * @date: 2020/3/23 19:49
 * @Description:
 */
public class StudentDTO extends StudentEntity {

    private Integer page;

    private Integer limit;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
