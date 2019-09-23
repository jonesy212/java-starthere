package com.lambdaschool.starthere.models;

import javax.persistence.*;


@Entity
@Table(name = "authors")
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long authorid;

    @Column
    private String lname;
    private String fname;


    public long getAuthorid()
    {
        return authorid;
    }

    public void setAuthorid(long authorid)
    {
        this.authorid = authorid;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }
}
