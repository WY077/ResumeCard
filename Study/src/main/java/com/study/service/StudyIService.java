package com.study.service;

import java.util.ArrayList;

public interface StudyIService {

	public void save(String index,String content);
	
	public ArrayList<String> searchByIndex(String index);
	
	public void shanchu(String index);

	public void genggai(String index, String content);
}


