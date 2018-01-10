package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created on 02/01/2018.
 *
 * @author Xiaolei-Peng
 */

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{
    private String title = " sgt. spper's Lonely Hearts Club Band";
    private String artist = "The Betles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
