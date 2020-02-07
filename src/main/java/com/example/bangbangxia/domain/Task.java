package com.example.bangbangxia.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Task implements Serializable {
    private int task_id;
    private String task_name;
    private String task_content;
    private Timestamp task_createtime;
    private int accept_userId;
    private int task_state;
    private float task_money;
    private User user;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_content() {
        return task_content;
    }

    public void setTask_content(String task_content) {
        this.task_content = task_content;
    }

    public Timestamp getTask_createtime() {
        return task_createtime;
    }

    public void setTask_createtime(Timestamp task_createtime) {
        this.task_createtime = task_createtime;
    }

    public int getAccept_userId() {
        return accept_userId;
    }

    public void setAccept_userId(int accept_userId) {
        this.accept_userId = accept_userId;
    }

    public int getTask_state() {
        return task_state;
    }

    public void setTask_state(int task_state) {
        this.task_state = task_state;
    }

    public float getTask_money() {
        return task_money;
    }

    public void setTask_money(float task_money) {
        this.task_money = task_money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", task_content='" + task_content + '\'' +
                ", task_createtime=" + task_createtime +
                ", accept_userId=" + accept_userId +
                ", task_state=" + task_state +
                ", task_money=" + task_money +
                ", user=" + user +
                '}';
    }
}
