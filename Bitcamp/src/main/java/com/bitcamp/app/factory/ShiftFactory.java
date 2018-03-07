package com.bitcamp.app.factory;

import org.springframework.stereotype.Component;

@Component
public class ShiftFactory extends Factory{

	@Override
	public Object create() {
		return null;
	}
	public String create(String p1,String p2) {
		return String.format("public:%s/%s.tiles", p1,p2);
	}
	public String redirect(String p1, String p2) {
		return String.format("redirect:/move/%s/%s", p1,p2);
	}
}
