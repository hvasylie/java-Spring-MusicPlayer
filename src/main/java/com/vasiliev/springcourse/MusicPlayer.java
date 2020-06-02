package com.vasiliev.springcourse;

public class MusicPlayer {
    Music music;
    MusicPlayer(Music music) {
        this.music = music;
    }

    void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
