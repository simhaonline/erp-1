package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check_detailed;
import com.apatech.mapper.Check_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Check_detailedService {
	@Autowired
	private Check_detailedMapper dao;
	
	public PageInfo<Check_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Check_detailed> list=dao.selectAll();

    	PageInfo<Check_detailed> page=new PageInfo<Check_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String cdId){
    	return dao.deleteByPrimaryKey(cdId);
    }

    public int insert(Check_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Check_detailed record){
    	return dao.insertSelective(record);
    }

    public Check_detailed selectByPrimaryKey(String cdId){
    	return dao.selectByPrimaryKey(cdId);
    }

    public int updateByPrimaryKeySelective(Check_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Check_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}