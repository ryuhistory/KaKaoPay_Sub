package com.ex.biz.model;

import java.math.BigDecimal;

public class SUB3VO {

	
	private String MNG_DTBR_CD;		//관리부팀점코드	
	private String MNG_DTBR_NM;		//관리부팀점명
	private BigDecimal R_TR_AMT;	//거래금액합계

	public String getMNG_DTBR_CD() {
		return MNG_DTBR_CD;
	}
	public void setMNG_DTBR_CD(String mNG_DTBR_CD) {
		MNG_DTBR_CD = mNG_DTBR_CD;
	}
	public String getMNG_DTBR_NM() {
		return MNG_DTBR_NM;
	}
	public void setMNG_DTBR_NM(String mNG_DTBR_NM) {
		MNG_DTBR_NM = mNG_DTBR_NM;
	}
	public BigDecimal getR_TR_AMT() {
		return R_TR_AMT;
	}
	public void setR_TR_AMT(BigDecimal r_TR_AMT) {
		R_TR_AMT = r_TR_AMT;
	}
	
	
	
	
}
