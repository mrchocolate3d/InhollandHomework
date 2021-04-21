package nl.inholland.myfirstapi.controller;

import nl.inholland.myfirstapi.model.Song;
import nl.inholland.myfirstapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value ="songs")
public class SongController {

    private SongService service;

    public SongController(SongService service){
        this.service = service;
    }


    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Song>> getSongs(){
        return ResponseEntity.status(200).body(service.getSongList());
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Song> createSong(@RequestBody Song song){
        service.createSong(song);
        return ResponseEntity.status(201).body(song);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Song>> updateSong(@RequestBody Song song){
        service.updateSong(song);
        return ResponseEntity.status(200).body(service.getSongList());
    }

    @RequestMapping(value = "",method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Song>> deleteSong(@RequestBody Song song){
        service.deleteSong(song);
        return ResponseEntity.status(200).body(service.getSongList());
    }

}
