package edu.misena.senaviewer.model;

public class Book extends Publication {

    public int id;
    public String title;
    public String edititionDate;
    public String editorial;
    public String  authors;
    public String isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title, String edititionDate, String editorial, String isbn) {
super(title,edititionDate,editorial);
    }

    // Getters y setters  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getEdititionDate() {
        return edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        final String authors1 = this.authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                ", id=" + id +
                ", title=" + title +
                ", EditorialDate=" + edititionDate +
                ", editorial=" + editorial +
                ", authors=" + authors +
                ", isbn=" + isbn +
                ", readed=" + readed +
                ", TimeReaded=" + timeReaded +

                '}';
    }
}  
