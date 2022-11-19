package br.com.tse.dadosabertos.batch.config;

import br.com.tse.dadosabertos.batch.mapper.FlatItemMapperDefault;
import br.com.tse.dadosabertos.batch.mapper.SomatoriaPresidenteMapper;
import br.com.tse.dadosabertos.batch.model.SomatoriaPresitente;
import br.com.tse.dadosabertos.batch.reader.SomatoriaPresidenteFlatItemReader;
import br.com.tse.dadosabertos.batch.writer.SomatoriaPresidenteWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    //@Autowired
    //private DataSource dataSource;

    @Bean
    public Job sampleJob(JobRepository jobRepository, Step step) {
        return this.jobBuilderFactory.get("first")
                .repository(jobRepository)
                .start(step)
                .build();
    }

    @Bean
    public FlatItemMapperDefault<SomatoriaPresitente> somatoriaPresidenteMapper() {
        return new SomatoriaPresidenteMapper<>();
    }

    @Bean
    public ItemReader<SomatoriaPresitente> reader() {
        return new SomatoriaPresidenteFlatItemReader<SomatoriaPresitente>(somatoriaPresidenteMapper());
    }


    @Bean
    public ItemWriter<SomatoriaPresitente> writer() {
        return new SomatoriaPresidenteWriter<>();
    }

    @Bean
    public Step somatoriaPresidente() {
        return stepBuilderFactory.get("first")
                .<SomatoriaPresitente, SomatoriaPresitente>chunk(10)
                .reader(reader())
                .writer(writer())
                .faultTolerant()
                .skipLimit(28)
                .skip(NumberFormatException.class)
                .skip(FlatFileParseException.class)
                .build();
    }
}
