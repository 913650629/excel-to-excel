package com.lu.service;

import com.lu.model.DemoData;
import com.lu.model.WaitData;
import com.lu.util.WaitToResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    public List<DemoData> upload(List<WaitData> dataList,String jyhqz){
        List<DemoData> demoData=WaitToResult.test(dataList);
        String chars = "0123456789ABCDEFGHIZKLMNOPQRSTUVWXYZ";
        for (DemoData demoDatum : demoData) {
            if ((demoDatum.getJyh() == null) || demoDatum.getJyh().equals("")){
                demoDatum.setJyh(jyhqz+(demoData.indexOf(demoDatum)+1));
                char c = chars.charAt((int)(Math.random() * 36));
                demoDatum.setShr(demoDatum.getShr()+c);
            }
        }
        return demoData;
    }
}
