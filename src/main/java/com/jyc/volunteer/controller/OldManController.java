package com.jyc.volunteer.controller;

import com.jyc.volunteer.entity.OldManInfo;
import com.jyc.volunteer.entity.VolunteerInfo;
import com.jyc.volunteer.service.OldManService;
import com.jyc.volunteer.service.impl.VolunteerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/oldMan")
public class OldManController {

    @Resource
    private OldManService oldManService;
    @GetMapping("/getOne")
    public OldManInfo getOne(String id) {
        if (id != null) {
            Integer idInt = Integer.parseInt(id);
            return oldManService.queryById(idInt);
        }
        return null;
    }
    @PostMapping("/save")
    public Boolean insert(OldManInfo oldManInfo){
        if(oldManInfo!=null){
            if(oldManInfo.getId()!=null){
                return oldManService.insert(oldManInfo);
            }else{
                return oldManService.update(oldManInfo);
            }

        }
        return false;
    }
    @GetMapping("/delete")
    public Boolean delete(String id){
        if(id!=null){
            Integer idInt = Integer.parseInt(id);
            return oldManService.deleteById(idInt);
        }
        return false;
    }
}
