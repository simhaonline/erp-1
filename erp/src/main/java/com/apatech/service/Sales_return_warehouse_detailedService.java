package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.mapper.Sales_return_warehouse_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_return_warehouse_detailedService {
	@Autowired
	private Sales_return_warehouse_detailedMapper dao;
	
	public PageInfo<Sales_return_warehouse_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_return_warehouse_detailed> list=dao.selectAll();

    	PageInfo<Sales_return_warehouse_detailed> page=new PageInfo<Sales_return_warehouse_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String srwdId){
    	return dao.deleteByPrimaryKey(srwdId);
    }

    public int insert(Sales_return_warehouse_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_return_warehouse_detailed record){
    	return dao.insertSelective(record);
    }

    public Sales_return_warehouse_detailed selectByPrimaryKey(String srwdId){
    	return dao.selectByPrimaryKey(srwdId);
    }

    public int updateByPrimaryKeySelective(Sales_return_warehouse_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_return_warehouse_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}