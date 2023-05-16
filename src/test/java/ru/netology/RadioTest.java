package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolumeAboveMaxTest() {
        Radio rad = new Radio();

        rad.setCurrentVolume(250);

        int expected = 100;
        int actual = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolumeBelowMinTest() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-10);

        int expected = 0;
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(74);
        rad.increaseVolume();

        int expected = 75;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notDecreaseVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notIncreaseVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNewRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.prevRadioStation();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}