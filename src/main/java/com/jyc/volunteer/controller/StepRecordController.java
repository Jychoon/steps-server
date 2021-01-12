package com.jyc.volunteer.controller;

import com.jyc.volunteer.entity.StepRecord;
import com.jyc.volunteer.service.StepRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/step")
public class StepRecordController {

    @Resource
    private StepRecordService stepRecordService;

    @GetMapping("/getByOldManId")
    public List<StepRecord> getByOldManId(String oldManId){
        if(oldManId!=null){
            Integer oldManIdInt = Integer.parseInt(oldManId);
            return stepRecordService.queryStepRecordByOldManId(oldManIdInt);
        }
        return null;
    }

    @PostMapping("/insert")
    public Boolean insert(StepRecord stepRecord){
        if(stepRecord!=null){
            return stepRecordService.insert(stepRecord);
        }
        return false;
    }
}
