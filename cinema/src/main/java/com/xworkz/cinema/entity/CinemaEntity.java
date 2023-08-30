package com.xworkz.cinema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="cinema_info")
@NamedQuery(name="readAll",query = "select entity from CinemaEntity entity")
public class CinemaEntity implements Serializable {
	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="c_director")
	private String director;
	
	@Column(name="c_producer")
	private String producer;
	
	@Column(name="music_director")
	private String musicDirector;
	
	@Column(name="c_hero")
	private String hero;
	
	@Column(name="c_heroine")
	private String heroine;
	
	@Column(name="c_choreographer")
	private String choreographer;
	
	@Column(name="c_budget")
	private double budget;
	
	@Column(name="num_songs")
	private int numberOfSongs;
	
	@Column(name="num_workers")
	private int numberOfWorkers;


	public CinemaEntity(String movieName, String director, String producer, String musicDirector, String hero,
			String heroine, String choreographer, double budget, int numberOfSongs, int numberOfWorkers) {
		this.id = id;
		this.movieName = movieName;
		this.director = director;
		this.producer = producer;
		this.musicDirector = musicDirector;
		this.hero = hero;
		this.heroine = heroine;
		this.choreographer = choreographer;
		this.budget = budget;
		this.numberOfSongs = numberOfSongs;
		this.numberOfWorkers = numberOfWorkers;
	}
	
}
