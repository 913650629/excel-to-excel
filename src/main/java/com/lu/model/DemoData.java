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

    @ExcelProperty(Constants.jyh)
    private String jyh;
    @ExcelProperty(Constants.dlj)
    private String dpmc;
    @ExcelProperty(Constants.mjnc)
    private String mjnc;
    @ExcelProperty(Constants.mjbz)
    private String mjbz;
    @ExcelProperty(Constants.shr)
    private String shr;
    @ExcelProperty(Constants.shdz)
    private String shdz;
    @ExcelProperty(Constants.sheng)
    private String sheng;
    @ExcelProperty(Constants.shi)
    private String shi;
    @ExcelProperty(Constants.qu)
    private String qu;
    @ExcelProperty(Constants.shrsj)
    private String shrsj;
    @ExcelProperty(Constants.shrdh)
    private String shrdh;
    @ExcelProperty(Constants.kdbh)
    private String kdbh;
    @ExcelProperty(Constants.kdcb)
    private String kdcb;
    @ExcelProperty(Constants.kdfy)
    private String kdfy;
    @ExcelProperty(Constants.sfhdfk)
    private String sfhdfk;
    @ExcelProperty(Constants.ddlx)
    private String ddlx;
    @ExcelProperty(Constants.sku)
    private String sku;
    @ExcelProperty(Constants.xsdj)
    private String xsdj;
    @ExcelProperty(Constants.dlj)
    private String dlj;
    @ExcelProperty(Constants.sl)
    private String sl;
    @ExcelProperty(Constants.yb)
    private String yb;
    @ExcelProperty(Constants.fptt)
    private String fptt;
    @ExcelProperty(Constants.fpnr)
    private String fpnr;
    @ExcelProperty(Constants.ywy)
    private String ywy;
    @ExcelProperty(Constants.ylsx1)
    private String ylsx1;


}
