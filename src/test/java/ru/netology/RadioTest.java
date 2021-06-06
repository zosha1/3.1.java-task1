package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    @Test
    public void afterMaxStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void beforeMinStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prevStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void moreMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void lessMinVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void reduceVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.reduceVolume();

        assertEquals(4, radio.getCurrentVolume());
    }
}
