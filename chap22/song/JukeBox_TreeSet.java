package chap22.song;
// 중복제거 오류남.*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class JukeBox_TreeSet {
	ArrayList<Song> songList = new ArrayList<Song>();
	TreeSet<Song> songset = new TreeSet<Song>();
	
	public static void main(String[] args) {
		JukeBox_TreeSet juke = new JukeBox_TreeSet();
		juke.go();
	}
	
	private void go() {
		getSong();	
		System.out.println("원본데이터\n: " + songList);
		
		songset.addAll(songList);
		System.out.println("TreeSet 순 \n" + songset);
	}
	
	private void getSong() {
		try {
			File file = new File("song.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null; //zero, 0 이 안된다.
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