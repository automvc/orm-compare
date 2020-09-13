package org.teasoft.orm.compare.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
*@author Honey
*Create on 2020-03-02 16:36:20
*/
public class Orders implements Serializable {

	private static final long serialVersionUID = 1592204269178L;

	private Long id;
	private String userid;
	private String name;
	private BigDecimal total;
	private String remark;
	private String sequence;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	 public String toString(){	
		 StringBuffer str=new StringBuffer();	
		 str.append("Orders[");			
		 str.append("id=").append(id);		 
		 str.append(",userid=").append(userid);		 
		 str.append(",name=").append(name);		 
		 str.append(",total=").append(total);		 
		 str.append(",remark=").append(remark);		 
		 str.append(",sequence=").append(sequence);		 
		 str.append("]");			 
		 return str.toString();			 
	 }		 
}