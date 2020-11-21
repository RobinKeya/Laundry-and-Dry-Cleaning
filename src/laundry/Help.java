/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author RobinKeya
 */
public class Help {
    public static void main(String [] args){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
        String x = ft.format(date);
        System.out.println(x);
    }
}
