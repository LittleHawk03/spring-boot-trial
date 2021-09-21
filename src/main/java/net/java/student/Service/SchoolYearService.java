package net.java.student.Service;

import net.java.student.Entity.Class;
import net.java.student.Entity.SchoolYear;
import net.java.student.Repository.SchoolYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolYearService {
    @Autowired
    private SchoolYearRepository repository;

    //show  duoi dang json
    public List<SchoolYear> list(){
        return repository.findAll();
    }

    //them  vao table
    public SchoolYear save(SchoolYear schoolYear){
        return repository.save(schoolYear);
    }

    //lay  theo dang sinh vien
    public SchoolYear get(Integer id){
        return repository.findById(id).get();
    }

    //xoa  theo id
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
