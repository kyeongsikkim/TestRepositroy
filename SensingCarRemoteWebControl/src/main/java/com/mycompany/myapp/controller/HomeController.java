package com.mycompany.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home(Model model) {
		CoapClient coapClient = new CoapClient();
		JSONObject jsonObject = null;
		String json = null;
		CoapResponse coapResponse = null;
		
		//---------------------카메라-----------------------------
		jsonObject = new JSONObject();
		jsonObject.put("command", "status");
		json = jsonObject.toString();
		coapClient.setURI("coap://192.168.3.34/camera");
		coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
		json = coapResponse.getResponseText();
		jsonObject = new JSONObject(json);
		model.addAttribute("leftright", jsonObject.getString("leftright"));
		model.addAttribute("updown", jsonObject.getString("updown")); 
		
		//---------------------------rgbled----------------------------
		jsonObject = new JSONObject();
		jsonObject.put("command", "status");
		json = jsonObject.toString();
		coapClient.setURI("coap://192.168.3.34/rgbled");
		coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
		json = coapResponse.getResponseText();
		jsonObject = new JSONObject(json);
		model.addAttribute("red", jsonObject.getString("red"));
		model.addAttribute("green", jsonObject.getString("green"));
		model.addAttribute("blue", jsonObject.getString("blue"));
		
		//----------------------------------laser--------------------------------------------------------
		jsonObject = new JSONObject();
		jsonObject.put("command", "status");
		json = jsonObject.toString();
		coapClient.setURI("coap://192.168.3.34/laseremitter");
		coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
		json = coapResponse.getResponseText();
		jsonObject = new JSONObject(json);
		model.addAttribute("laseremitterStatus", jsonObject.getString("status"));
		//model.addAttribute("cameraUrl", "http://192.168.3.9:50001?action=stream");
		coapClient.shutdown();
		
		//------------------------------ultrasonicsensor------------------------------------------------
		jsonObject = new JSONObject();
		jsonObject.put("command", "status");
		json = jsonObject.toString();
		coapClient.setURI("coap://192.168.3.34/ultrasonicsensor");
		coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
		json = coapResponse.getResponseText();
		jsonObject = new JSONObject(json);
		model.addAttribute("ultrasonicsensorAngle", jsonObject.getString("angle"));
		model.addAttribute("ultrasonicsensorDistance", jsonObject.getString("distance"));
		//model.addAttribute("cameraUrl", "http://192.168.3.9:50001?action=stream");
		coapClient.shutdown();
		
		//---------------------LCD----------------------------------
				jsonObject = new JSONObject();
				jsonObject.put("command", "status");
				json = jsonObject.toString();
				coapClient.setURI("coap://192.168.3.34/lcd");
				coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
				json = coapResponse.getResponseText();
				jsonObject = new JSONObject(json);
				model.addAttribute("lcdline0", jsonObject.getString("line0"));	
				model.addAttribute("lcdline1", jsonObject.getString("line1"));
				
				
				//model.addAttribute("cameraUrl", "http://192.168.3.9:50001?action=stream");
				coapClient.shutdown();
		//--------------frontTire----------------------------------------------------
				jsonObject = new JSONObject();
				jsonObject.put("command", "status");
				json = jsonObject.toString();
				coapClient.setURI("coap://192.168.3.34/fronttire");
				coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
				json = coapResponse.getResponseText();
				jsonObject = new JSONObject(json);
				model.addAttribute("fronttireAngle", jsonObject.getString("angle"));
		//---------------backTire-----------------------------------------------------
				jsonObject = new JSONObject();
				jsonObject.put("command", "status");
				json = jsonObject.toString();
				coapClient.setURI("coap://192.168.3.34/backtire");
				coapResponse = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
				json = coapResponse.getResponseText();
				jsonObject = new JSONObject(json);
				model.addAttribute("backtireSpeed",jsonObject.getString("speed"));
				model.addAttribute("backtireDirection",jsonObject.getString("direction"));
				return "controlpanel";
		
	}
	
	
	@RequestMapping("/camera")
	public void camera(String command, String leftright, String updown, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("leftright", leftright);
		jsonObject.put("updown", updown);
		String reqJson = jsonObject.toString();
		
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/camera");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
	@RequestMapping("/rgbled")
	public void rgbled(String command, String red, String green, String blue, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("red", red);
		jsonObject.put("green", green);
		jsonObject.put("blue", blue);
		String reqJson = jsonObject.toString();
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/rgbled");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
	@RequestMapping("/laseremitter")
	public void laseremitter(String command,String status,HttpServletResponse response) throws IOException{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("status", status);
		String reqJson = jsonObject.toString();
		logger.info(reqJson);
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/laseremitter");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
	@RequestMapping("/ultrasonicsensor")
	public void ultrasonicsensor(String command, String angle, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("angle", angle);
		String reqJson = jsonObject.toString();
		
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/ultrasonicsensor");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
	
	@RequestMapping("/lcd")
	public void lcd(String command, String line0, String line1, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("line0", line0);
		jsonObject.put("line1", line1);
		String reqJson = jsonObject.toString();
		
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/lcd");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}		
	@RequestMapping("/fronttire")
	public void fronttire(String command, String angle, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("angle", angle);
		String reqJson = jsonObject.toString();
		
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/fronttire");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
	@RequestMapping("/backtire")
	public void backtire(String command, String speed,String direction, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("command", command);
		jsonObject.put("speed", speed);
		jsonObject.put("direction", direction);
		
		String reqJson = jsonObject.toString();
		
		CoapClient coapClient = new CoapClient();
		coapClient.setURI("coap://192.168.3.34/backtire");
		CoapResponse coapResponse = coapClient.post(reqJson, MediaTypeRegistry.APPLICATION_JSON);
		String resJson = coapResponse.getResponseText();
		coapClient.shutdown();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(resJson);
		pw.flush();
		pw.close();
	}
}


