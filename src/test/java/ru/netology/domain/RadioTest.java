package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeWhenIsMax() {
        Radio radio = new Radio(14);

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        assertEquals(radio.getMaxVolume(),radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(22);

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
    void shouldTurnNextStationWhenIsMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation());
        radio.turnNextStation();

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void shouldTurnNextStation() {
        Radio radio = new Radio(36);

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
        Radio radio = new Radio(20);

        radio.setCurrentStation(5);
        radio.turnPrevStation();

        assertEquals(4, radio.getCurrentStation());
    }

}
