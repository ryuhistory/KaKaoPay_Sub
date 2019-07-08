package com.ex.biz.model;

import java.math.BigDecimal;

public class SUB1VO {
	
	
	private String YEAR;		//기준년월
	private String ACCTNO;		//계좌번호	
	private BigDecimal SUMAMT;	//거래금액합계
	
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getACCTNO() {
		return ACCTNO;
	}
	public void setACCTNO(String aCCTNO) {
		ACCTNO = aCCTNO;
	}
	public BigDecimal getSUMAMT() {
		return SUMAMT;
	}
	public void setSUMAMT(BigDecimal sUMAMT) {
		SUMAMT = sUMAMT;
	}
	
	
	
	
	
}
