package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springmvc.entities.User;
@RequestMapping("/springmvc")
@Controller                  
public class HelloWorld {
	public static final  String SUCCESS="success";
	
	
	/**
	 * Spring MVC �ᰴ����������� POJO �����������Զ�ƥ�䣬 �Զ�Ϊ�ö����������ֵ��֧�ּ������ԡ�
	 * �磺dept.deptId��dept.address.tel ��
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo: " + user);
		return SUCCESS;
	}
	
	
	
	/**
	 * �˽�:
	 * 
	 * @CookieValue: ӳ��һ�� Cookie ֵ. ����ͬ @RequestParam
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("testCookieValue: sessionId: " + sessionId);
		return SUCCESS;
	}

	
	
	/**
	 * �˽�: ӳ������ͷ��Ϣ �÷�ͬ @RequestParam
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(
			@RequestHeader(value = "Accept-Language") String al,@RequestHeader(value="Cookie") String statuscode) {
		System.out.println("testRequestHeader, Accept-Language: " + al +" "+statuscode) ;
		return SUCCESS;
	}
	
	/**
	 * �˽�: ӳ�������д��Ĳ���
	 */
	@RequestMapping(value = "/testRequestParam")
	public String testRequestParam(
			@RequestParam(value = "username") String un,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam, username: " + un + ", age: "
				+ age);
		return SUCCESS;
	}
	
	
/**
 * ʹ��method ������ָ������ʽ
 */
	@RequestMapping(value = "/testMethodbb", method = RequestMethod.POST)
	public String testMethodbb() {
		System.out.println("testMethodddd");
		return "success";
	}
	

//	����web.xml ת������	
@RequestMapping("/helloworldaa")
      public String helloworldaa() {
	
	System.out.println("HelloWorld");
	return "success";
	
}
}
