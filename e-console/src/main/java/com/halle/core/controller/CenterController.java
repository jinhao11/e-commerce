package com.halle.core.controller;

import com.halle.core.bean.TestTb;
import com.halle.core.service.TestDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
    @Autowired
    private TestDBService testDBService;
    /**
     * ModelAndView: 跳转视图+数据
     * void：异步ajax
     * String 跳转视图
     */
    @RequestMapping(value = "/test/index.do")
    public String index(){
        testDBService.insertTestDB(new TestTb());
        return "index";
    }
}
