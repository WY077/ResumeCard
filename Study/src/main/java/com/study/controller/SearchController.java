package com.study.controller;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.service.StudyImpl;

@Controller
public class SearchController {
	@Autowired
	StudyImpl studyImpl;
  
   @RequestMapping("/searchByIndex")
   @ResponseBody
	public ArrayList<String> searchByIndex(String index) {
	   
		ArrayList<String> searchByIndex = studyImpl.searchByIndex(index);
		return searchByIndex;	
	}
	
   @RequestMapping("/deleteByIndex")
   @ResponseBody 
    public String deleteByIndex(String index) {
	   studyImpl.shanchu(index);
	   return index ;
   }
   
   @RequestMapping("/updateByIndex")
   @ResponseBody 
    public void updateByIndex(String index,String wenben) {
	   studyImpl.genggai(index, wenben);

   }
}
