package chap22_song;

public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	public Song(String title, String artist, String rating, String bpm) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + "]";
	}

	@Override
	public int compareTo(Song one) {
		return this.title.compareTo(one.getTitle());
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Song song = (Song)obj;
		return title.equals(song.getTitle());
	}
	
	

}
