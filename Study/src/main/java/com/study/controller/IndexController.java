package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.domain.Answer;


@Controller
public class IndexController {

    @RequestMapping(value = "/index1" )
	
    public String Index() {
		
		return "html/Index.html";
	}

    @RequestMapping(value = "/text" )
    public String Text() {
    	
    	return"html/Text.html";
    }
}
