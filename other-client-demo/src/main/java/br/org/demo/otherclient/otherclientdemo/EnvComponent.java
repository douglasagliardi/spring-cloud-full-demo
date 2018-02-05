package br.org.demo.otherclient.otherclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class EnvComponent {

    @Value("${application.default.url.to.happiness}")
    private String happinessURL;


    public String getHappinessURL() {
        return happinessURL;
    }
}
