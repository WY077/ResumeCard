package com.study.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.domain.Answer;
import com.study.service.StudyImpl;

@Controller
public class StudyController {
	@Autowired
	StudyImpl studyImpl;

	@RequestMapping("/accent")
	@ResponseBody
	public String studyAccent(String index, String content) {
		if (checkNumber(index) && checkNumber(content)) {
			ArrayList<String> searchByIndex = studyImpl.searchByIndex(index);
			if (searchByIndex.size()>0) {
			return "数据库已经存在";
			}
			studyImpl.save(index, content);
			 searchByIndex = studyImpl.searchByIndex(index);
			if(searchByIndex!=null) {
			return "保存成功"; //
			}else {
				return "保存失败，xitongyichang"; 
			}
		} else {
			return "保存失败，不可以输入数字";
		}
	}

	public boolean checkNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			if (Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	

}