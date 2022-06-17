package com.ultralesson.objectOrientation;

public class Practice {

//    Practice(){
//        System.out.println("c");
//    }

    public String hi(String name){
       return String.format("hii %s", name);
    }

    public static void main(String[] args) {
        System.out.println(new Practice().hi("mnb"));
    }
}
