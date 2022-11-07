package com.movie.service.movieService.Service;

import com.movie.service.movieService.Model.Movie;
import com.movie.service.movieService.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;


    public List<Movie> getMovies(){
        List<Movie> result = repository.findAll();
        return result;
    }

    public String saveMovie(Movie movie){
        Movie savedMovie = repository.save(movie);
        return "{" +
                "\"message\":"+"\"Successfully Created A Movie\","+
                "\"data\":"+savedMovie+"}";
    }

    public String deleteMovies(ObjectId id) {
        repository.deleteById(id);
        return "Successfully deleted.";
    }

    public String updateMovies(Movie movie) {
        repository.save(movie);
        return "Successfully updated.";
    }
}
