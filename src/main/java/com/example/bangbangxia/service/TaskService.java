package com.example.bangbangxia.service;

import com.example.bangbangxia.domain.RespPageBean;
import org.springframework.stereotype.Service;

public interface TaskService {
    RespPageBean getTaskByPage(Integer page, Integer size);
}
