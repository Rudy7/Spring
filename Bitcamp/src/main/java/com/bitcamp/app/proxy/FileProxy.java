package com.bitcamp.app.proxy;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileProxy extends Proxy{
	private MultipartFile file;
	private List<MultipartFile> flist;
	@Override
	public void execute(Model model, Object object) {
		// TODO Auto-generated method stub
		
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public List<MultipartFile> getFlist() {
		return flist;
	}
	public void setFlist(List<MultipartFile> flist) {
		this.flist = flist;
	}
	
	
	
}
