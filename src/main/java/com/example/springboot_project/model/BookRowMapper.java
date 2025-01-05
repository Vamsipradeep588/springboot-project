package com.example.springboot_project.model;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Book (
            rs.getInt("Id"),
            rs.getString("name"),
            rs.getString("imageUrl")
        );
    }
}