package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(7);

        assertEquals(7, testRadio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(-1);

        assertEquals(0, testRadio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation3() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(15);

        assertEquals(0, testRadio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(5);

        assertEquals(5, testRadio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolume2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(-6);

        assertEquals(0, testRadio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolume3() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(12);

        assertEquals(0, testRadio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio testRadio = new Radio();

        testRadio.increaseVolume();

        assertEquals(1, testRadio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(10);
        testRadio.increaseVolume();

        assertEquals(10, testRadio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(3);
        testRadio.decreaseVolume();

        assertEquals(2, testRadio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentVolume(0);
        testRadio.decreaseVolume();

        assertEquals(0, testRadio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio testRadio = new Radio();
        testRadio.setCurrentVolume(testRadio.getMaxVolume());

        testRadio.increaseVolumeAboveMax();

        assertEquals(testRadio.getMaxVolume(), testRadio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax2() {
        Radio testRadio = new Radio();
        testRadio.setCurrentVolume(2);

        testRadio.increaseVolumeAboveMax();

        assertEquals(2, testRadio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio testRadio = new Radio();
        testRadio.setCurrentVolume(testRadio.getMinVolume());

        testRadio.decreaseVolumeBelowMin();

        assertEquals(testRadio.getMinVolume(), testRadio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin2() {
        Radio testRadio = new Radio();
        testRadio.setCurrentVolume(1);

        testRadio.decreaseVolumeBelowMin();

        assertEquals(1, testRadio.getCurrentVolume());
    }

    @Test
    void shouldTurnNextStation() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(2);
        testRadio.turnNextStation(testRadio.getCurrentStation());

        assertEquals(3, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnNextStation2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(9);
        testRadio.turnNextStation(testRadio.getCurrentStation());

        assertEquals(9, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnPrevtStation() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(7);
        testRadio.turnPrevStation(testRadio.getCurrentStation());

        assertEquals(6, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnPrevtStation2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(0);
        testRadio.turnPrevStation(testRadio.getCurrentStation());

        assertEquals(0, testRadio.getCurrentStation());

    }

    @Test
    void shouldNotTurnNextWhenStationIsMax() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(9);
        testRadio.turnNextStationWhenAboveMax(testRadio.getCurrentStation());

        assertEquals(9, testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnNextWhenStationIsMax2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(2);
        testRadio.turnNextStationWhenAboveMax(testRadio.getCurrentStation());

        assertEquals(2, testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnPrevStationWhenStationIsMin() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(0);
        testRadio.turnPrevStationWhenBelowMin(testRadio.getCurrentStation());

        assertEquals(0, testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnPrevStationWhenStationIsMin2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(8);
        testRadio.turnPrevStationWhenBelowMin(testRadio.getCurrentStation());

        assertEquals(8, testRadio.getCurrentStation());
    }

}