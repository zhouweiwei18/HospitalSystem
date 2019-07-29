package com.web.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形节点对象
 * @author ASUS
 *
 */
public class TreeObj {

	private Integer  id;//主键
	private String name;//名字
	private String url;//访问地址
	private boolean open;//true:展开  false:折叠
	private Integer parentTId;//父节点
	private List<TreeObj> children = new ArrayList<>();//子节点
	private boolean checked;//true:被选中   false:未选中
	//private String icon;//图标
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public Integer getParentTId() {
		return parentTId;
	}
	public void setParentTId(Integer parentTId) {
		this.parentTId = parentTId;
	}
	public List<TreeObj> getChildren() {
		return children;
	}
	public void setChildren(List<TreeObj> children) {
		this.children = children;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	
	
	
}
