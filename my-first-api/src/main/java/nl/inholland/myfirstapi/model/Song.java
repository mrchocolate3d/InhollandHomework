package nl.inholland.myfirstapi.model;

import java.util.Date;
import java.util.UUID;


public class Song {
    private UUID uuid;
    private String name;
    private String artist;
    private Integer releaseDate;
    private Double duration;


    public Song(String name, String artist, Integer releaseDate, Double duration) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
