package com.example.bangbangxia.service.impl;

import com.example.bangbangxia.dao.TaskMapper;
import com.example.bangbangxia.domain.RespPageBean;
import com.example.bangbangxia.domain.Task;
import com.example.bangbangxia.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public RespPageBean getTaskByPage(Integer page, Integer size) {
        if (page!=null&&size!=null){
            page=(page-1)*size;
        }
        RespPageBean respPageBean = new RespPageBean();
        List<Task> data= taskMapper.getTaskByPage(page,size);
        Long total=taskMapper.getTotal();
        respPageBean.setData(data);
        respPageBean.setTotal(total);
        return respPageBean;
    }
}
