package com.leon.springlearn.config;

import com.leon.springlearn.dao.impl.NotePad;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created on 15/01/2018.
 *
 * @author Xiaolei-Peng
 */

@Configuration
public class NotePadConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public NotePad notePad() {
        return new NotePad();
    }

    @Bean
    public static PropertyPlaceholderConfigurer placeholderConfigurer() {
        return new PropertyPlaceholderConfigurer();
    }
}
