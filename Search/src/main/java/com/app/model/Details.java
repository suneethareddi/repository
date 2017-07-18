package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
	@Table(name="details")
	public class Details {

		@Id
		@GeneratedValue
		@Column(name="employeeid",nullable=false)
		private int employeeid;
	    
		@Column(name="employeename",nullable=false)	
		private String employeename;
		
		@Column(name="emailid",nullable=false)
	    private String emailid;
		
		@Column(name="status",nullable=false)
		private String status;

		@DateTimeFormat(pattern="yyyy-mm-dd")
		@Column(name="regdate")
		private Date regdate;
		
		
		
		public int getEmployeeid() {
			return employeeid;
		}

		public void setEmployeeid(int employeeid) {
			this.employeeid = employeeid;
		}

		public String getEmployeename() {
			return employeename;
		}

		public void setEmployeename(String employeename) {
			this.employeename = employeename;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getRegdate() {
			return regdate;
		}

		public void setRegdate(Date regdate) {
			this.regdate = regdate;
		}
	}


