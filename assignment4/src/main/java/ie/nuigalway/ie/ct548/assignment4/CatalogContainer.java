package ie.nuigalway.ie.ct548.assignment4;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * @author Gerald Lyons
 *
 */
public class CatalogContainer {


	private ArrayList<Profile> profiles = new ArrayList<Profile>();
	private Set<Person> people = new TreeSet<Person>();
	private Set<Genre> genres = new TreeSet<Genre>();
	//private TreeSet<MediaItem> mediaitems = new TreeSet<MediaItem>();
	private ArrayList<MediaItem> mediaitems = new ArrayList<MediaItem>();
	//private Set<TvSeries> tvseries = new TreeSet<TvSeries>();
	private ArrayList<TvSeries> tvseries = new ArrayList<TvSeries>();
	//private Set<Film> films = new TreeSet<Film>();
	private ArrayList<Film> films = new ArrayList<Film>();
	//private String profileName;


	public ArrayList<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(ArrayList<Profile> profiles) {
		this.profiles = profiles;
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

	/*

	public Set<MediaItem> getMediaitems() {	
		mediaitems.addAll(tvseries);
		mediaitems.addAll(films);
		return mediaitems;
	}
	public void setMediaitems(Set<MediaItem> mediaitems) {
		this.mediaitems = mediaitems;
	}

	 */
	/*public Set<TvSeries> getTvseries() {
		return tvseries;
	}
	public void setTvseries(Set<TvSeries> tvseries) {
		this.tvseries = tvseries;
	}

	 */

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

	/*
	public Set<Film> getFilms() {
		return films;
	}
	public void setFilms(Set<Film> films) {
		this.films = films;

	}
	 */

	public ArrayList<MediaItem> getMediaitems() {
		mediaitems.addAll(tvseries);
		mediaitems.addAll(films);
		return mediaitems;
	}

	public void setMediaitems(ArrayList<MediaItem> mediaitems) {
		this.mediaitems = mediaitems;
	}



	@Override
	public String toString() {
		return "CatalogContainer [profiles=" + getProfiles() + "TvSeries" + getTvseries() + "Films" + getFilms() + "\n" + "Genre" + getGenres() + "\n" + "People" + getPeople();
	}

	//TODO media item if id = null, set id 
	public void addMediaItem(MediaItem m) {
		mediaitems.add(m);
	}


	public TreeMap<Year, MediaItem> sortby(){
		mediaitems.addAll(tvseries);
		mediaitems.addAll(films);

		TreeMap<Year, MediaItem> sorted = new TreeMap<Year, MediaItem>(Collections.reverseOrder());

		for(MediaItem m : mediaitems) {
			sorted.put(m.getYear(),m);
			System.out.println(m.getTitle());

		}

		return sorted;
	}


	public ArrayList<MediaItem> getAlpha() {

		ArrayList<MediaItem> titles = getMediaitems();
		titles.sort(new sorter());

		return titles;
	}


	public HashMap<String, ArrayList< MediaItem>> sortByG(){

		HashMap<String, ArrayList<MediaItem>> byGenre = new HashMap<String, ArrayList<MediaItem>>();
		for(MediaItem m : getAlpha()) {
	
			for(Genre currentGenre: m.getGenre()) {
				String genreTitle = currentGenre.getGenre();
				if(byGenre.containsKey(genreTitle)) {
					ArrayList<MediaItem> exsistingGenre = byGenre.get(genreTitle);
					exsistingGenre.add(m);
					byGenre.put(genreTitle, exsistingGenre);
				}
				else {
					ArrayList<MediaItem> newGenre = new ArrayList<MediaItem>();
					newGenre.add(m);
					byGenre.put(genreTitle, newGenre);
				}
			}

		}

		return byGenre;
	}

	public HashMap<String, MediaItem> sortByGenre(){
		mediaitems.addAll(tvseries);
		mediaitems.addAll(films);

		HashMap<String, MediaItem> byGenre = new HashMap<String, MediaItem>();
		for(MediaItem m : mediaitems) {
			for(Genre g : m.getGenre()) {
				byGenre.put(g.getGenre(),m);
			}


		}

		return byGenre;
	}

}

class sorter implements Comparator<MediaItem>{

	@Override
	public int compare(MediaItem o1, MediaItem o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}
