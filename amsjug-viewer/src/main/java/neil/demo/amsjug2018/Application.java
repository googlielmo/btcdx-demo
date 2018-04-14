package neil.demo.amsjug2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Start, run and end under {@code Spring Boot}  control.
 * </p>
 */
@SpringBootApplication
public class Application {
	
	static {
		System.setProperty("java.awt.headless", "false");
	}

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(Application.class, args);
    }

}
