package ie.nuigalway.ie.ct548.assignment4;

import java.util.ArrayList;


public class CatalogContainer {
	
	
	private ArrayList<Profile> profiles = new ArrayList<Profile>();
	private ArrayList<Person> people = new ArrayList<Person>();
	private ArrayList<Genre> genres = new ArrayList<Genre>();
	private ArrayList<MediaItem> mediaitems = new ArrayList<MediaItem>();
	private ArrayList<TvSeries> tvseries = new ArrayList<TvSeries>();
	private ArrayList<Film> films = new ArrayList<Film>();
	
	public ArrayList<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(ArrayList<Profile> profiles) {
		this.profiles = profiles;
	}
	public ArrayList<Person> getPeople() {
		return people;
	}
	public void setPeople(ArrayList<Person> person) {
		this.people = person;
	}
	public ArrayList<Genre> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<Genre> geners) {
		this.genres = geners;
	}
	public ArrayList<MediaItem> getMediaitems() {
		return mediaitems;
	}
	public void setMediaitems(ArrayList<MediaItem> mediaitems) {
		this.mediaitems = mediaitems;
	}
	public ArrayList<TvSeries> getTvseries() {
		return tvseries;
	}
	public void setTvseries(ArrayList<TvSeries> tvseries) {
		this.tvseries = tvseries;
	}
	public ArrayList<Film> getFilms() {
		return films;
	}
	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}
	@Override
	public String toString() {
		return "CatalogContainer [profiles=" + getProfiles() + "TvSeries" + getTvseries() + "Films" + getFilms() + "\n" + "Genre" + getGenres() + "\n" + "People" + getPeople();
	}
	
	
	
	
	
	
}
