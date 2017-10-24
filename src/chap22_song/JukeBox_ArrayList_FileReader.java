package chap22_song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

// 화일에 있는 song.txt를 메모리 ArrayList에 저장
public class JukeBox_ArrayList_FileReader {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		JukeBox_ArrayList_FileReader juke = new JukeBox_ArrayList_FileReader();
		juke.go();
	}
	private void go() {
		getSong();
		
		System.out.println("원본순 : " + songList);
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
