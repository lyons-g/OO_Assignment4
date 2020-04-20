package ie.nuigalway.ie.ct548.assignment4;

import java.util.HashSet;
import java.util.Set;

public class CatalogContainer {
	
	
	private Set<Profile> profiles = new HashSet<Profile>();
	private Set<People> peoples = new HashSet<People>();
	private Set<Genre> geners = new HashSet<Genre>();
	private Set<MediaItem> mediaitems = new HashSet<MediaItem>();
	private Set<TvSeries> tvseries = new HashSet<TvSeries>();
	private Set<Film> films = new HashSet<Film>();
	
	
	
	public Set<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}
	public Set<People> getPeoples() {
		return peoples;
	}
	public void setPeoples(Set<People> peoples) {
		this.peoples = peoples;
	}
	public Set<Genre> getGeners() {
		return geners;
	}
	public void setGeners(Set<Genre> geners) {
		this.geners = geners;
	}
	public Set<MediaItem> getMediaitems() {
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
	
	
	
	
}
