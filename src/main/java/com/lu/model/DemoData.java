package com.lu.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData {
    //目标表
    //交易号	店铺名称	买家昵称	买家留言	卖家备注	收货人	收货地址	省	市	区	收货人手机	收货人电话	快递编号	快递成本	快递费用	是否货到付款	订单类型	SKU	销售单价	代理价	数量	邮编	发票抬头	发票内容	业务员	预留属性1


    public DemoData(WaitData waitData) {
        //买家昵称、买家会员名
        if(waitData.getMjnc()!=null&& !waitData.getMjnc().equals("")){
            this.mjnc=waitData.getMjnc();
        } else if (waitData.getMjhym()!=null&& !waitData.getMjhym().equals("")) {
            this.mjnc=waitData.getMjhym();
        }else {
            this.mjnc="";
        }
        //收货人姓名，收货人、买家姓名
        if(waitData.getShr()!=null&& !waitData.getShr().equals("")){
            this.shr=waitData.getShr();
        } else if (waitData.getShrxm()!=null&&!waitData.getShrxm().equals("")) {
            this.shr=waitData.getShrxm();
        }else if(waitData.getXm()!=null&& !waitData.getXm().equals("")){
            this.shr=waitData.getXm();
        }else {
            this.shr="";
        }

        //收货人手机、联系方式、收货人电话
        if(waitData.getShrsj()!=null&& !waitData.getShrsj().equals("")){
            this.shrsj=waitData.getShrsj();
            this.shrdh=waitData.getShrsj();
        }else if (waitData.getLxsj()!=null&& !waitData.getLxsj().equals("")){
            this.shrsj=waitData.getLxsj();
            this.shrdh=waitData.getLxsj();
        }else if(waitData.getShrdh()!=null&& !waitData.getShrdh().equals("")){
            this.shrsj=waitData.getShrdh();
            this.shrdh=waitData.getShrdh();
        }else {
            this.shdz="";
            this.shrdh="";
        }
        //宝贝标题、sku、赠品名称
        if(waitData.getSku()!=null&& !waitData.getSku().equals("")){
            this.sku=waitData.getSku();
        }else if (waitData.getBbbt()!=null&& !waitData.getBbbt().equals("")){
            this.sku=waitData.getBbbt();
        }else if(waitData.getZpmc()!=null&& !waitData.getBbbt().equals("")){
            this.sku=waitData.getZpmc();
        }else {
            this.sku="";
        }

        //收获地址、地址
        if(waitData.getShdz()!=null&& !waitData.getShdz().equals("")){
            this.shdz=waitData.getShdz();
        }else if(waitData.getDz()!=null&& !waitData.getDz().equals("")){
            this.shdz=waitData.getDz();
        }
        //店铺名称、省、市、区
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
