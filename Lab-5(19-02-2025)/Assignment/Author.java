package redoy;

public class Author {
    String name;
    String fictionName;

    Author(String name,String fictionName){
        this.name=name;
        this.fictionName=fictionName;

    }

    void writeBook(){
        System.out.println("From The Author : Don't Reda Book");
    }
}
