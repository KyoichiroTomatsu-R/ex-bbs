package com.example.domain;

import java.util.List;

/**
 * メンバー情報を表すドメインクラス.
 * 
 * @author igamasayuki
 *
 */
public class MemberAnswer {
	/** 名前 */
	private String name;
	/** 年齢 */
	private Integer age;
	/** 趣味リスト */
	private List<String> hobbyList;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getHobbyList() {
		return hobbyList;
	}
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
}
