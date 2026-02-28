package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.LibraryModel;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryModel, Long> {

    List<LibraryModel> findByTitle(String title);
    List<LibraryModel> findByAuthor(String author);
}