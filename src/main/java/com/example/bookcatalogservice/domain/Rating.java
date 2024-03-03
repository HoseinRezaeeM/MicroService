package com.example.bookcatalogservice.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Rating {
    private String bookId;
    private int rating;
}
