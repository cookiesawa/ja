package chap22_song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class JukeBox_TreeSet {
	ArrayList<Song> songList = new ArrayList<Song>();
	TreeSet<Song> songSet = new TreeSet<Song>();
	
	public static void main(String[] args) {
		JukeBox_TreeSet juke = new JukeBox_TreeSet();
		juke.go();
	}
	private void go() {
		getSong();
		System.out.println("원본데이터\n" + songList);
		
		songSet.addAll(songList);
		System.out.println("TreeSet 순 \n"+ songSet);
	}
	private void getSong() {
		try {
			File file = new File("Song.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				addSong(line);
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	private void addSong(String parseLine) {
		String[] tokens = parseLine.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
		System.out.println(nextSong.toString());
		
	}
}
