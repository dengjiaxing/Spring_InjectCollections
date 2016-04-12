package com.djx.InjectCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollections {
	private Set<String> sets;
	private List<String> lists;
	private Map<String, String>maps;
	public Set<String> getSets() {
		return sets;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	@Override
	public String toString() {
		return "sets"+sets.toString()+"\nlists"+lists.toString()+"\nmaps"+maps.toString();
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		InjectCollections ic=(InjectCollections) ctx.getBean("injectCollections");
		System.out.println(ic);
	}
}
