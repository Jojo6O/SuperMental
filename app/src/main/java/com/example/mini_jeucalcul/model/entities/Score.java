package com.example.mini_jeucalcul.model.entities;

public class Score extends BaseEntity{
    private Integer Score;


    public Score(Integer Score) {
        this.Score = Score;

    }

    public Score() {
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }

}