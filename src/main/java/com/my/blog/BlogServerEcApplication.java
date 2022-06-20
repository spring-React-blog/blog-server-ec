package com.my.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaAuditing
@EnableWebMvc
public class BlogServerEcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServerEcApplication.class, args);
    }

}
