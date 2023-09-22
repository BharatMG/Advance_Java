package com.xworkz.airpods.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "a_info")
@NamedQueries({ @NamedQuery(name = "deleteByPrice", query = "Delete from AirpodsDto dto where dto.price=:pr"),
		@NamedQuery(name = "updateColorbyName", query = "Update AirpodsDto dto set dto.color=:col where dto.brandName=:nm"),
		@NamedQuery(name = "readAll", query = "select read from AirpodsDto read") })
public class AirpodsDto {

	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "a_brandName")
	private String brandName;

	@Column(name = "a_price")
	private int price;

	@Column(name = "a_color")
	private String color;

	@Column(name = "a_batteryBackup")
	private int batteryBackup;

	public AirpodsDto(String brandName, int price, String color, int batteryBackup) {
		this.brandName = brandName;
		this.price = price;
		this.color = color;
		this.batteryBackup = batteryBackup;
	}
}
