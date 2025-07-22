package com.test.demo.mapper;

import com.test.demo.DTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    public DTO test();
}
