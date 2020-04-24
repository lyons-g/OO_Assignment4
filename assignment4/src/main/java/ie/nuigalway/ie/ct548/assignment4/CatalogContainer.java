package ie.nuigalway.ie.ct548.assignment4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class CatalogContainer {
	
	
	private Set<Profile> profiles = new TreeSet<Profile>();
	private Set<Person> people = new TreeSet<Person>();
	private Set<Genre> genres = new TreeSet<Genre>();
	private Set<MediaItem> mediaitems = new TreeSet<MediaItem>();
	private Set<TvSeries> tvseries = new TreeSet<TvSeries>();
	private Set<Film> films = new TreeSet<Film>();
	//private String profileName;

	public Set<Profile> getProfiles() {
		return profiles;
	}
		
	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}
	
	
	public void ProfileName(String profileName) {
		for(Profile e : profiles)
			profileName = e.getName();
		}

	
	public Set<Person> getPeople() {
		return people;
	}
	public void setPeople(Set<Person> people) {
		this.people = people;
	}
	public Set<Genre> getGenres() {
		return genres;
	}
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
	public Set<MediaItem> getMediaitems() {	
		mediaitems.addAll(tvseries);
		mediaitems.addAll(films);
		return mediaitems;
	}
	public void setMediaitems(Set<MediaItem> mediaitems) {
		this.mediaitems = mediaitems;
	}
	public Set<TvSeries> getTvseries() {
		return tvseries;
	}
	public void setTvseries(Set<TvSeries> tvseries) {
		this.tvseries = tvseries;
	}
	public Set<Film> getFilms() {
		return films;
	}
	public void setFilms(Set<Film> films) {
		this.films = films;
	}
	@Override
	public String toString() {
		return "CatalogContainer [profiles=" + getProfiles() + "TvSeries" + getTvseries() + "Films" + getFilms() + "\n" + "Genre" + getGenres() + "\n" + "People" + getPeople();
	}
	
	public void addMediaItem(MediaItem m) {
		mediaitems.add(m);
	}
	
	
	

}
