package org.teng.ball;

import java.io.IOException;

import javax.swing.JFrame;

public class BallGame {

	public static void main(String[] args) throws IOException {
		BallFrame ballFrame = new BallFrame();
		ballFrame.pack();
		ballFrame.setVisible(true);
		ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
