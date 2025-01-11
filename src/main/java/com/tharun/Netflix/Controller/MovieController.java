package com.tharun.Netflix.Controller;

import com.tharun.Netflix.Model.Movies;
import com.tharun.Netflix.Service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/movies")
    public ResponseEntity<List<Movies>> getAll() {
        List<Movies> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
    @GetMapping("/movies/{id}")
    public ResponseEntity<Movies> getSingleMovie(@PathVariable String id) {
        Optional<Movies> movies = movieService.findById(id);
        if(movies.isPresent())return new ResponseEntity<>(movies.get(), HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Movies> saveMovie(@RequestBody Movies movie) {
        Movies savedMovie = movieService.saveMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

}
