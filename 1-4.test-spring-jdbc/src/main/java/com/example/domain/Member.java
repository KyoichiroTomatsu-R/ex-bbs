package com.example.domain;

/**
 * メンバー情報を表すドメイン.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	/** ID */
	private Integer id;
	/** 名前 */
	private String name;
	/** 年齢 */
	private Integer age;
	/** 部署ID */
	private Integer depId;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String name,Integer age,Integer depId) {
		this.name = name;
		this.age = age;
		this.depId = depId;
	
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer departmentId) {
		this.depId = departmentId;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", departmentId=" + depId + "]";
	}
	
	

}
