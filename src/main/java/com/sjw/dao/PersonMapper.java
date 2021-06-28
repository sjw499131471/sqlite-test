/**
 * 
 */
package com.sjw.dao;

import java.util.List;
import java.util.Map;

import com.sjw.model.Person;

/**
 * @author sjw
 * 2021年3月26日
 */
public interface PersonMapper {
	int insert(Person person) throws Exception;
	List<Person> selectList(Map<String, Object> map) throws Exception;
	int selectCount(Map<String, Object> map) throws Exception;
}
