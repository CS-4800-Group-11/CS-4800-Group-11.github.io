package teamnosleep.ebtrescue.EBT.Rescue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EbtRescueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbtRescueApplication.class, args);
	}

}
