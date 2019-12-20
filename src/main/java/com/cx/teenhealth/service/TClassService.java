package com.cx.teenhealth.service;

import com.cx.teenhealth.bean.TClass;
import com.cx.teenhealth.mapper.TClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TClassService {
    public List<TClass> findAllTClass();
}
