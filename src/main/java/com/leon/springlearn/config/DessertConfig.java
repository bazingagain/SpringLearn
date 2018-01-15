package com.leon.springlearn.config;

import com.leon.springlearn.dao.Dessert;
import com.leon.springlearn.dao.impl.IceCream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 15/01/2018.
 *
 * @author Xiaolei-Peng
 */

@Configuration
public class DessertConfig {
    @Bean
    @Qualifier("cold")
    public Dessert iceCream() {
        return new IceCream();
    }
}
