package com.springbuoi3.entity;

public class Sentence {

    private int id;
    private String content;

    public Sentence(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
