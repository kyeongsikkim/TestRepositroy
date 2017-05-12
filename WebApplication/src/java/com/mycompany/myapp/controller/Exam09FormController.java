package com.mycompany.myapp.controller;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Exam09FormController {
	@RequestMapping(value="/form/exam01",method=RequestMethod.GET)
	public String joinForm(){
		return "form/exam01";
	}
	@RequestMapping(value="/form/exam01",method=RequestMethod.POST)
	public String join(String mid,String mname,String mpassword,
			@RequestParam(defaultValue="0",required = true)int mage,String[]mskill,String mbirth){//@RequestParm
		System.out.println("mid"+mid);
		System.out.println("mname"+mname);
		System.out.println("mpassword"+mpassword);
		System.out.println("mage"+mage);
		System.out.println("mskill"+Arrays.toString(mskill));
		System.out.println("mbirth"+mbirth);
		
		return "form/exam01";
	}
	@RequestMapping(value="/form/exam02",method=RequestMethod.GET)
	public String joinForm2(){
		return "form/exam02";
	}
	@RequestMapping(value="/form/exam02",method=RequestMethod.POST)
	public String join2(String mid,String mname,String mpassword,
			@RequestParam(defaultValue="0",required = true)int mage,String[]mskill,String mbirth,MultipartFile attach){
		String fileName=attach.getOriginalFilename();
		String contentType=attach.getContentType();
		long filesize=attach.getSize();
		
		System.out.println("fileName"+fileName);
		System.out.println("contentType"+contentType);
		System.out.println("filesize"+filesize);
		
		return "form/exam02";
	}
}
