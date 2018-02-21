package com.bitcamp.app.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.app.controller.HomeController;

//static 이 된다
@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public Object create() {
//		ServletRequestAttributes o= (ServletRequestAttributes) RequestContextHolder
//				.currentRequestAttributes();
//		String o2=o.getRequest().getContextPath();
		//경로
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes()).getRequest().getContextPath();
	}
	public String path(String tag) {
		logger.info("ContextFactory path()에 넘어온 tag 값은 {} 이다",tag);
//		String path="/resources/";
//		switch (tag) {
//		case "js":
//			path+="js";
//			break;
//		case "css":
//			path+="css";
//			break;
//		case "img":
//			path+="img";
//			break;
//		default:
//			path="";
//			break;
//		}
		logger.info("경로 값은 {} 이다",create()+"/resources/"+tag);
		return create()+"/resources/"+tag;	
	}
}
