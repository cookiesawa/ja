package chap22_song;

import java.io.*;
import java.util.*;

public class JukeBox_HashSet {
	ArrayList<Song> songList = new ArrayList<Song>();
	TreeSet<Song> songSet = new TreeSet<Song>();
	
	public static void main(String[] args) {
		JukeBox_HashSet juke = new JukeBox_HashSet();
		juke.go();
	}
	private void go() {
		getSong();
		System.out.println("원본데이터\n" + songList);
		Collections.sort(songList);
		// HashSet으로 Array List내용을 옮김_set은 중복이 안되는 것 + 정렬도 안됌
		// title로 검색할 때 가장 빨리 찾을 수 있음(검색 속도 빠름)
		songSet.addAll(songList);
		System.out.println("HashSet 순\n" + songSet);
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
