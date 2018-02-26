package com.bitcamp.app.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.app.controller.HomeController;
import com.bitcamp.app.domain.PathDTO;
import com.bitcamp.app.enums.Path;

//static 이 된다
@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory ContextFactory;
	@Autowired PathDTO path;
	@Override
	public Object create() {
//		ServletRequestAttributes o= (ServletRequestAttributes) RequestContextHolder
//				.currentRequestAttributes();
//		String o2=o.getRequest().getContextPath();
		//경로
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes()).getRequest().getContextPath();
	}
	public PathDTO path() {
		logger.info("ContextFactory path()");
		path.setContext((String)create());
		path.setCss(create()+Path.CSS.toString());
		path.setImg(create()+Path.IMG.toString());
		path.setJs(create()+Path.JS.toString());
//		초기
//		public PathDTO path(String tag) {
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
//		객체지향
//		}
		logger.info("경로 값은 {} 이다",create()+"/resources/");
		return path;	
	}
}
