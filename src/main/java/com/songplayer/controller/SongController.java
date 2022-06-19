package com.songplayer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@RestController
public class SongController {

    // For Song 1

    @GetMapping("play/Sorry")
    public String playSong1() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Songs/Justin_Bieber_Sorry.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        clip.start();

        String response = scanner.next();

        return "Song Played Successfully...";

    }

    // For Song 2

    @GetMapping("play/Let_Me_Love_You")
    public String playSong2() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Songs/Let_Me_Love_You.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        clip.start();

        String response = scanner.next();

        return "Song Played Successfully...";
    }


}
