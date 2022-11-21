package br.com.tse.dadosabertos;

import br.com.tse.dadosabertos.batch.config.Database;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableBatchProcessing
@EnableJpaRepositories
@EnableConfigurationProperties(Database.class)
public class DadosAbertosTseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DadosAbertosTseApplication.class, args);
	}

}
