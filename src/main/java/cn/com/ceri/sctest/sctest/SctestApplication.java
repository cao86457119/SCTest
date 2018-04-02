package cn.com.ceri.sctest.sctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SctestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SctestApplication.class, args);
	}
}
