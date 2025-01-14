package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Author;
import com.lambdaschool.starthere.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "authorService")
public class AuthorServiceImpl implements AuthorService
{
    @Autowired
    AuthorRepository authres;

    @Override
    public List<Author>findAll()
    {
        List<Author> myAuthors = new ArrayList();

        return myAuthors;
    }

    @Override
    public  Author save(Author author)

    {
        author.setFname(author.getFname());
        author.setLname(author.getLname());
        return authres.save(author);
    }
}
