package com.ex.biz.dao;

import java.util.List;
import java.util.Map;

import com.ex.biz.model.SUB1VO;
import com.ex.biz.model.SUB2VO;
import com.ex.biz.model.SUB3VO;
import com.ex.biz.model.SUB4VO;

public interface KaKaoSubDao {
	List<SUB1VO>  getSub1VO();	//과제1
	List<SUB2VO>  getSub2VO();	//과제2
	List<SUB3VO>  getSub3VO(Map<String,String> formObject);	//과제3
	SUB4VO  	  getSub4VO(Map<String,String> formObject);	//과제4
	List<SUB4VO>  getChkSub4VO(Map<String,String> formObject);	//과제4_사전 Check
}
