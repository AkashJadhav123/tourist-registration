package com.Touristregistration.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tourist 
{
	@Id
	private int id;
	private String  FirstName;
	private String LastName;
	private String Gender;
	private int Age;
	private String FromPlace;
	private int VisitDays;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getFromPlace() {
		return FromPlace;
	}


	public void setFromPlace(String fromPlace) {
		FromPlace = fromPlace;
	}


	public int getVisitDays() {
		return VisitDays;
	}


	public void setVisitDays(int visitDays) {
		VisitDays = visitDays;
	}

	public tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int visitDays) 
	{
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		Age = age;
		FromPlace = fromPlace;
		VisitDays = visitDays;
	}


	public tourist() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "tourist [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
				+ ", Age=" + Age + ", FromPlace=" + FromPlace + ", VisitDays=" + VisitDays + "]";
	}


	
	
	
	
	

}
