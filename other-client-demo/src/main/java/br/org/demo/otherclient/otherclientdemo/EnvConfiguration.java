package br.org.demo.otherclient.otherclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfiguration {

    @Autowired
    EnvComponent component;

    @Bean
    @RefreshScope
    HappinessService processHappiness() {
        return new HappinessService(component.getHappinessURL());
    }

}
