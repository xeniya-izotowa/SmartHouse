package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetName() {
        Radio radio = new Radio();

        radio.setName("Test Radio");

        assertEquals("Test Radio", radio.getName());
    }

    @Test
    void shouldGetName() {
        Radio radio = new Radio();

        radio.setName("Second test Radio");
        radio.getName();

        assertEquals("Second test Radio", radio.getName());
    }

    @Test
    void shouldGetMinStation() {
        Radio radio = new Radio();

        radio.getMinStation();

        assertEquals(0, radio.getMinStation());
    }


    @Test
    void shouldGetMaxStationFromParams() {
        Radio radio  = new Radio(20);

        assertEquals(20, radio.getMaxStation());
    }

    @Test
    void shouldGetMaxStationByDefault() {
        Radio radio = new Radio();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(7);

        assertEquals(7, radio.getMaxVolume());
    }

    @Test
    void shouldGetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(8);
        radio.getMaxVolume();

        assertEquals(8, radio.getMaxVolume());
    }

    @Test
    void shouldGetMinVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void shouldGetCurrentVolume() {
        Radio radio  = new Radio();

        radio.setCurrentVolume(5);

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(105);

        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeWhenIsMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        assertEquals(radio.getMaxVolume(),radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.decreaseVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeWhenIsMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation() - 1);

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation() + 1);

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldGetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.getCurrentStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldTurnNextStationWhenIsMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation());
        radio.turnNextStation();

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void shouldTurnNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.turnNextStation();

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void shouldTurnPrevStationWhenIsMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation());
        radio.turnPrevStation();

        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void shouldTurnPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.turnPrevStation();

        assertEquals(4, radio.getCurrentStation());
    }

}
