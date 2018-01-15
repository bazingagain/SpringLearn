package com.leon.springlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created on 12/01/2018.
 *
 * @author Xiaolei-Peng
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("classpath:mybeans.xml")
public class SoundSystemConfig {

}
