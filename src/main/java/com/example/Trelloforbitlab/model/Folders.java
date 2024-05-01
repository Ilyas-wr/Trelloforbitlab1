package com.example.Trelloforbitlab.model;


import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.util.List;
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Folders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<TaskCategories> categories;
}
