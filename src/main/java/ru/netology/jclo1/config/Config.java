package ru.netology.jclo1.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.jclo1.systemProfile.DevProfile;
import ru.netology.jclo1.systemProfile.ProductionProfile;
import ru.netology.jclo1.systemProfile.SystemProfile;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(value = "devProfile", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "devProfile", havingValue = "false", matchIfMissing = true)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
