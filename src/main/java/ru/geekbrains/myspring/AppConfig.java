package ru.geekbrains.myspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ru.geekbrains.myspring.component")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
