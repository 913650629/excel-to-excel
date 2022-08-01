package com.lu.service;

import com.lu.model.DemoData;
import com.lu.model.WaitData;
import com.lu.util.WaitToResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    public List<DemoData> upload(List<WaitData> dataList,String jyhqz,String kdbh,String sl,String dpmc){
        List<DemoData> demoData=WaitToResult.test(dataList);
        String chars = "0123456789ABCDEFGHIZKLMNOPQRSTUVWXYZ";
        for (DemoData demoDatum : demoData) {
            //设置交易号
            demoDatum.setJyh(jyhqz+(demoData.indexOf(demoDatum)+1));
            //名字防重复
            char c = chars.charAt((int)(Math.random() * 36));
            demoDatum.setShr(demoDatum.getShr()+c);
            //设置快递编号
            if (demoDatum.getKdbh()==null||demoDatum.getKdbh().equals("")){
                demoDatum.setKdbh(kdbh);
            }
            //设置订单数量
            if (demoDatum.getSl()==null||demoDatum.getSl().equals("")){
                demoDatum.setSl(sl);
            }
            //设置店铺名称
            if(demoDatum.getDpmc()==null||demoDatum.getDpmc().equals("")){
                demoDatum.setDpmc(dpmc);
            }
            //设置省市区
            String shdz = demoDatum.getShdz();
            shdz = shdz.replaceAll(" ", "");
            String shdzsub = shdz.substring(0, 2);
            if (shdzsub.contains("上海")||shdzsub.contains("北京")||shdzsub.contains("深圳")||shdzsub.contains("天津")){
                shdz=shdz.replaceFirst(shdzsub,shdzsub+" ");
            }else if(shdz.contains("省")){
                shdz=shdz.replaceFirst("省","省 ");
            } else if (shdz.contains("自治区")) {
                shdz=shdz.replaceFirst("自治区","自治区 ");
            }
            shdz=shdz.replaceFirst("市","市 ");
            shdz=shdz.replaceFirst("区","区 ");
            shdz=shdz.replaceFirst("县","县 ");
            demoDatum.setShdz(shdz);
        }
        return demoData;
    }
}
