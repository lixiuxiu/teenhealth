package com.cx.teenhealth.mapper;

import com.cx.teenhealth.bean.TClass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(TClass record);

    int insertSelective(TClass record);

    TClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TClass record);

    int updateByPrimaryKey(TClass record);

    List<TClass> selectTClasses();
}