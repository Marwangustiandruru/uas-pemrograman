package com.example.menu;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(nullable = false)
 private String title;
 @Column(nullable = false)
 private String writer;
 @Column(nullable = false)
 private String isbn;
private String price;

 public Book() {
 }
 public Long getId() {
 return id;
 }
 public void setId(Long id) {
 this.id = id;
 }
 public String getTitle() {
 return title;
 }
 public void setTitle(String title) {
 this.title = title;
 }
 public String getWriter() {
 return writer;
 }
 public void setWriter(String writer) {
 this.writer = writer;
 }
 public String getIsbn() {
 return isbn;
 }
 public void setIsbn(String isbn) {
 this.isbn = isbn;
public String getPrice() {
 return price;
 }
public void setPrice(String price) {
 this.price = price;
 }
}
