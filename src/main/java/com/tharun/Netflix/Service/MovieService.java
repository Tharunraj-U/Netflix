package com.tharun.Netflix.Service;

import com.tharun.Netflix.Model.Movies;

import com.tharun.Netflix.Repo.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;



    public List<Movies> getAllMovies(){
      //  saveDummyMovies();
        return  movieRepo.findAll();
    }



    public Movies saveMovie(Movies movie) {
        return movieRepo.save(movie);
   }

    public Optional<Movies> findById(String id) {
        return movieRepo.findMovieByImdbId(id);
    }


}
