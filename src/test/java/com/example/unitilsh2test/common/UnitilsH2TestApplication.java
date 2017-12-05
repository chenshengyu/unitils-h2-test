package com.example.unitilsh2test.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/application.properties")
@MapperScan("com.example.unitilsh2test.domain.infrastructure.model")
@ComponentScan("com.example.unitilsh2test.domain.infrastructure")
@SpringBootApplication
public class UnitilsH2TestApplication {
}