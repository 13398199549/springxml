package org.framestudy.springxml.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.framestudy.springxml.bean.UserBean;

public class Configuration {

	private String [] strs;
	private List<?> list;
	private List<UserBean> users;
	private Set<?> set;
	private Map map;
	private Properties prop;
	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String[] getStrs() {
		return strs;
	}
	public void setStrs(String[] strs) {
		this.strs = strs;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	public Set<?> getSet() {
		return set;
	}
	public void setSet(Set<?> set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Configuration [strs=" + Arrays.toString(strs) + ", list=" + list + ", users=" + users + ", set=" + set
				+ ", map=" + map + ", prop=" + prop + "]";
	}
}
