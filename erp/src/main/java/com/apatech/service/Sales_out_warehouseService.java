package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.mapper.Sales_out_warehouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_out_warehouseService {
	@Autowired
	private Sales_out_warehouseMapper dao;
	
	public int deletelist(String id) {
		return dao.deletelist(id);
	}
	
	public int selectlist(String id,String sid) {
		return dao.selectlist(id, sid);
	}
	
	public PageInfo<Sales_out_warehouse> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_out_warehouse> list=dao.selectAll();

    	PageInfo<Sales_out_warehouse> page=new PageInfo<Sales_out_warehouse>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sowId){
    	return dao.deleteByPrimaryKey(sowId);
    }

    public int insert(Sales_out_warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_out_warehouse record){
    	return dao.insertSelective(record);
    }

    public Sales_out_warehouse selectByPrimaryKey(String sowId){
    	return dao.selectByPrimaryKey(sowId);
    }

    public int updateByPrimaryKeySelective(Sales_out_warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_out_warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}