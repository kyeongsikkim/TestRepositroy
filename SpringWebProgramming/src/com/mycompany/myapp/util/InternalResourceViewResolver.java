package com.mycompany.myapp.util;


public class InternalResourceViewResolver {
	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {//set �̸��� set ������ ������ P�� �ҹ��ڷ��� prefix ��.
		System.out.println("InternalResourceViewResolver setPrefix("+ prefix+")");
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		System.out.println("InternalResourceViewResolver setPrefix("+ suffix+")");
		this.suffix = suffix;
	}
	
}
