package com.ex.biz.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.biz.controller.BrNotFoundException;
import com.ex.biz.dao.KaKaoSubDao;
import com.ex.biz.model.SUB1VO;
import com.ex.biz.model.SUB2VO;
import com.ex.biz.model.SUB3VO;
import com.ex.biz.model.SUB4VO;
import com.ex.biz.service.KaKaoSubService;

@Service
public class KaKaoSubImpl implements KaKaoSubService {

	
	
	@Autowired
	private KaKaoSubDao mvKaKaoSubDao;
	
	
	
	@Override
	public List<SUB1VO> getYearAcno(){
		
		List<SUB1VO> lstSUB1VO = new ArrayList<SUB1VO>();
		
      
        lstSUB1VO = mvKaKaoSubDao.getSub1VO();
		
       
		return lstSUB1VO;
	}
	
	//subject2 - 2018,2019 연도변 미거래 고객 조회
	@Override
	public List<SUB2VO> getNExitCust(){
		
	
		List<SUB2VO> lstSUB2VO = new ArrayList<SUB2VO>();

		lstSUB2VO = mvKaKaoSubDao.getSub2VO();
				
		return lstSUB2VO;
	}
	
	
		
	//subject3	 - 연도별 거래금액 합계 내역 : 거래내역에서 그룹바이 연도를 조회후 다시 거래내역 조회
	@Override
	public Map<String, List<SUB3VO>> getYearTrSumCust(){
		
		
		
		Map<String, List<SUB3VO>> outputMap = new LinkedHashMap<String, List<SUB3VO>> ();
		List<SUB3VO> lstSUB3VO = new ArrayList<SUB3VO>();
		
		Map<String,String> inputMap = new HashMap<String,String>();
		inputMap.put("BASE_YYYY","2018");
		lstSUB3VO = mvKaKaoSubDao.getSub3VO(inputMap);
		
		if(lstSUB3VO != null) {
			outputMap.put(inputMap.get("BASE_YYYY"), lstSUB3VO);
		}else {
			outputMap.put(inputMap.get("BASE_YYYY"), null);
		}
		
		inputMap = new HashMap<String,String>();
		inputMap.put("BASE_YYYY","2019");
		lstSUB3VO = mvKaKaoSubDao.getSub3VO(inputMap);
		
		if(lstSUB3VO != null) {
			outputMap.put(inputMap.get("BASE_YYYY"), lstSUB3VO);
		}else {
			outputMap.put(inputMap.get("BASE_YYYY"), null);
		}
		
		return outputMap;
	}
		
	//subject4 - 관리지점  거래금액 합계
	public SUB4VO getSumTrAmtByDtbr(Map<String,String> formObject) {

		SUB4VO output = new SUB4VO();
		List<SUB4VO> lstSUB4VO = new ArrayList<SUB4VO>();
		lstSUB4VO = mvKaKaoSubDao.getChkSub4VO(formObject);
		
		
		if(lstSUB4VO.size() != 1) {
			throw new BrNotFoundException();
		}
		
		output = mvKaKaoSubDao.getSub4VO(formObject);
		
		return output;
	}
}
