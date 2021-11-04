package teamnosleep.ebtrescue.EBT.Rescue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EbtRescueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbtRescueApplication.class, args);
	}

}
