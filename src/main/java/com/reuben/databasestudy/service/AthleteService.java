package com.reuben.databasestudy.service;

import com.reuben.databasestudy.dto.AthleteDetail;
import com.reuben.databasestudy.entity.Attend;
import com.reuben.databasestudy.entity.Event;
import com.reuben.databasestudy.mapper.AthleteDetailMapper;
import com.reuben.databasestudy.mapper.AttendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AthleteService {
    @Autowired
    AthleteDetailMapper athleteDetailMapper;
    @Autowired
    AttendMapper attendMapper;

    public AthleteDetail getAthleteById(int id){
        AthleteDetail detail = athleteDetailMapper.selectById(id);
        return detail;
    }
    
    public int insertAthlete(AthleteDetail detail){
        int i = athleteDetailMapper.insertAthlete(detail.getAthlete()); //运动员主键
        List<Event> events = detail.getEvents();
        for (Event e : events) {
            Attend attend = new Attend();
            attend.setAthleteId(detail.getAthlete().getId());
            attend.setEventId(e.getId());
            athleteDetailMapper.insertAttend(attend);
        }
        return i;
    }

    public List<AthleteDetail> getAllAthlete(){
        List<AthleteDetail> details = athleteDetailMapper.selectAll();
        return details;
    }

    public List<AthleteDetail> getAthleteByEvent(Integer eventId){
        List<Attend> attends = attendMapper.selectByEvent(eventId);
        List<AthleteDetail> details = new ArrayList<AthleteDetail>();
        for (Attend item:
             attends) {
            details.add(athleteDetailMapper.selectById(item.getAthleteId()));
        }
        return details;
    }
}
