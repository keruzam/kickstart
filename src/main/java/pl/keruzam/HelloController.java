package pl.keruzam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "<h1>SpringBoot Kickstart</h1>";
	}
	
	@RequestMapping("/")
	public String status() {
		return "OK";
	}
}
