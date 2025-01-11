package com.tharun.Netflix.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference
    private List<Review> reviews;

    public Movies(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public Movies setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
        return this;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Movies setGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public Movies setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getImdbId() {
        return imdbId;
    }

    public Movies setImdbId(String imdbId) {
        this.imdbId = imdbId;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public Movies setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Movies setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Movies setReviews(List<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Movies setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public Movies setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
        return this;
    }
}