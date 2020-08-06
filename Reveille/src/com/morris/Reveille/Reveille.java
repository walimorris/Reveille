package com.morris.Reveille;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Reveille {
    Clip clip;
    AudioInputStream stream;

    public Reveille() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.stream = AudioSystem.getAudioInputStream(new File
                ("Reveille.wav").getAbsoluteFile());
        this.clip = AudioSystem.getClip();
    }

    public void play() throws IOException, LineUnavailableException, InterruptedException {
        this.clip.open(this.stream);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength()/1000);
        clip.close();
    }
}
