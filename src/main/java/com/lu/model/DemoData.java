package com.lu.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData {
    @ExcelIgnore
    private WaitData waitData;
    //目标表
    //交易号	店铺名称	买家昵称	买家留言	卖家备注	收货人	收货地址	省	市	区	收货人手机	收货人电话	快递编号	快递成本	快递费用	是否货到付款	订单类型	SKU	销售单价	代理价	数量	邮编	发票抬头	发票内容	业务员	预留属性1

    public DemoData(WaitData waitData) {
        //            @ExcelProperty("买家会员名")
//            private String mjhym;
//            @ExcelProperty("收货人姓名")
//            private String shrsj;
//            @ExcelProperty("收货地址")
//            private String shdz;
//            @ExcelProperty("联系手机")
//            private String lxsj;
//            @ExcelProperty("宝贝标题")
//            private String bbbt;
        this.waitData = waitData;
        this.mjnc=waitData.getMjhym();
        this.shr=waitData.getShrxm();
        this.shdz=waitData.getShdz();
        this.shrsj=waitData.getLxsj();
        this.shrdh=waitData.getLxsj();
        this.sku=waitData.getBbbt();

    }

    @ExcelProperty("交易号")
    private String jyh;
    @ExcelProperty("店铺名称")
    private String dpmc;
    @ExcelProperty("买家昵称")
    private String mjnc;
    @ExcelProperty("卖家备注")
    private String mjbz;
    @ExcelProperty("收货人")
    private String shr;
    @ExcelProperty("收货地址")
    private String shdz;
    @ExcelProperty("省")
    private String sheng;
    @ExcelProperty("市")
    private String shi;
    @ExcelProperty("区")
    private String qu;
    @ExcelProperty("收货人手机")
    private String shrsj;
    @ExcelProperty("收货人电话")
    private String shrdh;
    @ExcelProperty("快递编号")
    private String kdbh;
    @ExcelProperty("快递成本")
    private String kdcb;
    @ExcelProperty("快递费用")
    private String kdfy;
    @ExcelProperty("是否货到付款")
    private String sfhdfk;
    @ExcelProperty("订单类型")
    private String ddlx;
    @ExcelProperty("SKU")
    private String sku;
    @ExcelProperty("销售单价")
    private String xsdj;
    @ExcelProperty("代理价")
    private String dlj;
    @ExcelProperty("数量")
    private String sl;
    @ExcelProperty("邮编")
    private String yb;
    @ExcelProperty("发票抬头")
    private String fptt;
    @ExcelProperty("发票内容")
    private String fpnr;
    @ExcelProperty("业务员")
    private String ywy;
    @ExcelProperty("预留属性1")
    private String ylsx1;




}
