package br.com.tse.dadosabertos.batch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.jdbc.support.JdbcTransactionManager;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfiguration {
    @Autowired
    private Environment environment;

    @Autowired
    private ResourceLoader resourceLoader;

    @Value("${batch.schema.script}")
    private Resource dataReopsitorySchema;

    @Value("${batch.drop.script}")
    private Resource dropReopsitoryTables;

    @Bean
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.addScript(dropReopsitoryTables);
        databasePopulator.addScript(dataReopsitorySchema);
        databasePopulator.setIgnoreFailedDrops(true);

        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(databasePopulator);
        return initializer;
    }

    @Bean(destroyMethod = "close")
    public DataSource dataSource(Database database) {
        return DataSourceBuilder.create()
                .driverClassName(database.driverClassName())
                .url(database.url())
                .username(database.username())
                .password(database.password())
                .build();
    }

    @Bean
    public JdbcTransactionManager jdbcTransactionManager(DataSource dataSource) {
        return new JdbcTransactionManager(dataSource);
    }
}
