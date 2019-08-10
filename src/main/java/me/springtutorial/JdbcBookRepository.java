package me.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcBookRepository implements BookRepository {

	// Spring Boot will create and configure DataSource and JdbcTemplate
	// To use it, just @Autowired
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Book book) {
        return jdbcTemplate.update(
                "insert into book (name, price) values(?,?)",
                book.getName(), book.getPrice());
    }

}