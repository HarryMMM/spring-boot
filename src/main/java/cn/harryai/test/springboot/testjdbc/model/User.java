package cn.harryai.test.springboot.testjdbc.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Harry
 * @since 2020/01/05 22:32
 **/
public class User implements BeanPostProcessor {
	private int id;

	private String name;
	private int age;
	private String sex;

	public User() {
	}

	public User(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public User(int id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				'}';
	}
}
