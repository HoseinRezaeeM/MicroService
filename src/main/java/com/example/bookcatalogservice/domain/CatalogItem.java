package com.example.bookcatalogservice.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CatalogItem {
    String name;
    String desc;
    int rating;
}
