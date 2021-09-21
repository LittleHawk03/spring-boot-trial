package net.java.student.Controller;

import net.java.student.Entity.LoginStudent;
import net.java.student.Entity.Student;
import net.java.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@RestController
@RequestMapping("api/logins")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list(){
        return service.list();
    }

    @PostMapping("/students")
    public Student CreStudent(@Valid @RequestBody Student student){
        return service.save(student);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getByID(@PathVariable(value = "id") Integer id){
        try{
            Student student = service.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<?> Update(@RequestBody Student student,@PathVariable(value = "id") Integer id){
        try {
            Student SetStudent = service.get(id);
            SetStudent.setName(student.getName());
            SetStudent.setAddress(student.getAddress());
            SetStudent.setGender(student.getGender());
            SetStudent.setMaLop(student.getMaLop());
            SetStudent.setBirthDay(student.getBirthDay());
            SetStudent.setDanToc(student.getDanToc());
            SetStudent.setCCCD(student.getCCCD());
            SetStudent.setPhone(student.getPhone());
            SetStudent.setEmail(student.getEmail());
            service.save(SetStudent);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> Delete(@PathVariable(value = "id") Integer id){
        try {
            service.delete(id);
            return ResponseEntity.ok().build();
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
