package edu.misena.senaviewer.model;

public class Film {
    public int id;
    public String title;
    public String genre;
    public String creator;
    public int duration;
    public int year;
    public boolean viewed;

    // Constructor
    public Film(String title, String genre, String creator, int duration) {

        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getCreator() {
        return creator;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}



