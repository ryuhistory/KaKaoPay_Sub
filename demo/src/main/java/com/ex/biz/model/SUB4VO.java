package com.ex.biz.model;

import java.math.BigDecimal;

public class SUB4VO {
	
	

	private String BRNAME;		//관리점명
	private String BRCODE;		//관리점코드	
	private BigDecimal SUMAMT;	//거래금액합계
	public String getBRNAME() {
		return BRNAME;
	}
	public void setBRNAME(String bRNAME) {
		BRNAME = bRNAME;
	}
	public String getBRCODE() {
		return BRCODE;
	}
	public void setBRCODE(String bRCODE) {
		BRCODE = bRCODE;
	}
	public BigDecimal getSUMAMT() {
		return SUMAMT;
	}
	public void setSUMAMT(BigDecimal sUMAMT) {
		SUMAMT = sUMAMT;
	}
	
	
	
	
	
	
}
