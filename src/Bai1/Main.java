package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in) ;
        String s = Ip.next() ;
        int res = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if( (s.charAt(i))  == '-' || (s.charAt(i) + 0) == 43 || (s.charAt(i) + 0)  >= 49 && (s.charAt(i) + 0) <58) {
                int sol = 0 ;
                int dem = i + 1;
                int index  = i ;
                if((s.charAt(i) + 0)  == 45) index = index+1;
                for(int x = index ; x < s.length() ; x++){
                    if((s.charAt(x) + 0)  >= 49 && (s.charAt(x) + 0) <58){
                        sol= sol*10+((s.charAt(x) - 48)) ;
                    }
                    else {
                        dem = x-1;
                        break;
                    }
                }
                if((s.charAt(i) + 0)  == 45){
                    res= res - sol ;
                }
                else res+=sol ;
//                System.out.println(i + " " + sol);
                i = dem ;
            }
        }
        System.out.println(res);
    }
}
///a5df35-23f7?(
//A = 65
//-45  +43