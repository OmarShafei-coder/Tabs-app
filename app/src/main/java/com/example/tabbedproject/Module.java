package com.example.tabbedproject;

public class Module {
    private int songName;
    private int songDuration;
    private int songCover;

    public Module(int songName, int songDuration, int songCover) {
        this.songName = songName;
        this.songDuration = songDuration;
        this.songCover = songCover;
    }

    public int getSongName() {
        return songName;
    }

    public void setSongName(int songName) {
        this.songName = songName;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    public int getSongCover() {
        return songCover;
    }

    public void setSongCover(int songCover) {
        this.songCover = songCover;
    }
}
