package com.example.bookcatalogservice.controller;

import com.example.bookcatalogservice.domain.Book;
import com.example.bookcatalogservice.domain.CatalogItem;
import com.example.bookcatalogservice.domain.Rating;
import com.example.bookcatalogservice.domain.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class BookCatalogController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogsItem(@PathVariable("userId") String userId) {

        UserRatings template = restTemplate.getForObject("https://book-rating-service/rating/user/1", UserRatings.class);

        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("456", 3)
        );

        return template.getUserRatings().stream().map(rating -> {
            Book book = restTemplate.getForObject("http://book-info-service/bookinfo/1", Book.class);
            return new CatalogItem(book.getName(), "list ", 5);
        }).collect(Collectors.toList());
    }
}
