package com.example.menu.menu;
import id.belajar.springdatajpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {

}