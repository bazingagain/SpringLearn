package com.leon.springlearn.dao.impl;

import com.leon.springlearn.dao.CompactDisc;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created on 12/01/2018.
 *
 * @author Xiaolei-Peng
 */
public class BlackDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public BlackDisc(@Value("#{systemProperties['disc.title']}") String title, @Value("#{systemProperties['disc.artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlackDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }



    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
