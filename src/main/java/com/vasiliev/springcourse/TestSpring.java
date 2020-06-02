package com.vasiliev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = content.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        musicPlayer.playMusic();
        MusicPlayer musicPlayer = content.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        content.close();
    }
}
