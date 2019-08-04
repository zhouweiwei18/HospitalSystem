package com.web.entity;

import java.io.Serializable;

/**
 * chargestatus
 * 
 * @author
 */
public class Chargestatus implements Serializable {
	/**
	 * 收费号
	 */
	private Integer chargestatusid;

	/**
	 * 收费项目号
	 */
	private Integer chargeitemno;

	/**
	 * 收费金额
	 */
	private Integer chargeamount;

	/**
	 * 结账金额
	 */
	private Double settleamount;

	/**
	 * 收款员
	 */
	private Integer cashier;

	/**
	 * 病人id
	 */
	private Integer patientid;

	/**
	 * 结账情况
	 */
	private String checkoutstatus;

	/**
	 * 是否转账
	 */
	private String istransfer;

	private Chargeitem chargeitem;

	private User user;

	private static final long serialVersionUID = 1L;

	public Chargeitem getChargeitem() {
		return chargeitem;
	}

	public void setChargeitem(Chargeitem chargeitem) {
		this.chargeitem = chargeitem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getChargestatusid() {
		return chargestatusid;
	}

	public void setChargestatusid(Integer chargestatusid) {
		this.chargestatusid = chargestatusid;
	}

	public Integer getChargeitemno() {
		return chargeitemno;
	}

	public void setChargeitemno(Integer chargeitemno) {
		this.chargeitemno = chargeitemno;
	}

	public Integer getChargeamount() {
		return chargeamount;
	}

	public void setChargeamount(Integer chargeamount) {
		this.chargeamount = chargeamount;
	}

	public Double getSettleamount() {
		return settleamount;
	}

	public void setSettleamount(Double settleamount) {
		this.settleamount = settleamount;
	}

	public Integer getCashier() {
		return cashier;
	}

	public void setCashier(Integer cashier) {
		this.cashier = cashier;
	}

	public Integer getPatientid() {
		return patientid;
	}

	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}

	public String getCheckoutstatus() {
		return checkoutstatus;
	}

	public void setCheckoutstatus(String checkoutstatus) {
		this.checkoutstatus = checkoutstatus;
	}

	public String getIstransfer() {
		return istransfer;
	}

	public void setIstransfer(String istransfer) {
		this.istransfer = istransfer;
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
		Chargestatus other = (Chargestatus) that;
		return (this.getChargestatusid() == null ? other.getChargestatusid() == null
				: this.getChargestatusid().equals(other.getChargestatusid()))
				&& (this.getChargeitemno() == null ? other.getChargeitemno() == null
						: this.getChargeitemno().equals(other.getChargeitemno()))
				&& (this.getChargeamount() == null ? other.getChargeamount() == null
						: this.getChargeamount().equals(other.getChargeamount()))
				&& (this.getSettleamount() == null ? other.getSettleamount() == null
						: this.getSettleamount().equals(other.getSettleamount()))
				&& (this.getCashier() == null ? other.getCashier() == null
						: this.getCashier().equals(other.getCashier()))
				&& (this.getPatientid() == null ? other.getPatientid() == null
						: this.getPatientid().equals(other.getPatientid()))
				&& (this.getCheckoutstatus() == null ? other.getCheckoutstatus() == null
						: this.getCheckoutstatus().equals(other.getCheckoutstatus()))
				&& (this.getIstransfer() == null ? other.getIstransfer() == null
						: this.getIstransfer().equals(other.getIstransfer()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getChargestatusid() == null) ? 0 : getChargestatusid().hashCode());
		result = prime * result + ((getChargeitemno() == null) ? 0 : getChargeitemno().hashCode());
		result = prime * result + ((getChargeamount() == null) ? 0 : getChargeamount().hashCode());
		result = prime * result + ((getSettleamount() == null) ? 0 : getSettleamount().hashCode());
		result = prime * result + ((getCashier() == null) ? 0 : getCashier().hashCode());
		result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
		result = prime * result + ((getCheckoutstatus() == null) ? 0 : getCheckoutstatus().hashCode());
		result = prime * result + ((getIstransfer() == null) ? 0 : getIstransfer().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", chargestatusid=").append(chargestatusid);
		sb.append(", chargeitemno=").append(chargeitemno);
		sb.append(", chargeamount=").append(chargeamount);
		sb.append(", settleamount=").append(settleamount);
		sb.append(", cashier=").append(cashier);
		sb.append(", patientid=").append(patientid);
		sb.append(", checkoutstatus=").append(checkoutstatus);
		sb.append(", istransfer=").append(istransfer);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}