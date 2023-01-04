package uk.warley.ganesh.springdemo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public CricketCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Tennis workout";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortuneService();
	}

	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("doing my Init stuff");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("doing my clean stuff");
	}
}
