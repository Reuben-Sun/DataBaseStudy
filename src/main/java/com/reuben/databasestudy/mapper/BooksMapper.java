package com.reuben.databasestudy.mapper;

import com.reuben.databasestudy.entity.Book;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface BooksMapper {
    List<Book> findAll();
}
