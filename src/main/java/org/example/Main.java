package org.example;

public class Main {
    public static void main(String[] args){
    }
    public static String getSeason(int month) {
        switch (month) {
            case 1:
            case 2:
            case 12:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "autumn";
            default:
                return "error";
        }
    }
}