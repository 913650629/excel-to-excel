package com.lu.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
public class WaitData {
    //导入来的数据
    @ExcelProperty("买家会员名")
    private String mjhym;
    @ExcelProperty("买家昵称")
    private String mjnc;

    @ExcelProperty("收货人姓名")
    private String shrxm;
    @ExcelProperty("收货人")
    private String shr;
    @ExcelProperty("收货地址")
    private String shdz;
    @ExcelProperty("店铺名称\n(下拉框选择）")
    private String dpmc;
    @ExcelProperty("省")
    private String sheng;
    @ExcelProperty("市")
    private String shi;
    @ExcelProperty("区")
    private String qu;
    @ExcelProperty("联系手机")
    private String lxsj;
    @ExcelProperty("收货人手机")
    private String shrsj;
    @ExcelProperty("收货人电话")
    private String shrdh;
    @ExcelProperty("SKU")
    private String sku;
    @ExcelProperty("数量")
    private String sl;
    //未使用
    @ExcelProperty("Plant\n自动匹配")
    private String plant;
    @ExcelProperty("物流备注")
    private String wlbz;
    @ExcelProperty("宝贝标题")
    private String bbbt;

    public String getMjhym() {
        return mjhym;
    }

    public void setMjhym(String mjhym) {
        this.mjhym = mjhym;
    }

    public String getShrxm() {
        return shrxm;
    }

    public void setShrxm(String shrxm) {
        this.shrxm = shrxm;
    }

    public String getShdz() {
        return shdz;
    }

    public void setShdz(String shdz) {
        this.shdz = shdz;
    }

    public String getLxsj() {
        return lxsj;
    }

    public void setLxsj(String lxsj) {
        this.lxsj = lxsj;
    }

    public String getBbbt() {
        return bbbt;
    }

    public void setBbbt(String bbbt) {
        this.bbbt = bbbt;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getDpmc() {
        return dpmc;
    }

    public void setDpmc(String dpmc) {
        this.dpmc = dpmc;
    }

    public String getShrsj() {
        return shrsj;
    }

    public void setShrsj(String shrsj) {
        this.shrsj = shrsj;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getWlbz() {
        return wlbz;
    }

    public void setWlbz(String wlbz) {
        this.wlbz = wlbz;
    }

    public String getMjnc() {
        return mjnc;
    }

    public void setMjnc(String mjnc) {
        this.mjnc = mjnc;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getShrdh() {
        return shrdh;
    }

    public void setShrdh(String shrdh) {
        this.shrdh = shrdh;
    }
}
