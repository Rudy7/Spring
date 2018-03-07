package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserPhoneDTO {
	private String phoneid,pseq,mid,phonenum,telecom;
}
