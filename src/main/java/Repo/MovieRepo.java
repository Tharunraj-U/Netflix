package Repo;

import Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo  extends MongoRepository<Movies,Object> {
}
