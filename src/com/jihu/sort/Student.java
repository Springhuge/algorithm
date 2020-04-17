package com.jihu.sort;

import java.util.Comparator;

//定义一个学生类 具有年龄age和姓名username两个属性，并通过Comparable接口提供比较规则
public class Student implements Comparable<Student>{

	private String username;
	private Integer age;

	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

	

}
