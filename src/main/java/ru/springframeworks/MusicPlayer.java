package ru.springframeworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    // IoC
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic ;
        this.rockMusic = rockMusic;
    }



    public String playMusic() {
    return "Playing"+ classicalMusic.getSong();

    }
}