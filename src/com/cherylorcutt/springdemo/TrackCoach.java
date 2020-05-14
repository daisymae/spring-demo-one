package com.cherylorcutt.springdemo;

public class TrackCoach implements Coach {
	// define private field for dependency
	private FortuneService fortuneService;

	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStart() {
		System.out.println("TrackCoack: inside method, doMyStart");
	}
	
	// add a destroy method
	public void destroyMe() {
		System.out.println("TrackCoach: cleanup the crap");
	}
}
