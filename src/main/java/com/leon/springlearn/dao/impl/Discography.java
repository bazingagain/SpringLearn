package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;

import java.util.List;

/**
 * Created on 12/01/2018.
 *
 * @author Xiaolei-Peng
 */
public class Discography {
    private String artist;
    private List<CompactDisc> cds;

    public Discography(String artist, List<CompactDisc> cds) {
        this.artist = artist;
        this.cds = cds;
    }
}
