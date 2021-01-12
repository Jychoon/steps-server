package com.jyc.volunteer.service.impl;

import com.jyc.volunteer.dao.OldManInfoDao;
import com.jyc.volunteer.entity.OldManInfo;
import com.jyc.volunteer.service.OldManService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OldManServiceImpl implements OldManService {

    @Resource
    private OldManInfoDao oldManInfoDao;
    @Override
    public OldManInfo queryById(Integer id) {
        if(id!=null){
            return oldManInfoDao.queryById(id);
        }
        return null;
    }

    @Override
    public List<OldManInfo> queryAll() {
        return oldManInfoDao.queryAll();
    }

    @Override
    public Boolean insert(OldManInfo oldManInfo) {
        if(oldManInfo!=null){
             if(oldManInfoDao.insert(oldManInfo)==1){
                 return true;
             }
        }
        return false;
    }

    @Override
    public Boolean deleteById(Integer id) {
        if(id!=null){
            if(oldManInfoDao.deleteById(id)==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean update(OldManInfo oldManInfo) {
        if(oldManInfo!=null){
            if(oldManInfoDao.update(oldManInfo)==1){
                return true;
            }
        }
        return false;
    }
}
