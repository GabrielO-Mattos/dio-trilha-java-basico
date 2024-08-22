package one.digitalinnovation.padroes_project_java_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "one.digitalinnovation.gof")
public class PadroesProjectJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjectJavaSpringApplication.class, args);
	}

}
