package com.xworkz.fashionfactory.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FashionFactoryDTO {

	private int id;
	@Size(min = 3,max = 30,message = "check the name length,min=3 and max=30")
	@NotBlank
	@NotNull
	private String customerName;
	@NotBlank
	@NotNull
	@Email(message = "check the @ ")
	private String emailId;
	private long mobileNumber;
	//@Size(min = 3,max = 30,message = "check the name length,min=3 and max=30")
	@NotBlank
	@NotNull
	private String address;

}
