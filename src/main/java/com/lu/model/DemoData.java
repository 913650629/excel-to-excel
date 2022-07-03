package com.lu.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData {
    //目标表
    //交易号	店铺名称	买家昵称	买家留言	卖家备注	收货人	收货地址	省	市	区	收货人手机	收货人电话	快递编号	快递成本	快递费用	是否货到付款	订单类型	SKU	销售单价	代理价	数量	邮编	发票抬头	发票内容	业务员	预留属性1


    public DemoData(WaitData waitData) {
        //买家昵称、买家姓名
        if(waitData.getMjnc()!=null&&waitData.getMjnc()!=""){
            this.mjnc=waitData.getMjnc();
        } else if (waitData.getMjhym()!=null||waitData.getMjhym()!="") {
            this.mjnc=waitData.getMjhym();
        }else {
            this.mjnc="";
        }
        //买家收货人姓名，收货人
        if(waitData.getShr()!=null&&waitData.getShr()!=""){
            this.shr=waitData.getShr();
        } else if (waitData.getShrxm()!=null||waitData.getShrxm()!="") {
            this.shr=waitData.getShrxm();
        }else {
            this.shr="";
        }

        //收货人手机
        if(waitData.getShrsj()!=null&&waitData.getShrsj()!=""){
            this.shrsj=waitData.getShrsj();
            this.shrdh=waitData.getShrsj();
        }else if (waitData.getLxsj()!=null&&waitData.getLxsj()!=""){
            this.shrsj=waitData.getLxsj();
            this.shrdh=waitData.getLxsj();
        }else if(waitData.getShrdh()!=null&&waitData.getShrdh()!=""){
            this.shrsj=waitData.getShrdh();
            this.shrdh=waitData.getShrdh();
        }else {
            this.shdz="";
            this.shrdh="";
        }
        //宝贝标题、sku
        if(waitData.getSku()!=null&&waitData.getSku()!=""){
            this.sku=waitData.getSku();
        }else if (waitData.getBbbt()!=null&&waitData.getBbbt()!=""){
            this.sku=waitData.getBbbt();
        }else {
            this.sku="";
        }

        //收获地址、店铺名称、省、市、区
        this.shdz=waitData.getShdz();
        this.dpmc=waitData.getDpmc();
        this.sheng=waitData.getSheng();
        this.shi=waitData.getShi();
        this.qu=waitData.getQu();
        this.sl=waitData.getSl();
        this.yb=waitData.getWlbz();
        //未使用：plant、
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
