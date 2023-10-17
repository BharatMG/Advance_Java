package com.xworkz.fashionfactory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Table(name = "Fashion_info")
@NamedQueries({ @NamedQuery(name = "readAll", query = "select e from FashionFactoryEntity e"),
		@NamedQuery(name = "readByEmail", query = "select e from FashionFactoryEntity e where e.emailId=:email")
/*
 * @NamedQuery(name = "updateByEmail", query =
 * "update FashionFactoryEntity e set e.customerName=:nm, e.address=:add where e.emailId=:email"
 * )
 */
  })
public class FashionFactoryEntity extends Object {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String customerName;
	private String emailId;
	private long mobileNumber;
	private String address;
}
