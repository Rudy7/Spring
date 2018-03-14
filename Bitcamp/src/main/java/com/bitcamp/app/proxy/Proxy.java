package com.bitcamp.app.proxy;

import org.springframework.ui.Model;

import lombok.Data;

@Data
public abstract class Proxy {
	public abstract void execute(Model model,Object object);
}
