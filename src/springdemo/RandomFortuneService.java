package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"You are going to have a bad day", "You are going to have a good day", "You will die today"};

	@Override
	public String getFortune() {
		Random rnd = new Random();
		return fortunes[rnd.nextInt(3)];
	}

}
