package com.example.bookcatalogservice.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserRatings {

    private List<Rating> userRatings;
}
