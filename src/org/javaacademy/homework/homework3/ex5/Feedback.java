package org.javaacademy.homework.homework3.ex5;

import java.time.LocalDateTime;

public class Feedback {
    private Integer id;
    private Integer countLikes;
    private LocalDateTime createdDate;
    private String text;

    public Feedback(Integer id, Integer countLikes, LocalDateTime createdDate, String text) {
        this.id = id;
        this.countLikes = countLikes;
        this.createdDate = createdDate;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCountLikes() {
        return countLikes;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Feedback{" +
               "id=" + id +
               ", countLikes=" + countLikes +
               ", createdDate=" + createdDate +
               ", text='" + text + '\'' +
               '}';
    }
}
