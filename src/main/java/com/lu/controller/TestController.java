package com.lu.controller;

import com.lu.model.DemoData;
import com.lu.model.WaitData;
import com.pig4cloud.plugin.excel.annotation.RequestExcel;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.pig4cloud.plugin.excel.annotation.Sheet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.lu.service.TestService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping
public class TestController {

    @PostMapping("/upload")
    public String upload(@RequestExcel List<WaitData> dataList, @RequestParam("jyhqz") String jyhqz, @RequestParam("kdbh") String kdbh,@RequestParam("sl") String sl,@RequestParam("dpmc") String dpmc,RedirectAttributes attribdatautes) {
        // JSR 303 校验通用校验获取失败的数据
//        List<ErrorMessage> errorMessageList = (List<ErrorMessage>) bindingResult.getTarget();
        //交易号前缀+所有数据
        attribdatautes.addFlashAttribute("data", new TestService().upload(dataList,jyhqz,kdbh,sl,dpmc));
        return "redirect:/download";
    }

    @ResponseExcel(name = "test", sheets = @Sheet(sheetName = "Sheet1"))
    @GetMapping("/download")
    public List<DemoData> test(@ModelAttribute("data") List<DemoData> dataList) {
        return dataList;
    }

}
