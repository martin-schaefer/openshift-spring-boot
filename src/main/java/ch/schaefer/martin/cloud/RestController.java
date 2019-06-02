package ch.schaefer.martin.cloud;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Lunar Module controller.
 * 
 * @author Martin Schäfer
 *
 */
@Controller
@RefreshScope
public class RestController {

	private final String message;

	public RestController(@Value("${service.message}") String message) {
		this.message = message;
	}

	/**
	 * Say hello to earth
	 * 
	 * @return First word from the moon
	 * 
	 */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return message + " (" + LocalDateTime.now().toString() + ")";
	}
}
