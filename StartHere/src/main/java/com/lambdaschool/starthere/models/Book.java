package com.lambdaschool.starthere.models;

import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;

@Entity
@Table(name ="Books")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long bookid;

    @Column(unique= true, nullable = false)
    private String booktitle;
    private String isbn;
    private int copy;

    //constructors

    public long getBookid()
    {
        return bookid;
    }

    public void setBookid(long bookid)
    {
        this.bookid = bookid;
    }

    public String getBooktitle()
    {
        return booktitle;
    }

    public void setBooktitle(String booktitle)
    {
        this.booktitle = booktitle;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getCopy()
    {
        return copy;
    }

    public void setCopy(int copy)
    {
        this.copy = copy;
    }

}
