package com.bitcamp.app.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import lombok.Data;

@Data
@Component
public abstract class Proxy {
	List<?> list;
	Model model;
	public Proxy(Model model) {
		this.model=model;
		list=new ArrayList<>();
	}
	public abstract void execute(List<?> list);
}
