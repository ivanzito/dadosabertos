package br.com.tse.dadosabertos.batch.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "database")
public record Database(
        String username,
        String password,
        String url,
        String driverClassName
) { }
