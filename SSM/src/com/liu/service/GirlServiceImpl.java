package com.liu.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.mapper.GirlInfoMapper;
import com.liu.pojo.GirlInfo;

@Service
public class GirlServiceImpl {

    @Resource(name = "girlInfoMapper")
    private GirlInfoMapper girlInfoMapper;

    public boolean addGirl(GirlInfo girl) {
        int count = girlInfoMapper.addGirl(girl);
        if (count > 0) {
            return true;
        }
        return false;
    }

    /*
     * public void select() { List<GirlInfo> girlinfo = girlInfoMapper.select();
     * for (GirlInfo d : girlinfo) { d.getAge(); } }
     */
}
