package com.company.section7;

public class Sound {
    private int currentVolume;

    public Sound(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void volume(int volume){
        this.currentVolume += volume;
        System.out.println("the sound increased by " + volume + " and the sound is: " + getCurrentVolume());
    }
}
