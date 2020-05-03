package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {

	@RequestMapping(value="/resume")
	public String resume() {
	 return "html/resume.html";
}
}
