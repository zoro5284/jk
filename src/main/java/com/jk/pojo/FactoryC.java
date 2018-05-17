package com.jk.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FACTORY_C database table.
 * 
 */
@Entity
@Table(name="FACTORY_C")
//@NamedQuery(name="FactoryC.findAll", query="SELECT f FROM FactoryC f")
public class FactoryC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FACTORY_ID")
	private String id;

	private String cnote;

	private String contacts;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DEPT")
	private String createDept;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="FACTORY_NAME")
	private String factoryName;

	private String fax;

	@Column(name="FULL_NAME")
	private String fullName;

	private String inspector;

	private String mobile;

	@Column(name="ORDER_NO")
	private BigDecimal orderNo;

	private String phone;

	public FactoryC() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCnote() {
		return this.cnote;
	}

	public void setCnote(String cnote) {
		this.cnote = cnote;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDept() {
		return this.createDept;
	}

	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getFactoryName() {
		return this.factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getInspector() {
		return this.inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public BigDecimal getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(BigDecimal orderNo) {
		this.orderNo = orderNo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}