package org.ctci.chapter16.Question16_5;

import java.util.Objects;

public class MyThread extends Thread {
	private String method;
	private FooBad foo;
	
	public MyThread(FooBad foo, String method) {
		this.method = method;
		this.foo = foo;
	}
	
	public void run() {
		if (Objects.equals(method, "first")) {
			foo.first();
		} else if (Objects.equals(method, "second")) {
			foo.second();
		} else if (Objects.equals(method, "third")) {
			foo.third();
		}
	}
}
