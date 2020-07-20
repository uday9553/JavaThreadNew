package main;

public class MainClass {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.start();
		//interrupt will work only for sleeping threads
		p1.interrupt();
		for (int i = 0; i < 30; i++) {
			System.out.println("mainclass "+i);
		}

	}

}
