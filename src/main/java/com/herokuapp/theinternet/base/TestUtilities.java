package com.herokuapp.theinternet.base;

public class TestUtilities extends BaseTest {

	// Static sleep
	protected void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
