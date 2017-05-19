package com.mycompany.myapp.util;


public class InternalResourceViewResolver {
	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {//set 이름은 set 다음에 나오는 P를 소문자로한 prefix 다.
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
