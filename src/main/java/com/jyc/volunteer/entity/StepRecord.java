package com.jyc.volunteer.entity;

import java.util.Date;

public class StepRecord {
    private Integer id;
    private Integer oldManId;
    private String time;
    private Integer steps;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldManId() {
        return oldManId;
    }

    public void setOldManId(Integer oldManId) {
        this.oldManId = oldManId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }
}
