package com.liu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.pojo.GirlInfo;
import com.liu.service.GirlServiceImpl;

@Controller
public class GirlController {
    @Resource(name = "girlServiceImpl")
    private GirlServiceImpl girlServiceImpl;

    private HttpServletResponse response;
    private HttpServletRequest request;

    @RequestMapping("/addGirl.do")
    public String addGirl(GirlInfo girl, HttpServletRequest request) {
        System.out.println("dwdwdwdw");
        boolean bp = girlServiceImpl.addGirl(girl);

        if (bp == true) {
            request.setAttribute("info", "OK");
        } else {
            request.setAttribute("info", "NO");
        }
        return "girlinfo/girl_info";

    }
}
