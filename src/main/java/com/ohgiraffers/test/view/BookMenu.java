package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();


    public BookMenu(){}
    public void menu(){
        while (true){
            System.out.println("원하는 메뉴를 고르세요");
            System.out.println("1. 새로운 책 추가");
            System.out.println("2. 책 삭제");
            System.out.println("3. 책 검색");
            System.out.println("4. 모든 책 정보 열람");
            System.out.println("5. 책 정렬");
            System.out.println("0. 프로그램 종료");
            int menuNum = sc.nextInt();
            sc.nextLine();
            if(menuNum==0){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            switch (menuNum){
                case 1 : bm.addBook(inputBook());
                break;
                case 2 : System.out.println("삭제할 책 번호 : ");
                    bm.deleteBook(sc.nextInt());
                    break;
                case 3 : bm.printBook(bm.searchBook(BookTitle()));
                    break;
                case 4 : bm.displayAll();
            }
        }
    }
    public BookDTO inputBook(){
        System.out.println("책 번호를 입력하세요");
        int bN = sc.nextInt();
        sc.nextLine();
        System.out.println("책 카테로리를 입력하세요");
        System.out.println("1.인문 / 2.자연과학 / 3.의료 / 4.기타");
        int cN = sc.nextInt();
        sc.nextLine();
        System.out.println("책 제목을 입력하세요");
        String name = sc.nextLine();
        System.out.println("책 저자를 입력하세요");
        String at = sc.nextLine();
        BookDTO bDTO = new BookDTO(bN, cN, name, at);
        return bDTO;
    }
    public  String BookTitle(){
        System.out.println("제목을 입력하세요");
        String bookt = sc.nextLine();
        return bookt;

    }
}
