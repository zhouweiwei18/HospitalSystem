package com.web.pojo;

public class UserAndPartment {

	/**
	 * 用户id
	 */
	private Integer userid;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String userpwd;

	/**
	 * 性别
	 */
	private String usersex;

	/**
	 * 头像
	 */
	private String userphoto;

	/**
	 * 卡片
	 */
	private String usercard;

	/**
	 * 出生日期
	 */
	private String birthday;

	/**
	 * 岗位编号
	 */
	private Integer postid;

	/**
	 * 用户状态
	 */
	private Integer state;

	/**
	 * 病区号
	 */
	private Integer icuid;

	/**
	 * 描述
	 */
	private String descc;

	/**
	 * 科室编号
	 */
	private Integer departmentid;

	/**
	 * 科室名称
	 */
	private String departmentname;

	/**
	 * 科室地址
	 */
	private String departmentaddress;

	/**
	 * 科室电话
	 */
	private String departmenttelephone;

	/**
	 * 删除
	 */
	private String delete;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUserphoto() {
		return userphoto;
	}

	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}

	public String getUsercard() {
		return usercard;
	}

	public void setUsercard(String usercard) {
		this.usercard = usercard;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getIcuid() {
		return icuid;
	}

	public void setIcuid(Integer icuid) {
		this.icuid = icuid;
	}

	public String getDescc() {
		return descc;
	}

	public void setDescc(String descc) {
		this.descc = descc;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentaddress() {
		return departmentaddress;
	}

	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}

	public String getDepartmenttelephone() {
		return departmenttelephone;
	}

	public void setDepartmenttelephone(String departmenttelephone) {
		this.departmenttelephone = departmenttelephone;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "UserAndPartment [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", usersex="
				+ usersex + ", userphoto=" + userphoto + ", usercard=" + usercard + ", birthday=" + birthday
				+ ", postid=" + postid + ", state=" + state + ", icuid=" + icuid + ", descc=" + descc
				+ ", departmentid=" + departmentid + ", departmentname=" + departmentname + ", departmentaddress="
				+ departmentaddress + ", departmenttelephone=" + departmenttelephone + ", delete=" + delete + "]";
	}

}
