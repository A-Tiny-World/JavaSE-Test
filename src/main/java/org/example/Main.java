package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>();
        strList.add("test1");
        strList.add("test2");
        strList.add("test3");
        strList.forEach(s->{
            System.out.println(s.charAt(4));
        });
        Map<String, Book> map=new HashMap<>();
//        for (int i=0;i<3;i++){
//            map.put("book"+i,new Book(i+"","bookname"+i));
//        }
//        for (String key:map.keySet()){
//            System.out.println(key+":"+map.get(key));
//            book2:Book{fdId='2', fdName='bookname2'}
//            book1:Book{fdId='1', fdName='bookname1'}
//            book0:Book{fdId='0', fdName='bookname0'}
//        }
//        map.forEach((k,v)->{
//            System.out.println(k+":"+v);
//            book2:Book{fdId='2', fdName='bookname2'}
//            book1:Book{fdId='1', fdName='bookname1'}
//            book0:Book{fdId='0', fdName='bookname0'}
//            System.out.println(k+":"+v.getFdName());
//            book2:bookname2
//            book1:bookname1
//            book0:bookname0
//        });
        List<Book> list1=new ArrayList<>();
        int j=1;
        for(int i=1;i<=3;i++){
            Book book=new Book("list"+j+"fdId"+i,"list"+j+"fdName"+i);
            list1.add(book);
        }
//        list1=list1.stream().filter(book->!book.getFdId().contains("fdId1")).collect(Collectors.toList());
//输出：[Book{fdId='list1fdId2', fdName='list1fdName2'}, Book{fdId='list1fdId3', fdName='list1fdName3'}]
//        List<String> fdNameList= list1.stream().map(Book::getFdName).collect(Collectors.toList());
//        String[] strs=new String[]{"1","2","3","4"};
//        String collect = Arrays.stream(strs).map(s -> s += ";").collect(Collectors.joining());
//        System.out.println(collect);//输出1;2;3;4;
        ArrayList list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        String collect =(String)list.stream().map(s -> s += ";").collect(Collectors.joining());
        System.out.println(collect);//输出1;2;3;4;
//        j++;
//        List<Book> list2=new ArrayList<>();
//        for(int i=1;i<=3;i++){
//            Book book=new Book("list"+j+"fdId"+i,"list"+j+"fdName"+i);
//            list2.add(book);
//        }
//        j++;
//        List<Book> list3=new ArrayList<>();
//        for(int i=1;i<=3;i++){
//            Book book=new Book("list"+j+"fdId"+i,"list"+j+"fdName"+i);
//            list3.add(book);
//        }
//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);
//        Map map2=new HashMap();
//        map2.put("list1",list1);
//        map2.put("list2",list2);
//        map2.put("list3",list3);
//
//        map2.forEach((k,v)->{
//            ((List<?>) v).forEach((book)->{
//                System.out.println(book);
//            });
//        });
    }
}