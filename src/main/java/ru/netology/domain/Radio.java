package ru.netology.domain;

public class Radio {

    private String name;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume = minVolume;


    public Radio() {

    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getCurrentStation() {
        return currentStation;
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