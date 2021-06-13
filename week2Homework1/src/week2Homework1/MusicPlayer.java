package week2Homework1;

public class MusicPlayer {
	
	public void play(Music music) {
		System.out.println(music.songName + " playing...");
	}
	
	public void pause(Music music) {
		System.out.println(music.songName + " paused.");
	}
	
	public void stop(Music music) {
		System.out.println(music.songName + " stopped!");
	}
	
}
