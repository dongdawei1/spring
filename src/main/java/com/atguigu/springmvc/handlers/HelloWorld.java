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
	 * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹配， 自动为该对象填充属性值。支持级联属性。
	 * 如：dept.deptId、dept.address.tel 等
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo: " + user);
		return SUCCESS;
	}
	
	
	
	/**
	 * 了解:
	 * 
	 * @CookieValue: 映射一个 Cookie 值. 属性同 @RequestParam
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("testCookieValue: sessionId: " + sessionId);
		return SUCCESS;
	}

	
	
	/**
	 * 了解: 映射请求头信息 用法同 @RequestParam
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(
			@RequestHeader(value = "Accept-Language") String al,@RequestHeader(value="Cookie") String statuscode) {
		System.out.println("testRequestHeader, Accept-Language: " + al +" "+statuscode) ;
		return SUCCESS;
	}
	
	/**
	 * 了解: 映射请求中带的参数
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
 * 使用method 属性来指定请求方式
 */
	@RequestMapping(value = "/testMethodbb", method = RequestMethod.POST)
	public String testMethodbb() {
		System.out.println("testMethodddd");
		return "success";
	}
	

//	请求到web.xml 转到这里	
@RequestMapping("/helloworldaa")
      public String helloworldaa() {
	
	System.out.println("HelloWorld");
	return "success";
	
}
}
