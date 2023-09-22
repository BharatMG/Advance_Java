package com.xworkz.college.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "collegeinfo")
@NamedQuery(name = "readAll", query = "select d from CollegeDto d")
public class CollegeDto {

	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "c_name")
	private String name;

	@Column(name = "c_location")
	private String location;

	@Column(name = "c_noOfStudents")
	private String noOfStudents;

	@Column(name = "c_noOfStaffs")
	private String noOfStaffs;

	public CollegeDto(String name, String location, String noOfStudents, String noOfStaffs) {
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.noOfStaffs = noOfStaffs;
	}
}
