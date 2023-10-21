package com.test.mybatisdemo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UserInfo  implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String address;
	private String phone;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
	private String test;
	
}
