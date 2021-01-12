package com.jyc.volunteer.service;

import com.jyc.volunteer.entity.OldManInfo;
import com.jyc.volunteer.entity.StepRecord;

import java.util.List;

public interface StepRecordService {

    /**
     * 查询这个老人的所有步数信息
     * @param oldManId
     * @return
     */
    public List<StepRecord> queryStepRecordByOldManId(Integer oldManId);

    /**
     * 插入老人的步数信息
     * @param stepRecord
     * @return
     */
    public Boolean insert(StepRecord stepRecord);
}
