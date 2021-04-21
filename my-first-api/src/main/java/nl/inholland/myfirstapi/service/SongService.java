package nl.inholland.myfirstapi.service;

import nl.inholland.myfirstapi.model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SongService {
    private List<Song> songList = new ArrayList<>();

    public SongService(){
        this.songList = new ArrayList<>(
                List.of(
                        new Song("Stand by me","Ben E King",2009,2.75),
                        new Song("Nice For What","Drake",2018,3.31),
                        new Song("Wet Dreamz","J Cole",2015,4.00),
                        new Song("Feels Like Summer","Childish Gambino",2018,4.45)
                        )
        );
    }

    public List<Song> getSongList() {
        return songList;
    }

    //Create a new song using the variables
    public Song createSong(Song song){
        songList.add(song);
        return song;
    }

    //Get the song object from parameter and check the list for the matching Uuid. Update all the variables
    public List<Song> updateSong(Song song){
        for (Song x: songList) {
            if(song.getUuid().equals(x.getUuid())){
               /* This is an alternate way of updating the song if u only want individual updates
               x.setName(song.getName());
               x.setArtist(song.getArtist());
               x.setDuration(song.getDuration());
               x.setReleaseDate(song.getReleaseDate());*/
               songList.set(songList.indexOf(x),song);
            }
        }
        return songList;
    }

        public List<Song> deleteSong(Song song){
        songList.removeIf(x -> song.getUuid().equals(x.getUuid()));
        return songList;
    }

}
