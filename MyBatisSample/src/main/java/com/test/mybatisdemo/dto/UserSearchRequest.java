package com.test.mybatisdemo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
}
