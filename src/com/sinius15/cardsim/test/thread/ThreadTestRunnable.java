package com.sinius15.cardsim.test.thread;

import com.sinius15.cardsim.tertiair.Tafel;

public class ThreadTestRunnable implements Runnable{

	int rondjes;
	
	public ThreadTestRunnable(int rondjesPerTafel) {
		this.rondjes = rondjesPerTafel;
	}

	@Override
	public void run() {

		Tafel t = new Tafel();
		t.aantalRondjes = rondjes;
		t.run();

		
		
		ThreadTester.finished++;
	}

}
