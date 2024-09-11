package com.microservice.course.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
@Entity
@Table(name = "coursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String teacher;
}
