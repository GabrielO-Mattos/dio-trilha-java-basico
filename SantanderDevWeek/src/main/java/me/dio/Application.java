package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers =  {@Server(url = "/")})
@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		
		String host = dotenv.get("PGHOST");
		String port = dotenv.get("PGPORT");
		String database = dotenv.get("PGDATABASE");
		String user = dotenv.get("PGUSER");
		String password = dotenv.get("PGPASSWORD");
	
		System.setProperty("PGHOST", host);
		System.setProperty("PGPORT", port);
		System.setProperty("PGDATABASE", database);
		System.setProperty("PGUSER", user);
		System.setProperty("PGPASSWORD", password);

		SpringApplication.run(Application.class, args);
	}

}
