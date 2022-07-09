package edu.miu.cs.cs425.eregistrar.Service;

import edu.miu.cs.cs425.eregistrar.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public abstract Student addStudent(Student student);
    public abstract List<Student> findAll();
    public abstract Student getStudentById(Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
    public abstract Student updateStudent(Student updated,Integer studentId);


}
