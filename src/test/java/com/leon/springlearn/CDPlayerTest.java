package com.leon.springlearn;

import com.leon.springlearn.config.CDPlayerConfig;
import com.leon.springlearn.dao.CompactDisc;
import com.leon.springlearn.dao.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created on 03/01/2018.
 *
 * @author Xiaolei-Peng
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing  sgt. spper's Lonely Hearts Club Band by The Betles\n", log.getLog());
    }
}
