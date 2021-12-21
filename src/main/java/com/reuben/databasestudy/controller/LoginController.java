package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.dto.LoginResult;
import com.reuben.databasestudy.entity.Referee;
import com.reuben.databasestudy.entity.Team;
import com.reuben.databasestudy.mapper.RefereeMapper;
import com.reuben.databasestudy.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    RefereeMapper refereeMapper;
    @Autowired
    TeamMapper teamMapper;

    @GetMapping("/login")
    LoginResult getResult(String account, String password){
        LoginResult result = new LoginResult();
        if(account.equals("root")){     //管理员用户
            if(password.equals("123456")){
                result.setAccountType(0);
                result.setId(0);
                return result;
            }
        }
        Referee referee = refereeMapper.selectPassword(account);
        if(referee != null){
            if(password.equals(referee.getPassword())){
                result.setAccountType(1);
                result.setId(referee.getId());
                return result;
            }
        }
        Team team = teamMapper.selectPassword(account);
        if(team != null){
            if(password.equals(team.getPassword())){
                result.setAccountType(2);
                result.setId(team.getId());
                return result;
            }
        }
        return null;
    }
}
