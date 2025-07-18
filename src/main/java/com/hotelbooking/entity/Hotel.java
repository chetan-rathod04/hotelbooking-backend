package com.hotelbooking.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "hotels")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    private String id;

    @Indexed(unique = true)
    private String hotelNumber;
    private String name;
    private String location;
    private double pricePerNight;
    private boolean available;

    // Getters & Setters
}
