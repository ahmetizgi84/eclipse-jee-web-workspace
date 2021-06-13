package week2Homework1;

public class Main {

	public static void main(String[] args) {
		
		Music music1 = new Music();
		music1.artist = "Dream Theater";
		music1.songName = "Honor Thy Father";
		music1.jenre = "Proggressive Metal";
		
		Music music2 = new Music();
		music2.artist = "Incubus";
		music2.songName = "Love Hurts";
		music2.jenre = "Alternative Rock";
		
		Music music3 = new Music();
		music3.artist = "Lacuna Coil";
		music3.songName = "Love Hurts";
		music3.jenre = "Our Truth";
		
		Music[] musics = {music1, music2, music3};
		
		System.out.println("__Playlist__");
		for (Music music : musics) {
			System.out.println(music.songName);
		}
		System.out.println("_____________");
		
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.play(music1);

	}

}
