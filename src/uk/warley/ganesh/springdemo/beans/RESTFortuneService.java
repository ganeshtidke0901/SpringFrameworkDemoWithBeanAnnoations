package uk.warley.ganesh.springdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "This is your Restful fortune service";
	}

}
