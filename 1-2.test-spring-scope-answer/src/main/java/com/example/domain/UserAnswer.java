package com.example.domain;

/**
 * ユーザ情報を表すドメイン.
 * 
 * @author igamasayuki
 *
 */
public class UserAnswer {
	/** 名前 */
	private String name;
	/** メールアドレス */
	private String email;
	/** 年齢 */
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
