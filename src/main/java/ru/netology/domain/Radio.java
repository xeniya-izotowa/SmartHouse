package ru.netology.domain;

public class Radio {

    private String name;
    private int minStation = 0;
    private int currentStation;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolumeAboveMax() {
        if (currentVolume == maxVolume) {
            return;
        }
    }

    public void decreaseVolumeBelowMin() {
        if (currentVolume == minVolume) {
            return;
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

    public void turnNextStation(int newCurrentStation) {
        if (newCurrentStation < maxStation) {
            currentStation +=1;
        }
    }

    public void turnPrevStation(int newCurrentStation) {
        if (newCurrentStation > minStation) {
            currentStation -= 1;
        }
    }

    public void turnNextStationWhenAboveMax(int currentStation) {
        if (currentStation == maxStation) {
            return;
        }
    }

    public void turnPrevStationWhenBelowMin(int currentStation) {
        if (currentStation == minStation) {
            return;
        }
    }






}