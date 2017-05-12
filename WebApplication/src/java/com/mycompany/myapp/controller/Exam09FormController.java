package com.mycompany.myapp.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletContext;
import org.apache.catalina.tribes.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Exam09FormController {
	@Autowired
	private ServletContext servletContext;
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
			@RequestParam(defaultValue="0",required = true)int mage,String[]mskill,String mbirth,MultipartFile attach) throws IOException{
		//파일의 정보 얻기
		String fileName=attach.getOriginalFilename();
		String contentType=attach.getContentType();
		long filesize=attach.getSize();
		//파일을 서버 하드디스크에 저장 개발할때 
		String realPath =servletContext.getRealPath("/WEB-INF/upload/"+fileName);//내가upload 과 파일이름을 줄테니 경로를 찾아라
		//File file=new File("D:\\IoTCourse\\GitRepository\\TestRepositroy\\WebApplication\\web\\WEB-INF\");안된다
		File file=new File(realPath);//실제 저장될 경로를 넣어줘야한다. 운영체제마다 다르다 개발자마다 다르다 어디서 시작하는지 동적으로 알아낸다.

		attach.transferTo(file);
		System.out.println("fileName"+fileName);
		System.out.println("contentType"+contentType);
		System.out.println("filesize"+filesize);
		
		return "form/exam02";
	}
}
