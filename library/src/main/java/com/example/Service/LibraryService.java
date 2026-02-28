package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.LibraryModel;
import com.example.repository.LibraryRepository;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    // Create
    public LibraryModel saveLibrary(LibraryModel library) {
        return libraryRepository.save(library);
    }

    // Get All
    public List<LibraryModel> getAllLibrary() {
        return libraryRepository.findAll();
    }

    // Get By Id
    public LibraryModel getLibraryById(Long id) {
        return libraryRepository.findById(id).orElse(null);
    }

    // Get By Author
    public List<LibraryModel> getLibraryByAuthor(String author) {
        return libraryRepository.findByAuthor(author);
    }

    // Get By Title
    public List<LibraryModel> getLibraryByTitle(String title) {
        return libraryRepository.findByTitle(title);
    }

    // Update
    public LibraryModel updateLibrary(Long id, LibraryModel library) {
        LibraryModel oldLibrary = libraryRepository.findById(id).orElse(null);

        if (oldLibrary != null) {
            oldLibrary.setTitle(library.getTitle());
            oldLibrary.setAuthor(library.getAuthor());
            oldLibrary.setPrice(library.getPrice());
            oldLibrary.setAvailable(library.isAvailable());
            return libraryRepository.save(oldLibrary);
        }
        return null;
    }

    // Delete
    public String deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
        return "Library with id " + id + " deleted successfully";
    }
}