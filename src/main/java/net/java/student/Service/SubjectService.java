package net.java.student.Service;

import net.java.student.Entity.Class;
import net.java.student.Entity.Subject;
import net.java.student.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    //show  duoi dang json
    public List<Subject> list(){
        return repository.findAll();
    }

    //them  vao table
    public Subject save(Subject subject){
        return repository.save(subject);
    }

    //lay  theo dang sinh vien
    public Subject get(Integer id){
        return repository.findById(id).get();
    }

    //xoa  theo id
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
