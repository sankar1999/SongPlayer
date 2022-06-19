package com.songplayer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@RestController
public class SongController {

    @GetMapping("play")
    public String playSong() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Songs/Justin_Bieber_Sorry.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        clip.start();

        String response = scanner.next();

        return "Song Played Successfully...";

    }

//    public SongController() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        File file = new File("Sorry_Test.wav");
//        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioInputStream);
//
//        clip.start();
//
//        String response = scanner.next();
//    }
}
