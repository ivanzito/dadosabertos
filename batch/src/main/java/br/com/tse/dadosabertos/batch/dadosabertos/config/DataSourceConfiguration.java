package br.com.tse.dadosabertos.batch.dadosabertos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.jdbc.support.JdbcTransactionManager;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public class DataSourceConfiguration {
    @Autowired
    private Environment environment;

    @Autowired
    private ResourceLoader resourceLoader;

    @PostConstruct
    @ConfigurationProperties(prefix = "database")
    protected void initialize(Database database) {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(resourceLoader.getResource(environment.getProperty("batch.schema.script")));
        populator.setContinueOnError(true);
        DatabasePopulatorUtils.execute(populator, dataSource(database));
    }

    @Bean(destroyMethod = "close")
    @ConfigurationProperties(prefix = "database")
    public DataSource dataSource(Database database) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(database.driverClassName());
        dataSourceBuilder.url(database.url());
        dataSourceBuilder.username(database.username());
        dataSourceBuilder.password(database.password());
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTransactionManager transactionManager(DataSource dataSource) {
        return new JdbcTransactionManager(dataSource);
    }
}
