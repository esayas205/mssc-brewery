package guru.springframwork.msscbrewery;

import guru.springframwork.msscbrewery.service.BeerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(proxyBeanMethods = false)
public class MsscBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);
	}

}
