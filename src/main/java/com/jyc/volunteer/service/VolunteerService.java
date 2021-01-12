package com.jyc.volunteer.service.impl;

import com.jyc.volunteer.dao.VolunteerInfoDao;
import com.jyc.volunteer.entity.VolunteerInfo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

public interface VolunteerService {

    /**
     * 根据id获取志愿者信息
     * @param id
     * @return
     */
    public VolunteerInfo getVolunteerInfoByID(Integer id);

    /**
     * 解析 map,插入一条新的志愿者信息
     * @return 返回是否插入成功的信息
     */
    public Boolean insertVolunteerInfo(VolunteerInfo volunteerInfo);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    public Boolean deleteById(Integer id);

    /**
     * 解析map并更新表
     * @return
     */
    public Boolean update(VolunteerInfo volunteerInfo);

    /**
     * map里有type
     * 根据type判断为哪一条件的查找
     * type为 0 按年龄查找 1 职业 2 文化程度
     * @param map
     * @return
     */
    public List<VolunteerInfo> queryByCondition(HashMap<String,Object> map);
}
