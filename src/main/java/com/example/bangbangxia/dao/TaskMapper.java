package com.example.bangbangxia.dao;


import com.example.bangbangxia.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaskMapper {
    List<Task> getTaskByPage(Integer page, Integer size);

    Long getTotal();
}
