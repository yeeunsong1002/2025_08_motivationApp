package com.koreait.exam;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }


    public void run() {
        System.out.println("== 명언 앱 ==");
        int lastId = 0;

        Motivation m1 = null;
        Motivation m2 = null;
        Motivation m3 = null;

        List<Motivation> motivationList = new ArrayList<>();





        while (true) {

            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();




//            if (lastId == 1) {
//                m1 = addMotiv;
//            }
//
//            if (lastId == 2) {
//                m2 = addMotiv;
//            }

            if (cmd.equals("exit")) {
                System.out.println("명언 앱 종료");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("명언 : ");
                String body = sc.nextLine().trim();
                System.out.print("저자 : ");
                String author = sc.nextLine().trim();

                lastId++;

                Motivation addMotiv = new Motivation(lastId, body, author);
                motivationList.add(addMotiv);

                System.out.println(lastId + "번 명언이 등록되었습니다.");

//                m1 = new Motivation();
//                m2 = new Motivation();
//                m1.setId(lastId);
//                m1.setBody(body);
//                m1.setAuthor(author);
//                m2.setId(lastId);
//                m2.setBody(body);
//                m2.setAuthor(author);




            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(20));
                System.out.println("   번호      /       명언       /       저자");

                if(motivationList.size() == 0) {
                    System.out.println("등록된 명언이 없습니다.");
                }
                else {

                    Collections.reverse(motivationList);
                    for (Motivation m : motivationList) {
                        String shortBody;

                        if(m.getBody().length() >= 5) {
                            shortBody = m.getBody().substring(0, 5)+"...";
                        } else {
                            shortBody = m.getBody();
                        }

                        System.out.println(m.getId() + "     " + m.getBody().substring(0, 5)+"..." + "     " + m.getAuthor());

                    }

/*
                    for(int i = motivationList.size() - 1; i >= 0 ; i--){
                        System.out.println(motivationList.get(i).getId() + "     " + motivationList.get(i).getBody() + "     " + motivationList.get(i).getAuthor() );
                    }
                }
*/


//                System.out.println(m1.getAuthor());
//                System.out.println(m1.getBody());
//                System.out.println(m1.getId());
                }
            } else {
                System.out.println("사용할 수 없는 명령어입니다.");
            }

        }
    }


}
