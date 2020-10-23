package com.jk.gy.pojo;

public class Emp {
    private Integer eid;

    private String ename;

    private Integer edept;

    private String cdate;

    private String egw;

    private String ezz;

    private String dname;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getEdept() {
        return edept;
    }

    public void setEdept(Integer edept) {
        this.edept = edept;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }

    public String getEgw() {
        return egw;
    }

    public void setEgw(String egw) {
        this.egw = egw == null ? null : egw.trim();
    }

    public String getEzz() {
        return ezz;
    }

    public void setEzz(String ezz) {
        this.ezz = ezz == null ? null : ezz.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", edept=" + edept +
                ", cdate='" + cdate + '\'' +
                ", egw='" + egw + '\'' +
                ", ezz='" + ezz + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}