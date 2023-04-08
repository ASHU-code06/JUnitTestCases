package com.juinttesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegisterationProblem {
    public String is_valid_name(String firstname){
     String result="false";
    Pattern p = Pattern.compile(("[A-Z]{1}[a-z]{3,}$"));
    Matcher m = p.matcher(firstname);
    boolean b = m.matches();
    System.out.println(" It is "+b);
    if (b){
        result="valid";
    }else {
        result="invalid";
    }
    return result;
    }
}
