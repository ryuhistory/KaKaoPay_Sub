package com.ex.biz.service;

import java.util.List;
import java.util.Map;

import com.ex.biz.model.SUB1VO;
import com.ex.biz.model.SUB2VO;
import com.ex.biz.model.SUB3VO;
import com.ex.biz.model.SUB4VO;

public interface KaKaoSubService {
	
	//subject1 - 2018,2019 연도별 합계금액이 가장 많은 고객 추출
	public List<SUB1VO> getYearAcno();
	
	//subject2 - 2018,2019 연도변 미거래 고객 조회
	public List<SUB2VO> getNExitCust();
	
	//subject3	 - 연도별 거래금액 합계 내역 : 거래내역에서 그룹바이 연도를 조회후 다시 거래내역 조회
	public Map<String, List<SUB3VO>> getYearTrSumCust();
	
	//subject4 - 관리지점  거래금액 합계
	public SUB4VO getSumTrAmtByDtbr(Map<String,String> formObject);
	
	
	
}
