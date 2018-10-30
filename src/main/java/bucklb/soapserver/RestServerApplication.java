package bucklb.soapserver;

import org.springframework.boot.SpringApplication;

// This stuff seemed needed for RESTful spring boot
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




// Let Spring take the strain for restful aspect
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "bucklb.soapserver")
public class RestServerApplication {

	// This is about as much as seems to be needed to get things moving.
	public static void main(String[] args) {
		System.out.println("in MAIN");
		SpringApplication.run(RestServerApplication.class, args);
	}
}
