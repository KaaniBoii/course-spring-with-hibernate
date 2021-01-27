package de.oette.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SuppressWarnings("SpellCheckingInspection")
@SpringBootApplication
@ComponentScan(basePackages = "de.oette.course.C04")
@EntityScan(basePackages = "de.oette.course.C04")
//@ImportResource(value = "classpath:deprecated-config.xml")
public class SpringAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
