package com.jyc.volunteer.controller;

import com.jyc.volunteer.entity.VolunteerInfo;
import com.jyc.volunteer.service.impl.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/volunteer")
public class VolunteerController {

    @Resource
    private VolunteerService volunteerService;
    @GetMapping("/getOne")
    public VolunteerInfo getOne(String id) {
        if (id != null) {
            Integer idInt = Integer.parseInt(id);
            return volunteerService.getVolunteerInfoByID(idInt);
        }
        return null;
    }
    @PostMapping("/save")
    public Boolean insert(VolunteerInfo volunteerInfo){
        if(volunteerInfo!=null){
            if(volunteerInfo.getId()!=null){
                return volunteerService.insertVolunteerInfo(volunteerInfo);
            }else{
                return volunteerService.update(volunteerInfo);
            }

        }
        return false;
    }
    @GetMapping("/delete")
    public Boolean delete(String id){
        if(id!=null){
            Integer idInt = Integer.parseInt(id);
            return volunteerService.deleteById(idInt);
        }
        return false;
    }
    @PostMapping("/queryByCondition")
    public List<VolunteerInfo>  queryByCondition(HashMap<String,Object> map){
        if(map!=null&&!map.isEmpty()){
            return volunteerService.queryByCondition(map);
        }
        return null;
    }

}
