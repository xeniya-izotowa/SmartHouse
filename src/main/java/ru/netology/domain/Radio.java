package ru.netology.domain;

import lombok.Data;

@Data
public class Radio {

    private String name;
    private int minStation = 0;
    private int currentStation = minStation;
    private int stationsAmount = 10;
    private int maxStation ;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume = minVolume;

    public Radio() {

    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
        maxStation = stationsAmount -1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        else {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void turnNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        else {
            currentStation += 1;
        }
    }

    public void turnPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        else {
            currentStation -= 1;
        }
    }

}