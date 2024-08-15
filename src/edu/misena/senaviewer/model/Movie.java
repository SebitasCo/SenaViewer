package edu.misena.senaviewer.model;

public class Movie {
    public int id;
    public String title;
    public String genre;
    public String creator;
    public int duration;
    public int year;
    public boolean viewed;
    public int timeViewed;


    public void Movie(String title, String genre, String creator, int duration, int year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;

    }
}

