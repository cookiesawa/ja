package chap22.song;
//tree는 정렬이 중요 hash는 검색속도가 중요
import java.io.*;
import java.util.*;

public class JukeBox_HashSet {
	ArrayList<Song> songList = new ArrayList<Song>();
	HashSet<Song> songset = new HashSet<Song>();
	
	public static void main(String[] args) {
		JukeBox_HashSet juke = new JukeBox_HashSet();
		juke.go();
	}
	
	private void go(){
		getSong();	
		System.out.println("원본데이터\n: " + songList);
		Collections.sort(songList);
		// HashSet으로 ArrayList 내용을 옮김
		songset.addAll(songList);
		System.out.println("HashSet 순 \n" + songset);
	}
	
	private void getSong() {
		try {
			File file = new File("song.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null; 
			while((line = reader.readLine()) != null) {
				addsong(line);
			}
		}catch( Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private void addsong(String parseLine) {
		String[] tokens = parseLine.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
		System.out.println(nextSong.toString());
	}

}