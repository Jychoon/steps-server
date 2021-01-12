package com.jyc.volunteer.dao;

import com.jyc.volunteer.entity.OldManInfo;

import java.util.List;

public interface OldManInfoDao {

    OldManInfo queryById(Integer id);
    List<OldManInfo> queryAll();
    int insert(OldManInfo oldManInfo);
    int deleteById(Integer id);
    int update(OldManInfo oldManInfo);

}
