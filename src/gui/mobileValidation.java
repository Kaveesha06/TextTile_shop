/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Asus
 */
public class mobileValidation {
    public boolean validateMobile(String number){
        return number.matches("^(0{1})(7{1})([0|1|2|4|5|6|7|8])([8-9]{7})");
    }
}
