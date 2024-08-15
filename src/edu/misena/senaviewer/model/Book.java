package edu.misena.senaviewer.model;

public class Book {
    // Atributos de la clase
    public int id;
    public String title;
    public String edititionDate;
    public String editorial;
    public String  authors;
    public String isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title, String edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
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
}  
