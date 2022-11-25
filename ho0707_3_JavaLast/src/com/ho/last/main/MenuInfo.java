package com.ho.last.main;

public class MenuInfo {
	private String m_name;
	private int m_price;
	private String m_s_name;
	
	public MenuInfo() {
		// TODO Auto-generated constructor stub
	}

	public MenuInfo(String m_name, int m_price, String m_s_name) {
		super();
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_s_name = m_s_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_price() {
		return m_price;
	}

	public void setM_price(int m_price) {
		this.m_price = m_price;
	}

	public String getM_s_name() {
		return m_s_name;
	}

	public void setM_s_name(String m_s_name) {
		this.m_s_name = m_s_name;
	}
	
	
}
