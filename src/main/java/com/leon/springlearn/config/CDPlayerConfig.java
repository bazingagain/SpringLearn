package com.leon.springlearn.config;

import com.leon.springlearn.dao.CompactDisc;
import com.leon.springlearn.dao.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 02/01/2018.
 *
 * @author Xiaolei-Peng
 */
@Configuration
//@ComponentScan("com.leon.springlearn")
//@ComponentScan(basePackages = "com.leon.springlearn")
//@ComponentScan(basePackages = {"com.leon.springlearn.config", "com.leon.springlearn.dao"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class}) //SgtPeppers类所在的包会作为组件扫描的基础包
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean("loneHeartsClubBand")
    public CompactDisc otherSgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }

    @Bean
    public CDPlayer cdPlayer() {
        //注入
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        //anotherCDPlayer() 与 cdPlayer() 得到的 SgtPeppers都是一样的,因为Spring 中的Bean默认都是单例的
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CDPlayer cdPlayer1(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        cdPlayer.setCd(compactDisc); //setter方式注入
        return cdPlayer;
    }

}
