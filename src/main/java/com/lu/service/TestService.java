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
        }
        return demoData;
    }
}
