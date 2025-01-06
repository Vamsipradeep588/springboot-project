package com.example.springboot_project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot_project.model.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {


}