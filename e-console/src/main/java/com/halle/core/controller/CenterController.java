package com.halle.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
    /**
     * ModelAndView: 跳转视图+数据
     * void：异步ajax
     * String 跳转视图
     */
    @RequestMapping(value = "/test/index.do")
    public String index(){
        return "index";
    }
}
