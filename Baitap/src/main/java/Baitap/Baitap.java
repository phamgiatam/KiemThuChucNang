package Baitap;

public class Baitap {
    public static String result(String a, double b){
        if(b>10||b<0){
            return "Invalid Input";
        }
        if(a=="Troi mua"){
            return "Hoc bai";
        }
        else if(a=="Troi nang"){
            if(b<7){
                return "Hoc bai";
            }
            if(b<10){
                return "Di choi";
            }
            if(b==10){
                return "Thuong keo";
            }
        }
        return "Invalid Input";
    }
}
