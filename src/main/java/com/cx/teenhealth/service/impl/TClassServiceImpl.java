package com.cx.teenhealth.service.impl;

import com.cx.teenhealth.bean.TClass;
import com.cx.teenhealth.mapper.TClassMapper;
import com.cx.teenhealth.service.TClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tClassService")
public class TClassServiceImpl implements TClassService {
    @Autowired
    TClassMapper tClassMapper;

    @Override
    public List<TClass> findAllTClass() {
        return tClassMapper.selectTClasses();
    }
}
