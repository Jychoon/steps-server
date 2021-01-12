package com.jyc.volunteer.service.impl;

import com.jyc.volunteer.dao.VolunteerInfoDao;
import com.jyc.volunteer.entity.VolunteerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.jyc.volunteer.service.impl.VolunteerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    @Resource
    private VolunteerInfoDao volunteerInfoDao;

    public VolunteerInfo getVolunteerInfoByID(Integer id){
        if(id!=null){
            return volunteerInfoDao.queryById(id);
        }
        return null;
    }

    @Override
    public Boolean insertVolunteerInfo(VolunteerInfo volunteerInfo) {
        if(volunteerInfo!=null){
            if(volunteerInfoDao.insert(volunteerInfo)==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean deleteById(Integer id) {
        if(id!=null){
            if(volunteerInfoDao.deleteById(id)==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean update(VolunteerInfo volunteerInfo) {
        if(volunteerInfo!=null){
            if(volunteerInfoDao.update(volunteerInfo)==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<VolunteerInfo> queryByCondition(HashMap<String, Object> map) {
        if(map!=null&&!map.isEmpty()){
            String type = (String) map.get("type");
            if(type!=null){
                if(type.equals("0")){
                    String startTime = (String) map.get("startTime");
                    String endTime = (String) map.get("endTime");
                    if(startTime!=null&&endTime!=null){
                        return volunteerInfoDao.queryByBirthday(startTime,endTime);
                    }
                }else if(type.equals("1")){
                    String occupation = (String) map.get("occupation");
                    if(occupation!=null){
                        return volunteerInfoDao.queryByOccupation(occupation);
                    }
                }else if(type.equals("2")){
                    String education = (String) map.get("education");
                    if(education!=null){
                        return volunteerInfoDao.queryByEducation(education);
                    }
                }
            }
        }
        return null;
    }

    public VolunteerInfo parseMap(HashMap<String,Object> map){
        String name = (String) map.get("name");
        String phone = (String) map.get("phone");
        Integer gender = (Integer) map.get("gender");
        String birthday = (String) map.get("birthday");
        String occupation = (String) map.get("occupation");
        String education = (String) map.get("education");
        VolunteerInfo volunteerInfo =new VolunteerInfo();
        volunteerInfo.setName(name);
        volunteerInfo.setPhone(phone);
        volunteerInfo.setBirthday(birthday);
        volunteerInfo.setGender(gender);
        volunteerInfo.setOccupation(occupation);
        volunteerInfo.setEducation(education);
        return volunteerInfo;
    }
}
