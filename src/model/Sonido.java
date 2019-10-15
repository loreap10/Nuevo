package model;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sonido 
{
	public void sonido() throws LineUnavailableException, IOException, UnsupportedAudioFileException
	{
		Clip sonido=AudioSystem.getClip();
		sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("sonido/africandrums.wav")));
		sonido.start();
	}
}