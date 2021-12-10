package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BooksMapperTest {

    @Autowired
    BooksMapper booksMapper;
    @Test
    void findAll() {
        List<Book> all = booksMapper.findAll();
        assertEquals(3, all.size());

    }
}