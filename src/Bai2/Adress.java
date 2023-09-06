package Bai2;
import java.util.Scanner ;
public class Adress {
    private String city ;
    private String district ;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Adress(String city, String district) {
        this.city = city;
        this.district = district;
    }
    public Adress(){} 
    Scanner Ip = new Scanner(System.in) ;
    public void Input() {
        city = Ip.nextLine() ; 
        district = Ip.nextLine() ;
    }
    public void Out(){
        System.out.println("city = " + city);
        System.out.println("district = " + district);
    }
}
