package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    ArrayList<BookDTO> bookArrayList;
    public BookManager(){
        bookArrayList = new ArrayList<>();

        // app테스트용 책 임시저장
        bookArrayList.add(new BookDTO(1,2,"가","A"));
        bookArrayList.add(new BookDTO(2,1,"나","B"));
        bookArrayList.add(new BookDTO(3,1,"다","C"));
    }
    public void addBook(BookDTO book){

        bookArrayList.add(book);
    }
    public void deleteBook(int index){
        int del = -1;
        for (BookDTO bookDTO : bookArrayList){
            if(bookDTO.getbNo()==index){
                bookArrayList.remove(del);
                break;
            }


        }



    }
    public int searchBook(String bTitle){
        int serch = -1;
        for (BookDTO bookDTO : bookArrayList){
            if(bookDTO.getTitle().contains(bTitle)){
                serch = bookDTO.getbNo();
            }
        }
        return serch;
    }
    public void printBook(int index){

        for (BookDTO bookDTO : bookArrayList){
            if(bookDTO.getbNo()==index){
                System.out.println(bookDTO);
            }
        }

    }
    public void displayAll(){
        for (BookDTO bookDTO : bookArrayList){
            System.out.println(bookDTO);
        }
    }

}
