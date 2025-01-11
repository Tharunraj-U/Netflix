package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collation = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    @Id
    private  Object id;
    private  String imdbId;
    private String title;
    private  String releaseDate;
    private  String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private  List<String> reviewIds;

}
