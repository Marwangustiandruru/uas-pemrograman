package com.example.menu.menu;
@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {
 private final Logger LOG =
LoggerFactory.getLogger(SpringDataJpaApplication.class);
 @Autowired
 private BookRepository bookRepository;
 public static void main(String[] args) {
 SpringApplication.run(SpringDataJpaApplication.class, args);
 }
 @Override
 public void run(String... args) throws Exception {
 Book book1 = new Book();
 book1.setTitle("Belajar Spring Boot");
 book1.setWriter("MARWAN");
 book1.setIsbn("IS-90908");
 Book book2 = new Book();
 book2.setTitle("Belajar Spring Boot 2");
 book2.setWriter("GUSTIA");
 book2.setIsbn("IS-9090890");
 bookRepository.save(book1);
 bookRepository.save(book2);
 LOG.info("Berhasil menyimpan "+book1);
 LOG.info("Berhasil menyimpan "+book2);
 }
}