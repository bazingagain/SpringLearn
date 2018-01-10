package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;

/**
 * Created on 10/01/2018.
 *
 * @author Xiaolei-Peng
 */
public class HardDaysNight implements CompactDisc {

    private String title = " HardDaysNight";
    private String artist = "The Betles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
