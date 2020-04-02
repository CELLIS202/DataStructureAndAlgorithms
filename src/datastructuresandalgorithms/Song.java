/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

/**
 *
 * @author Cameron
 */
public class Song {
    int trackId;
    String trackTitle;
    String artist;
    int trackLength;
    String composer;
    int releaseDate;
    String album;
    String genre;
    
    Song(int trackId, String trackTitle, String artist, int trackLength, String composer, int releaseDate, String album, String genre){
        this.trackId= trackId;
        this.artist= artist;
        this.trackLength= trackLength;
        this.composer= composer;
        this.releaseDate= releaseDate;
        this.album= album;
        this.genre= genre;
    }
    
    int getTrackId() {
        return trackId;
    }
    String getArtist() {
        return artist;
    }
    int getTrackLength() {
        return trackLength;
    }
    String getComposer() {
        return composer;
    }
    int getReleaseDate() {
        return releaseDate;
    }
    String getAlbum() {
        return album;
    }
    String getGenre() {
        return genre;
    }
    void setTrackId (int trackId) {
        this.trackId = trackId;
    }
    void setArtist (String artist) {
        this.artist = artist;
    }
    void setTrackLength (int trackLength) {
        this.trackLength = trackLength;
    }
    void setComposer (String composer) {
        this.composer = composer;
    }
    void setReleaseDate (int releaseDate) {
        this.releaseDate = releaseDate;
    }
    void setAlbum (String album) {
        this.album = album;
    }
    void setGenre (String genre) {
        this.genre = genre;
    }
    
}


   
    

