package com.lu.controller;

import com.lu.model.DemoData;
import com.lu.model.WaitData;
import com.pig4cloud.plugin.excel.annotation.RequestExcel;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.pig4cloud.plugin.excel.annotation.Sheet;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lu.service.TestService;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/upload")
    @ResponseExcel(name = "test", sheets = @Sheet(sheetName = "testSheet1"))
    public List<DemoData> upload(@RequestExcel List<WaitData> dataList, @RequestParam("jyhqz") String jyhqz, BindingResult bindingResult, HttpServletResponse response) {
        // JSR 303 校验通用校验获取失败的数据
//        List<ErrorMessage> errorMessageList = (List<ErrorMessage>) bindingResult.getTarget();
        //交易号前缀+所有数据
        response.addHeader("content-Type","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        return new TestService().upload(dataList,jyhqz);
    }
}
