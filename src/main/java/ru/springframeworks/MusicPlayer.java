package ru.springframeworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {

    private Music music;
    private  Misic music2;
@Autowired
public  MusicPlayer(Music music1, Music music2)

    // IoC




    public String playMusic() {
    return "Playing"+ music.getSong();

    }
}