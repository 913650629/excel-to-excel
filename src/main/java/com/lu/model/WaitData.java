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
    @ExcelProperty("收货人姓名")
    private String shrxm;
    @ExcelProperty("收货地址")
    private String shdz;
    @ExcelProperty("联系手机")
    private String lxsj;
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
}
