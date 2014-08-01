package com.sinius15.cardsim.test.thread;

import com.sinius15.cardsim.Vars;

public class ThreadTester {

	public static int finished = 0;
	private static int threadAmount = 10;
	
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder();
		for(int i = 1; i <= threadAmount; i++){
			b.append(doThreadTest(i) + System.lineSeparator());
		}
		System.out.println(b.toString());

	}

	private static String doThreadTest(int threads) {
		long start = System.nanoTime();
		finished = 0;
		for(int i = 0; i < threads; i++){
			new Thread(new ThreadTestRunnable(Vars.aantalTests/threads)).start();
		}
		
		while(finished != threads){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.nanoTime();
		System.out.println(threads + " threads duurde \t" + ((float)(end-start))/(1000*1000) + " \tmili seconde elke thread deed " + Vars.aantalTests/threads + "rondjes");
		return threads + ";" + (((float)(end-start))/(1000*1000) + "").replaceAll("\\.", ",");
	}
	
	


}
