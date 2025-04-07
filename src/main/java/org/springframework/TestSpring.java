package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");

        // Music music= context.getBean("musicBean",Music.class)
        // MusicPlayer musicPlayer = new MusicPlayer(music)
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison =firstMusicPlayer == secondMusicPlayer;
     //   musicPlayer.playMusic();

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        //System.out.println(musicPlayer.getName())
        //System.out.println(musicPlayer.getVolume());
        System.out.println();
       context.close();
    }
}



