package com.reuben.databasestudy.service;

import com.reuben.databasestudy.entity.AthleteDetail;
import org.springframework.stereotype.Service;

@Service
public class AthleteService {
    public AthleteDetail getAthleteById(int id){
        AthleteDetail detail = new AthleteDetail();

        return detail;
    }
}
