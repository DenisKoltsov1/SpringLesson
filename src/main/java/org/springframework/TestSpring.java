package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");

        // Music music= context.getBean("musicBean",Music.class)
        // MusicPlayer musicPlayer = new MusicPlayer(music)
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
       context.close();
    }
}



