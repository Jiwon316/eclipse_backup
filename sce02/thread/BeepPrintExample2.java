package sce02.thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}
