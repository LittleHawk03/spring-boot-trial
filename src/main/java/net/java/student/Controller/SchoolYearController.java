package net.java.student.Controller;

import net.java.student.Entity.SchoolYear;
import net.java.student.Entity.StudyProgram;
import net.java.student.Repository.SchoolYearRepository;
import net.java.student.Service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/api/logins/students/classes")
public class SchoolYearController {

    @Autowired
    private SchoolYearService service;

    @GetMapping("/schoolYears")
    public List<SchoolYear> list(){

        return service.list();
    }

    @PostMapping("/schoolYears")
    public SchoolYear CreSchoolYear(@Valid @RequestBody SchoolYear schoolYear){
        return service.save(schoolYear);
    }

    @GetMapping("/schoolYears/{id}")
    public ResponseEntity<SchoolYear> getByID(@PathVariable(value = "id") Integer id){
        try{
            SchoolYear schoolYear = service.get(id);
            return new ResponseEntity<SchoolYear>(schoolYear, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<SchoolYear>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/schoolYears/{id}")
    public ResponseEntity<?> Update(@RequestBody SchoolYear schoolYear,@PathVariable(value = "id") Integer id){
        try {
            SchoolYear SetschoolYear = service.get(id);
            SetschoolYear.setYearStart(schoolYear.getYearStart());
            SetschoolYear.setYearEnd(schoolYear.getYearEnd());
            service.save(SetschoolYear);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/schoolYears/{id}")
    public ResponseEntity<?> Delete(@PathVariable(value = "id") Integer id){
        try {
            service.delete(id);
            return ResponseEntity.ok().build();
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
