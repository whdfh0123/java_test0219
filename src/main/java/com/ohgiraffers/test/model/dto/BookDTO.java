package com.ohgiraffers.test.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;
    public BookDTO(){}
    public BookDTO(int bNo, int category, String title, String author){
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }
    public void setbNO(int bNo){
        this.bNo = bNo;
    }
    public int getbNo(){
        return this.bNo;
    }
    public void setCategory(int category){
        this.category = category;
    }
    public int getCategory(){
        return this.category;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(){
        this.author =author;
    }
    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return "책 번호 : " + bNo +
                ", 장르 번호 : " + category +
                ", 제목 : " + title +
                ", 저자 : " + author+
                '}';
    }
}
