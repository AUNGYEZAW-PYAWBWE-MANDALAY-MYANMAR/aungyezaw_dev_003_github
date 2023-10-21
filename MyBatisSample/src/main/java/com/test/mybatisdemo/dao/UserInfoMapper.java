package com.test.mybatisdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.mybatisdemo.dto.UserAddRequest;
import com.test.mybatisdemo.dto.UserSearchRequest;
import com.test.mybatisdemo.dto.UserUpdateRequest;
import com.test.mybatisdemo.entity.UserInfo;

//SQL文を呼び出すためのDAOクラス
@Mapper
public interface UserInfoMapper {
	
	/*
	 * Search All User Information
	 * @param user Search request data
	 * @return search results
	 */
	List<UserInfo> findAll();
	
	
	/*
	 * Search UserInfo By ID
	 * @param id 
	 * return search result
	 */
	UserInfo findById(Long id);
	
	
	/*
	 * UserInfo Search
	 * @param user Search request data
	 * @return search results
	 */
	List<UserInfo> search(UserSearchRequest user);
	
	
	/*
	 * UserInfo Registration
	 * @param userRequest Registration request data
	 */
	void save(UserAddRequest userRequest);
	
	
	/**
     * UserInfo Update
     * @param userUpdateRequest
     */
    void update(UserUpdateRequest userUpdateRequest);
    
    
    /**
     * UserInfo DELETE
     * @param id ID
     */
    void delete(Long id);

}
