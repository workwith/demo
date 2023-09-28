package com.example.demo.web.serve;

import com.example.demo.web.dao.PracticeDao;
import com.example.demo.web.entity.PracticeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PracticeServe {
    private PracticeDao practiceDao;
    @Autowired
    public PracticeServe(PracticeDao practiceDao){
        this.practiceDao = practiceDao;
    }

    public  List<PracticeEntity> findAll(){
        return practiceDao.findData();
    }
}
