package com.ex.biz.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.biz.model.SUB1VO;
import com.ex.biz.model.SUB2VO;
import com.ex.biz.model.SUB3VO;
import com.ex.biz.model.SUB4VO;
import com.ex.biz.service.KaKaoSubService;

@Controller
public class KaKaoSubController {

	@Autowired
	KaKaoSubService mvkaKaoSubService;
	
	
	

	/**********************************************
	 * 
	 * 과제 1
	 * 
	 **********************************************/
	@ResponseBody
	@RequestMapping("/sub1") 
	public List<SUB1VO> getSub1VO() { 
		
		List<SUB1VO> lstSUB1VO = new ArrayList<SUB1VO>();
		lstSUB1VO = mvkaKaoSubService.getYearAcno();
		 return lstSUB1VO;
	}
	
	/**********************************************
	 * 
	 * 과제 2
	 * 
	 **********************************************/
	@ResponseBody
	@RequestMapping("/sub2") 
	public List<SUB2VO> getSub2VO() {
		
		List<SUB2VO> lstSUB2VO = new ArrayList<SUB2VO>();
		lstSUB2VO = mvkaKaoSubService.getNExitCust();
		return lstSUB2VO;
	}
	
	/**********************************************
	 * 
	 * 과제 3
	 * 
	 **********************************************/
	@ResponseBody
	@RequestMapping("/sub3") 
	public Map<String, List<SUB3VO>> getSub3VO() {
		
		Map<String, List<SUB3VO>> outputMap = new LinkedHashMap<String, List<SUB3VO>> ();
		
		outputMap = mvkaKaoSubService.getYearTrSumCust();
		return outputMap;
	}
	
	/**********************************************
	 * 
	 * 과제 4
	 * @throws Exception 
	 * 
	 **********************************************/
	@ResponseBody
	@RequestMapping("/sub4") 
	public SUB4VO getSub4VO() throws Exception {
		
		SUB4VO mvSUB4VO = new SUB4VO();
		Map<String,String> input = new HashMap<String,String>();
		input.put("BRNAME", "판교점");
		
		//input.put("BRNAME", "분당");
		
		mvSUB4VO = mvkaKaoSubService.getSumTrAmtByDtbr(input);
		return mvSUB4VO;
	}
	
	
	
}
