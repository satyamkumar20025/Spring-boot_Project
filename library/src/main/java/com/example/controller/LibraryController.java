package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.LibraryModel;
import com.example.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    // Create
    @PostMapping("/add")
    public LibraryModel saveLibrary(@RequestBody LibraryModel library) {
        return libraryService.saveLibrary(library);
    }

    // display  All
    @GetMapping("/all")
    public List<LibraryModel> getAllLibrary() {
        return libraryService.getAllLibrary();
    }

    // display By Id
    @GetMapping("/{id}")
    public LibraryModel getLibraryById(@PathVariable Long id) {
        return libraryService.getLibraryById(id);
    }

    // display By Author
    @GetMapping("/author/{author}")
    public List<LibraryModel> getLibraryByAuthor(@PathVariable String author) {
        return libraryService.getLibraryByAuthor(author);
    }

    // display By Title
    @GetMapping("/title/{title}")
    public List<LibraryModel> getLibraryByTitle(@PathVariable String title) {
        return libraryService.getLibraryByTitle(title);
    }

    // Update
    @PutMapping("/update/{id}")
    public LibraryModel updateLibrary(@PathVariable Long id, @RequestBody LibraryModel library) {
        return libraryService.updateLibrary(id, library);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public String deleteLibrary(@PathVariable Long id) {
        return libraryService.deleteLibrary(id);
    }
}