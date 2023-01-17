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
    System.out.println("so, it is "+b);
    if (b){
        result="valid";
    }else {
        result="invalid";
    }
    return result;
    }
    public String is_valid_Lastname(String lname) {
        String result = "false";
        Pattern pat = Pattern.compile(("^[A-Z]{1}[a-z]{2,}$"));
        Matcher mat = pat.matcher(lname);
        boolean c = mat.matches();
        if (c) {
            result = "valid";
        } else {
            result = "invalid";
        }
        return result;
    }
    public String is_valid_Email(String email) {
        String result = "false";
        Pattern patemail = Pattern.compile(("^[A-Za-z0-9+-._]{0,}@[A-Za-z0-9+-._]{0,}[.][com|in]{2,3}$"));
        Matcher matemail = patemail.matcher(email);
        boolean d = matemail.matches();
        if (d) {
            result = "valid";
        } else {
            result = "invalid";
        }
        return result;
    }
}
