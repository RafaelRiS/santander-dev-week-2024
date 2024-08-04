package me.dio.santander_dev_week_2024.domain.controller.exception;

import me.dio.santander_dev_week_2024.domain.controller.config.LimitProperties;
import me.dio.santander_dev_week_2024.domain.controller.config.LimitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitController {

    private final LimitProperties limitProperties;

    @Autowired
    public LimitController(LimitProperties limitProperties) {
        this.limitProperties = limitProperties;
    }

    @GetMapping("/min")
    public Integer getMinLimit() {
        return limitProperties.getMin();
    }

    @GetMapping("/max")
    public Integer getMaxLimit() {
        return limitProperties.getMax();
    }
}
