package com.study.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.AnswerDao;
import com.study.domain.Answer;

@Service
public class StudyImpl implements StudyIService{

	 @Autowired
	 AnswerDao   answerDao;
	
	
	@Override
	public void save(String index, String content) {	
 	 
   	 answerDao.save(index, content);
   	 
	}


	@Override
	public ArrayList<String> searchByIndex(String index) {
	  ArrayList<String> searchByIndex = answerDao.searchByIndex(index);
	   return searchByIndex;
	}
    
	@Override
	public void shanchu(String index) {	
  
   	 answerDao.shanchu(index);
   	 
	}
	
	@Override
	public void genggai(String index, String content) {	

   	 answerDao.genggai(index, content);

	}
    		 

	
}

