package com.cherylorcutt.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String[] randomFortunes =
		{"Your lucky number is 4",
			 "Smile and the world smiles with you. :-)",
			 "You will hear good news soon."};
	@Override
	public String getFortune() {
		return randomFortunes[new Random().nextInt(randomFortunes.length)];
	}

}
