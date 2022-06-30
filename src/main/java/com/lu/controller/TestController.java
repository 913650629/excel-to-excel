package com.lu.controller;

import com.lu.model.DemoData;
import com.lu.model.WaitData;
import com.lu.util.WaitToResult;
import com.pig4cloud.plugin.excel.annotation.RequestExcel;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.pig4cloud.plugin.excel.annotation.Sheet;
import com.pig4cloud.plugin.excel.vo.ErrorMessage;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class TestController {

    @PostMapping("/upload")
    @ResponseExcel(name = "test", sheets = @Sheet(sheetName = "testSheet1"))
    public List<DemoData> upload(@RequestExcel List<WaitData> dataList, BindingResult bindingResult) {
        // JSR 303 校验通用校验获取失败的数据
//        List<ErrorMessage> errorMessageList = (List<ErrorMessage>) bindingResult.getTarget();
        return  WaitToResult.test(dataList);
    }
}
