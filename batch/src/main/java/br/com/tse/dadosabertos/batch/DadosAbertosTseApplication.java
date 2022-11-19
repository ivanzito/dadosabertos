package br.com.tse.dadosabertos.batch;

import br.com.tse.dadosabertos.batch.config.Database;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableBatchProcessing
@EnableConfigurationProperties(Database.class)

public class DadosAbertosTseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DadosAbertosTseApplication.class, args);
	}

}
