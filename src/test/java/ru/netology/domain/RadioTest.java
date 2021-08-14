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

        testRadio.setCurrentVolume(testRadio.getMaxVolume());
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
        testRadio.turnNextStation();

        assertEquals(3, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnNextStation2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(testRadio.getMaxStation());
        testRadio.turnNextStation();

        assertEquals(9, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnPrevStation() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(7);
        testRadio.turnPrevStation();

        assertEquals(6, testRadio.getCurrentStation());

    }

    @Test
    void shouldTurnPrevStation2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(testRadio.getMinStation());
        testRadio.turnPrevStation();

        assertEquals(testRadio.getMinStation(), testRadio.getCurrentStation());

    }

    @Test
    void shouldNotTurnNextWhenStationIsMax() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(testRadio.getMaxStation());
        testRadio.turnNextStationWhenAboveMax();

        assertEquals(testRadio.getMaxStation(), testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnNextWhenStationIsMax2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(2);
        testRadio.turnNextStationWhenAboveMax();

        assertEquals(2, testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnPrevStationWhenStationIsMin() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(testRadio.getMinStation());
        testRadio.turnPrevStationWhenBelowMin();

        assertEquals(0, testRadio.getCurrentStation());
    }

    @Test
    void shouldNotTurnPrevStationWhenStationIsMin2() {
        Radio testRadio = new Radio();

        testRadio.setCurrentStation(8);
        testRadio.turnPrevStationWhenBelowMin();

        assertEquals(8, testRadio.getCurrentStation());
    }

    @Test
    void shouldSetName() {
        Radio testRadio = new Radio();

        testRadio.setName("Test Radio");

        assertEquals("Test Radio", testRadio.getName());
    }

    @Test
    void shouldGetName() {
        Radio testRadio = new Radio();

        testRadio.setName("First Radio");
        testRadio.getName();

        assertEquals("First Radio", testRadio.getName());
    }

    @Test
    void shouldSetMaxVolume() {
        Radio testRadio = new Radio();

        testRadio.setMaxVolume(15);

        assertEquals(15, testRadio.getMaxVolume());
    }

    @Test
    void shouldSetMinVolume() {
        Radio testRadio = new Radio();

        testRadio.setMinVolume(1);

        assertEquals(1, testRadio.getMinVolume());
    }

    @Test
    void shouldSetMinStation() {
        Radio testRadio = new Radio();

        testRadio.setMinStation(1);

        assertEquals(1, testRadio.getMinStation());
    }

    @Test
    void shouldGetMinStation() {
        Radio testRadio = new Radio();

        assertEquals(0, testRadio.getMinStation());
    }

    @Test
    void shouldSetMaxStation() {
        Radio testRadio = new Radio();

        testRadio.setMaxStation(100);

        assertEquals(100, testRadio.getMaxStation());
    }

    @Test
    void shouldGetMaxStation() {
        Radio testRadio = new Radio();

        assertEquals(9, testRadio.getMaxStation());
    }

}