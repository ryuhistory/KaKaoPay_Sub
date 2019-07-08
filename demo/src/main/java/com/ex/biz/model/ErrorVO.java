package com.ex.biz.model;

public class ErrorVO {
	private String CODE;		//에러코드
	private String ERR_MSG;		//에러메시지	
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getERR_MSG() {
		return ERR_MSG;
	}
	public void setERR_MSG(String eRR_MSG) {
		ERR_MSG = eRR_MSG;
	}
}
