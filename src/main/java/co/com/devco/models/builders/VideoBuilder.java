package co.com.devco.models.builders;

import co.com.devco.models.Video;
import co.com.devco.utils.Builder;

public class VideoBuilder implements Builder<Video> {
    private String songName;
    private String bandName;

    private VideoBuilder(){
        this.songName = "";
        this.bandName = "";
    }

    public static VideoBuilder video(){
        return new VideoBuilder();
    }

    public VideoBuilder withSongName(String songName){
        this.songName = songName;
        return this;
    }

    public VideoBuilder withBandName(String bandName){
        this.bandName = bandName;
        return this;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public Video build() {
        return new Video(this);
    }
}
