package br.org.demo.otherclient.otherclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappinessController {

    @Autowired
    protected HappinessService hService;

    @GetMapping(value = "/whereItIs")
    public String getHappinessURL() {
        return hService.getHappinessUrl();
    }
}
