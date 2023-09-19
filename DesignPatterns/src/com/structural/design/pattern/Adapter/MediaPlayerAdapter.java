package com.structural.design.pattern.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {

	AdvanceMediaPlayer advaneMusicPlayer;

	public MediaPlayerAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("mp4"))
			 advaneMusicPlayer=new Mp4Player();
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp4"))
			advaneMusicPlayer.playMp4(fileName);
	}

}
