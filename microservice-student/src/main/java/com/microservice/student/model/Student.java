package com.microservice.student.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@Entity
@Table(name = "estudiante")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "id_course")
    private Long idCourse;

}
