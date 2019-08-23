package co.com.devco.models;

import co.com.devco.models.builders.VideoBuilder;

public class Video {
    private String songName;
    private String nameBand;

    public Video(VideoBuilder videoBuilder) {
        this.songName = videoBuilder.getSongName();
        this.nameBand = videoBuilder.getBandName();
    }

    public String getSongName() {
        return songName;
    }

    public String getNameBand() {
        return nameBand;
    }
}
