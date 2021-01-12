package com.jyc.volunteer.dao;

import com.jyc.volunteer.entity.StepRecord;

import java.util.List;

public interface StepRecordDao {

    List<StepRecord> queryByOldManId(Integer oldManId);

    int insert(StepRecord stepRecord);
}
