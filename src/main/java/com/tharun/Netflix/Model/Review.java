package com.tharun.Netflix.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Review {
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    public String getBody() {
        return body;
    }

    public Review setBody(String body) {
        this.body = body;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Review setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public Review setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public Review setUpdated(LocalDateTime updated) {
        this.updated = updated;
        return this;
    }
}