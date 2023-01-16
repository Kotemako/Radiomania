package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void shouldSpecifyStationQuantityPositive() {
        Radio radio = new Radio();
        radio.setStationsQuantity(1);
        assertEquals(1, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative() {
        Radio radio = new Radio();
        radio.setStationsQuantity(10);
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative2() {
        Radio radio = new Radio();
        radio.setStationsQuantity(-1);
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    void arbitraryStationValueMid() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValueNegativePreMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValueMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValueNegativeMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValuePreMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);
        int expected = 13;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValueMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        int expected = 14;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void arbitraryStationValueNegativeMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValueMid() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValuePreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValueMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValueNegativeMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValuePreMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValueMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationValueNegativeMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void nextMidMaxStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(7);
        radio.nextStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextPreMaxStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(12);
        radio.nextStation();
        int expected = 13;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);
        radio.nextStation();
        int expected = 14;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNegativeMaxStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevMidStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevPreMinStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(2);
        radio.prevStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void prevMinStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNegativeMinStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 14;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValueNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValueMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValuePreMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValueMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValueMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeLimitValueNegativeEleven() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void nextMinMidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void nextNegativeMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }




}