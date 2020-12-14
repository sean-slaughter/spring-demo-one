package springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Cricket coach constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Play a ton of cricket.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	



}
