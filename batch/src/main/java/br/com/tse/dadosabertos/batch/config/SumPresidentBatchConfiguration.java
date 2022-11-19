package br.com.tse.dadosabertos.batch.config;

import br.com.tse.dadosabertos.batch.reader.SumPresidentFlatItemReader;
import br.com.tse.dadosabertos.batch.writer.SumPresidentWriter;
import br.com.tse.dadosabertos.gateway.port.SumPresident;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SumPresidentBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    SumPresidentFlatItemReader<SumPresident> sumPresidentFlatItemReader;

    @Autowired
    SumPresidentWriter sumPresidentWriter;

    @Bean
    public Job sumPresidentJob(JobRepository jobRepository, Step step) {
        return this.jobBuilderFactory.get("first")
                .repository(jobRepository)
                .start(step)
                .build();
    }

    @Bean
    public Step sumPresident() {
        return stepBuilderFactory.get("first")
                .<SumPresident, SumPresident>chunk(10)
                .reader(sumPresidentFlatItemReader)
                .writer(sumPresidentWriter)
                .faultTolerant()
                .skipLimit(28)
                .skip(NumberFormatException.class)
                .skip(FlatFileParseException.class)
                .build();
    }
}
