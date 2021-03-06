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
        int i = athleteDetailMapper.insertAthlete(detail.getAthlete());
        List<Event> events = detail.getEvents();
        for (Event e : events) {
            Attend attend = new Attend();
            attend.setAthleteId(detail.getAthlete().getId());
            attend.setEventId(e.getId());
            attend.setGroupId(1);
            athleteDetailMapper.insertAttend(attend);
        }
        return i;
    }

    public List<AthleteDetail> selectAthleteByTeam(int teamId){
        List<AthleteDetail> details = athleteDetailMapper.selectByTeam(teamId);
        return details;
    }
//    public int insertAthleteWithGroup(AthleteDetail detail, int groupId){
//        int i = athleteDetailMapper.insertAthlete(detail.getAthlete()); //运动员主键
//        List<Event> events = detail.getEvents();
//        for (Event e : events) {
//            Attend attend = new Attend();
//            attend.setAthleteId(detail.getAthlete().getId());
//            attend.setEventId(e.getId());
//            attend.setGroupId(groupId);
//            athleteDetailMapper.insertAttend(attend);
//        }
//        return i;
//    }
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

    public List<AthleteDetail> getAthleteByGroup(int groupId){
        List<Attend> attends = attendMapper.selectByGroup(groupId);
        List<AthleteDetail> details = new ArrayList<AthleteDetail>();
        for (Attend item:
                attends) {
            details.add(athleteDetailMapper.selectById(item.getAthleteId()));
        }
        return details;
    }

    public int updateAthleteGroup(int athleteId, int eventId,int groupId){
        Attend attend = attendMapper.selectByEventAthlete(athleteId, eventId);
        int i = attendMapper.updateGroup(attend.getId(), groupId);
        return i;
    }
}
