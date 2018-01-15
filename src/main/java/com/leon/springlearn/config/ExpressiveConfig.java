package com.leon.springlearn.config;

import com.leon.springlearn.dao.CompactDisc;
import com.leon.springlearn.dao.impl.BlackDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created on 15/01/2018.
 *
 * @author Xiaolei-Peng
 */

@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment environment;

    @Bean
    public BlackDisc disc() {

        environment.getProperty("disc.title", "default value"); // 默认值
        int count = environment.getProperty("disc.count", Integer.class, 30); //Class转型,并添加默认值
        environment.getRequiredProperty("disc.title"); //希望该属性必须定义
        boolean exists = environment.containsProperty("disc.title");
        String[] s = environment.getActiveProfiles(); //返回激活的profile的数组
        String[] p = environment.getDefaultProfiles(); //返回默认profile的数组

        return new BlackDisc(environment.getProperty("disc.title"), environment.getProperty("disc.artist"));

    }
}
