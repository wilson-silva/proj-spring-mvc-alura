package br.com.alura.mvc.mundipratica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MundiPraticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundiPraticaApplication.class, args);
	}

}
