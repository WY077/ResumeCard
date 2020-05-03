package com.study.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper()
public interface AnswerDao {
	public void save(@Param(value = "index") String index,@Param(value = "content") String content);
	
	public ArrayList<String> searchByIndex(@Param(value = "index")String index);
	
	public void shanchu(@Param(value = "index") String index);
	
	public void genggai(@Param(value = "index") String index,@Param(value = "content") String content);
}




