package com.web.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * menu
 * @author 
 */
public class Menu implements Serializable {
    /**
     * 菜单id
     */
    private Integer menuid;

    /**
     * 菜单名
     */
    private String menuname;

    /**
     * URL
     */
    private String menuurl;

    /**
     * 菜单图像
     */
    private String menuimage;

    /**
     * 父母id
     */
    private Integer parentid;

    /**
     * 菜单等级
     */
    private Integer menulevel;

    /**
     * 菜单分类
     */
    private Integer menusort;

    /**
     * 菜单删除
     */
    private Integer menudelete;

    private static final long serialVersionUID = 1L;
    
    private List<Menu> childMenu = new ArrayList<>();//子菜单

    public List<Menu> getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(List<Menu> childMenu) {
		this.childMenu = childMenu;
	}

	public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getMenuimage() {
        return menuimage;
    }

    public void setMenuimage(String menuimage) {
        this.menuimage = menuimage;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(Integer menulevel) {
        this.menulevel = menulevel;
    }

    public Integer getMenusort() {
        return menusort;
    }

    public void setMenusort(Integer menusort) {
        this.menusort = menusort;
    }

    public Integer getMenudelete() {
        return menudelete;
    }

    public void setMenudelete(Integer menudelete) {
        this.menudelete = menudelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
            && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
            && (this.getMenuurl() == null ? other.getMenuurl() == null : this.getMenuurl().equals(other.getMenuurl()))
            && (this.getMenuimage() == null ? other.getMenuimage() == null : this.getMenuimage().equals(other.getMenuimage()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getMenulevel() == null ? other.getMenulevel() == null : this.getMenulevel().equals(other.getMenulevel()))
            && (this.getMenusort() == null ? other.getMenusort() == null : this.getMenusort().equals(other.getMenusort()))
            && (this.getMenudelete() == null ? other.getMenudelete() == null : this.getMenudelete().equals(other.getMenudelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getMenuurl() == null) ? 0 : getMenuurl().hashCode());
        result = prime * result + ((getMenuimage() == null) ? 0 : getMenuimage().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getMenulevel() == null) ? 0 : getMenulevel().hashCode());
        result = prime * result + ((getMenusort() == null) ? 0 : getMenusort().hashCode());
        result = prime * result + ((getMenudelete() == null) ? 0 : getMenudelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuid=").append(menuid);
        sb.append(", menuname=").append(menuname);
        sb.append(", menuurl=").append(menuurl);
        sb.append(", menuimage=").append(menuimage);
        sb.append(", parentid=").append(parentid);
        sb.append(", menulevel=").append(menulevel);
        sb.append(", menusort=").append(menusort);
        sb.append(", menudelete=").append(menudelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}