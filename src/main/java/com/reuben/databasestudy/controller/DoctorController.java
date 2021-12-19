package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Coach;
import com.reuben.databasestudy.entity.Doctor;
import com.reuben.databasestudy.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorMapper doctorMapper;

    @GetMapping("/selectAll")
    List<Doctor> selectAll(){
        List<Doctor> doctors = doctorMapper.selectAll();
        return doctors;
    }

    @GetMapping("/selectByTeam")
    Doctor selectByTeam(int teamId){
        Doctor doctor = doctorMapper.selectByTeam(teamId);
        return doctor;
    }

    @PostMapping("/addDoctor")
    int insertDoctor(@RequestBody Doctor doctor){
        int i = doctorMapper.insertDoctor(doctor);
        return i;
    }

    @PostMapping("/updateDoctor")
    int updateDoctor(@RequestBody Doctor doctor){
        int i = doctorMapper.updateDoctor(doctor);
        return i;
    }

    @GetMapping("/deleteDoctor")
    int deleteDoctor(int id){
        int i = doctorMapper.deleteDoctor(id);
        return i;
    }
}
