package com.leon.springlearn.config;

import com.leon.springlearn.bean.MagicBean;
import com.leon.springlearn.condition.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 15/01/2018.
 *
 * @author Xiaolei-Peng
 */

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
