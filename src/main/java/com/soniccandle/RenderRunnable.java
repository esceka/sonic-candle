package com.soniccandle;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JProgressBar;

import com.soniccandle.model.SimpleRenderer;
import com.soniccandle.model.VideoOutputter;

public class RenderRunnable implements Runnable {

	public int videoFrameRate;
	public int width;
	public int height;
	public File audioFile;
	public File outputTo;
	public VideoOutputter outputter;
	public JProgressBar progressBar;
	public BufferedImage backgroundImage;

	public void run() {
		SimpleRenderer renderer;
		try {
			renderer = new SimpleRenderer(audioFile, videoFrameRate, width, height, outputTo, progressBar);
			renderer.backgroundImage = backgroundImage;
			renderer.outputter = outputter;
//			renderer.start();
//			while (!renderer.isDone) {
//				renderer.renderNextFrame();
//			}
//			renderer.finish();
			renderer.renderAll();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}