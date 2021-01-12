package com.jyc.volunteer.dao;

import com.jyc.volunteer.entity.VolunteerInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface VolunteerInfoDao {

    VolunteerInfo queryById(Integer id);

    int insert(VolunteerInfo volunteerInfo);

    int deleteById(Integer id);

    int update(VolunteerInfo volunteerInfo);

    List<VolunteerInfo> queryByBirthday(@Param("startTime") String startTime,@Param("endTime") String endTime);

    List<VolunteerInfo> queryByOccupation(String occupation);

    List<VolunteerInfo> queryByEducation(String education);

}
