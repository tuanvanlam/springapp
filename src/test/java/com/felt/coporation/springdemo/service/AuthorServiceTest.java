package com.felt.coporation.springdemo.service;


import com.felt.coporation.springdemo.entity.Author;
import com.felt.coporation.springdemo.repository.AuthorRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AuthorServiceTest {
    @Mock
    private AuthorRepository authorRepositoryMock;

    @InjectMocks
    private AuthorService authorService;

    @Test
    public void getAllAuthorTest() {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Tuan"));
        authors.add(new Author("Linh"));
        authors.add(new Author("Cong"));

        Mockito.when(authorRepositoryMock.findAll()).thenReturn(authors);

        List<Author> actualAuthor = authorService.getAll();

        Assert.assertEquals(3, actualAuthor.size());
    }
}
