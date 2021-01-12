package com.jyc.volunteer.service.impl;

import com.jyc.volunteer.dao.StepRecordDao;
import com.jyc.volunteer.dao.VolunteerInfoDao;
import com.jyc.volunteer.entity.StepRecord;
import com.jyc.volunteer.entity.VolunteerInfo;
import com.jyc.volunteer.service.StepRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class StepRecordServiceImpl implements StepRecordService {


    @Resource
    private StepRecordDao stepRecordDao;
    @Override
    public List<StepRecord> queryStepRecordByOldManId(Integer oldManId) {
        if(oldManId!=null){
            return stepRecordDao.queryByOldManId(oldManId);
        }
        return null;
    }

    @Override
    public Boolean insert(StepRecord stepRecord) {
        if(stepRecord!=null){
            if(stepRecordDao.insert(stepRecord)==1){
                return true;
            }
        }
        return null;
    }
}
