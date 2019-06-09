package ch.schaefer.martin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * The Lunar Module's main ignition routine.
 * 
 * @author Martin Schäfer
 */
@SpringBootApplication
@EnableCaching
public class BurnBabyBurn {

	public static void main(String[] args) {
		SpringApplication.run(BurnBabyBurn.class, args);
	}

}
