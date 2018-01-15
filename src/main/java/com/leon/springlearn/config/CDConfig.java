package com.leon.springlearn.config;

import com.leon.springlearn.dao.CompactDisc;
import com.leon.springlearn.dao.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 12/01/2018.
 *
 * @author Xiaolei-Peng
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
