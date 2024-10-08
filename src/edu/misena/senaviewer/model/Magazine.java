package edu.misena.senaviewer.model;
public class Magazine extends Publication {
    public int id;
    public String title;
    public String editionDate;
    public String editorial;
    public String authors;

    // Constructor
    public Magazine(String title, String editionDate, String editorial) {
 super(title,editionDate,editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public String getAuthors() {
        return authors;
    }
    @Override
    public String toString() {
        return "Magazine{" +
                super.toString() +
                ", id=" + id +
                ", title=" + title +
                ", EditorialDate=" + editionDate +
                ", editorial=" + editorial +
                ", authors=" + authors +

                '}';
    }
}

