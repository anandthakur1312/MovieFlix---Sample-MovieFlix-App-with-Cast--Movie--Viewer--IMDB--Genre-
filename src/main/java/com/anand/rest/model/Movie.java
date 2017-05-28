package com.anand.rest.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name="movie")
public class Movie {
		
		@Id
		@GenericGenerator(name = "customUUID", strategy = "uuid2")
		@GeneratedValue(generator ="customUUID")
		private String movieId;
		
		public String getMovieId() {
			return movieId;
		}

		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}

		@Column(unique = true)
		private String title;
		
		private int year;
		private String language;
		private String country;
		private String type;
		
				
		@LazyCollection(LazyCollectionOption.FALSE)
		@ManyToMany
		
		private List<Cast> cast;

		

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Cast> getCast() {
			return cast;
		}

		public void setCast(List<Cast> cast) {
			this.cast = cast;
		}

		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", title=" + title + ", year=" + year + ", language=" + language + ", country="
					+ country + ", type=" + type + ", cast=" + cast + "]";
		}
		

}
