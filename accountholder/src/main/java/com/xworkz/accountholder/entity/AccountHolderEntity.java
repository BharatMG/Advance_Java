package com.xworkz.accountholder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account_number")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select e from AccountHolderEntity e"),
		@NamedQuery(name = "findByAccountType", query = "select en from AccountHolderEntity en where accountType=:name"),
		@NamedQuery(name = "findByEmail", query = "select ent from AccountHolderEntity ent where email=:name") })
public class AccountHolderEntity {

	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "a_firstName")
	private String firstName;
	@Column(name = "a_lastName")
	private String lastName;
	@Column(name = "a_email")
	private String email;
	@Column(name = "a_contactNumber")
	private long contactNumber;
	@Column(name = "a_dateOfBirth")
	private String dateOfBirth;
	@Column(name = "a_income")
	private double annualIncome;
	@Column(name = "a_address")
	private String address;
	@Column(name = "a_accountNumber")
	private long accountNumber;
	@Column(name = "a_accountType")
	private String accountType;
	@Column(name = "a_isOnline")
	private boolean isOnlineBanking;

	public AccountHolderEntity(String firstName, String lastName, String email, long contactNumber, String dateOfBirth,
			double annualIncome, String address, long accountNumber, String accountType, boolean isOnlineBanking) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.annualIncome = annualIncome;
		this.address = address;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.isOnlineBanking = isOnlineBanking;
	}
}
