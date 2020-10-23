package com.jk.gy.pojo;

public class Order {
    private Integer oid;

    private String oname;

    private Integer oprice;

    private String obh;

    private String odate;

    private Integer zfid;

    private String zname;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Integer getOprice() {
        return oprice;
    }

    public void setOprice(Integer oprice) {
        this.oprice = oprice;
    }

    public String getObh() {
        return obh;
    }

    public void setObh(String obh) {
        this.obh = obh == null ? null : obh.trim();
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate == null ? null : odate.trim();
    }

    public Integer getZfid() {
        return zfid;
    }

    public void setZfid(Integer zfid) {
        this.zfid = zfid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", oprice=" + oprice +
                ", obh='" + obh + '\'' +
                ", odate='" + odate + '\'' +
                ", zfid=" + zfid +
                ", zname=" + zname +'\'' +
                '}';
    }
}