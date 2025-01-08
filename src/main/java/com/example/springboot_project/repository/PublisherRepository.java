package com.example.springboot_project.repository;

import com.example.springboot_project.model.Publisher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PublisherRepository {

    ArrayList<Publisher> getPublishers();

    Publisher getPublisherById(Integer publisherId);

    Publisher addPublisher(Publisher publisher);

    Publisher updatePublisher(int publisherId, Publisher publisher);

    void deletePublisher(int publisherId);
}
