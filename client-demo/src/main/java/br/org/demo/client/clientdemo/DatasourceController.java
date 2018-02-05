package br.org.demo.client.clientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DatasourceController {

    @Value("${spring.data.mongodb.uri}")
    private String url;


    @GetMapping(value = "/datasource")
    public String getDatasource() {
        return url;
    }
}
