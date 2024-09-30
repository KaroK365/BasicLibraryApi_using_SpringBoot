package com.example.BasicLibraryApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BasicLibraryApi.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    
}
