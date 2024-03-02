package com.example.ratingresource.controller;

import com.example.ratingresource.domain.Rating;
import com.example.ratingresource.domain.UserRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingResourceController {
    @GetMapping("/{bookId}")
    public Rating getRatingResource(@PathVariable("bookId") String bookId) {
        return new Rating(bookId, 4);
    }

    @GetMapping("/user/{userId}")
    public UserRatings getRatingResources(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating(
                        "123", 4
                ),
                new Rating(
                        "456", 7
                )
        );
        return new UserRatings(ratings);
    }
}
