package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class MyStudentRecordsMgmtApp {
        public static void main(String[] args) {
            Student[] Students = {
                    new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
                    new Student(110002, "Anna", LocalDate.of(1990, 12, 07)),
                    new Student(110003, "Erica", LocalDate.of(1974, 1, 31)),
                    new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
                    new Student(110005, "Bob", LocalDate.of(1990, 3, 05))
            };
            printListOfStudents(Students);
            getListOfPlatinumAlumniStudents(Students);
            printHelloWorld(new int[] {5, 7, 35, 70});
            System.out.println(findSecondBiggest(new int[] {1,2,3,4,5}));
            System.out.println(findSecondBiggest(new int[] {19,9,11,0,12}));
        }

        public static void printListOfStudents(Student[] Students) {
            Arrays.sort(Students, (a,b) -> a.getName().compareTo(b.getName()));
            System.out.println("Problem 5.3");
            for(int i = 0; i < Students.length; i++) {
                System.out.println("StudentId: " + Students[i].getStudentId() + " Name: " + Students[i].getName() +
                        " DateOfAdmission: " + Students[i].getDateOfAdmission());
            }
        }

        public static void getListOfPlatinumAlumniStudents(Student[] Students) {
            Arrays.sort(Students, (a,b) -> b.getDateOfAdmission().compareTo(a.getDateOfAdmission()));
            System.out.println("Problem 5.4");
            for(int i = 0; i < Students.length; i++) {
                if(Period.between(Students[i].getDateOfAdmission(), LocalDate.now()).getYears() >= 30) {
                    System.out.println("StudentId: " + Students[i].getStudentId() + " Name: " + Students[i].getName() +
                            " DateOfAdmission: " + Students[i].getDateOfAdmission());
                }
            }
        }
        public static void printHelloWorld(int[] arr) {
            System.out.println("Problem 5.1");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                    System.out.println("HelloWorld");
                } else if(arr[i] % 5 == 0) {
                    System.out.println("Hello");
                } else if(arr[i] % 7 == 0) {
                    System.out.println("World");
                }
            }
        }
        public static int findSecondBiggest(int[] arr) {
            System.out.println("Problem 5.2");
            int biggest = 0;
            int secondBiggest = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > biggest) {
                    secondBiggest = biggest;
                    biggest = arr[i];
                } else if(arr[i] > secondBiggest) {
                    secondBiggest = arr[i];
                }
            }
            return secondBiggest;
        }
    }


