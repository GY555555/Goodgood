package com.jk.gy.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

public class Dept {
    private Integer did;

    private String dname;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }


}