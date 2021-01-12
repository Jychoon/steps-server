package com.jyc.volunteer.service;

import com.jyc.volunteer.entity.OldManInfo;

import java.util.List;

public interface OldManService {

    /**
     * 根据id查找老人信息
     * @param id
     * @return
     */
    public OldManInfo queryById(Integer id);

    /**
     * 查询所有老人信息
     * @return
     */
    public List<OldManInfo> queryAll();

    /**
     * 插入
     * @param oldManInfo
     * @return
     */
    public Boolean insert(OldManInfo oldManInfo);

    /**
     * 根据用户id来删除
     * @param id
     * @return
     */
    public Boolean deleteById(Integer id);

    /**
     * 更新用户信息
     * @param oldManInfo
     * @return
     */
    public Boolean update(OldManInfo oldManInfo);
}
