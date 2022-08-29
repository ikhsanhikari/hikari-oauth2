package id.hikari.oauth2;

import id.hikari.oauth2.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class HikariOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(HikariOauth2Application.class, args);
	}

}
