package edu.miu.cs.cs425.eregistrar.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    @ToString.Include
    @Column(unique = true)
    private String studentNumber;
    @ToString.Include
    @Column(nullable = false)
    String FirstName;
    @ToString.Include
    private String MiddleName;
    @ToString.Include
    @Column(nullable = false)
    private String LastName;
    @ToString.Include
    @Column(nullable = false)
    private double cgpa;
    @ToString.Include
    @Column(nullable = false)
    private LocalDate enrollmentDate;
    @ToString.Include
    @Column(nullable = false)
    private String  isInternational;



}
