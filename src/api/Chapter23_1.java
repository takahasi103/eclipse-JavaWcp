package api;

import java.util.Date;

public class Chapter23_1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(163484397000L);
		System.out.println(past);
	}
}
