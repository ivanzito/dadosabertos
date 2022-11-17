package br.com.tse.dadosabertos.batch.dadosabertos;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DadosAbertosTseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DadosAbertosTseApplication.class, args);
	}

}
