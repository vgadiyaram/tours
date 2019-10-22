package com.developer.tours.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_group")

public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String addressLineTwo;
    private String addressLineThree;

    @NonNull
    private String name;
    private String addressLineOne;
    private String city;
    private String stateOrProvince;
    private String country;
    private String zipcode;

    @ManyToOne(cascade= CascadeType.PERSIST)
    private User user;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Event> events;
}
