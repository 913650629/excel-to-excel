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
    @ExcelProperty("姓名")
    private String xm;
    @ExcelProperty("收货地址")
    private String shdz;
    @ExcelProperty("地址")
    private String dz;
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
    @ExcelProperty("电话")
    private String dh;
    @ExcelProperty("SKU")
    private String sku;
    @ExcelProperty("赠品名称")
    private String zpmc;
    @ExcelProperty("数量")
    private String sl;
    //未使用
    @ExcelProperty("Plant\n自动匹配")
    private String plant;
    @ExcelProperty("物流备注")
    private String wlbz;
    @ExcelProperty("宝贝标题")
    private String bbbt;
    @ExcelProperty("快递编号")
    private String kdbh;

}
