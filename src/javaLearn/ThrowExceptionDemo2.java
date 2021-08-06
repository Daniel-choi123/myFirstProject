package javaLearn;

import java.io.IOException;

class E{
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOExcetion1()  {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOExcetion2() throws IOException {
		throw new IOException();
	}
}
