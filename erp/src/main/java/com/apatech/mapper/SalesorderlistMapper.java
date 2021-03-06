package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Team;

public interface SalesorderlistMapper {
 List<Salesorderlist> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Salesorderlist WHERE sol_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String solId);

    int insert(Salesorderlist record);

    int insertSelective(Salesorderlist record);

    Salesorderlist selectByPrimaryKey(String solId);

    int updateByPrimaryKeySelective(Salesorderlist record);

    int updateByPrimaryKey(Salesorderlist record);
}