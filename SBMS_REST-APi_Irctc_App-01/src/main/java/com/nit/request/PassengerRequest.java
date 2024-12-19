package com.nit.request;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@XmlRootElement
public class PassengerRequest {

	private String  name;
	private String dob;
	private String gender;
	private String from;
	private String to;
	private String trainNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	@Override
	public String toString() {
		return "PassengerRequest [name=" + name + ", dob=" + dob + ", gender=" + gender + ", from=" + from + ", to="
				+ to + ", trainNo=" + trainNo + ", getName()=" + getName() + ", getDob()=" + getDob() + ", getGender()="
				+ getGender() + ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getTrainNo()=" + getTrainNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
