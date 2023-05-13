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

        rad.setCurrentRadioStation(101);

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualSetVolumeBelowMinTest() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

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

        rad.setCurrentVolume(rad.getMinVolume());
        rad.decreaseVolume();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notIncreaseVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMaxVolume());
        rad.increaseVolume();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNewRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(rad.getMaxRadioStation());
        rad.nextRadioStation();

        int expected = rad.getMinRadioStation();
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

        int expected = rad.getMaxRadioStation();
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

    @Test
    public void numberOfRadioStationsSetByUser() {
        Radio rad = new Radio(30);

        Assertions.assertEquals(0, rad.getMinRadioStation());
        Assertions.assertEquals(29, rad.getMaxRadioStation());
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void setNextRadioStationWithCustomNumberOfRadioStations() {
        Radio rad = new Radio(25);

        rad.setCurrentRadioStation(13);
        rad.nextRadioStation();

        int expected = 14;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationWithCustomNumberOfRadioStations() {
        Radio rad = new Radio(76);

        rad.setCurrentRadioStation(43);
        rad.prevRadioStation();

        int expected = 42;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationWithCustomNumberAboveMax() {
        Radio rad = new Radio(69);

        rad.setCurrentRadioStation(rad.getMaxRadioStation());
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationWithCustomNumberUnderMin() {
        Radio rad = new Radio(96);

        rad.setCurrentRadioStation(rad.getMinRadioStation());
        rad.prevRadioStation();

        int expected = 95;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}