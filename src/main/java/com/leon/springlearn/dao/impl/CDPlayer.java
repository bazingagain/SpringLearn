package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;
import com.leon.springlearn.dao.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 10/01/2018.
 *
 * @author Xiaolei-Peng
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired(required = false) //构造器注入自动装配
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired //setter 自动装配, @Autowired可以用在类的任何方法上
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void insertDics(CompactDisc cd) {
        this.cd = cd;
    }
}
