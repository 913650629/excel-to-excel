package com.lu.util;

import com.alibaba.excel.annotation.ExcelProperty;
import com.lu.model.DemoData;
import com.lu.model.WaitData;

import java.util.ArrayList;
import java.util.List;

public class WaitToResult {
    public static List<DemoData> test(List<WaitData> waitData){
        List<DemoData> demoData = new ArrayList<>();
        for (WaitData waitDatum : waitData) {
            //导入来的数据
            DemoData demoData1 = new DemoData(waitDatum);
            demoData.add(demoData1);
        }
        return demoData;
    }
}
