package com.kd.personalstake.service.imp;

import com.kd.personalstake.domain.EvCg;
import com.kd.personalstake.mapper.EvCgMapper;
import com.kd.personalstake.service.EvCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvCgServiceImp implements EvCgService {
    @Autowired
    private EvCgMapper evCgMapper;

    @Override
    public EvCg selectByPrimaryKey(String id){
       return evCgMapper.selectByPrimaryKey(id);
    }

}
