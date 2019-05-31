package ch.schaefer.martin.cloud;

import java.time.LocalDateTime;

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
public class RestController {

	/**
	 * Say hello to earth
	 * 
	 * @return First word from the moon
	 * 
	 */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Houston, Tranquility Base here. The Eagle has landed. (" + LocalDateTime.now().toString() + ")";
	}
}
