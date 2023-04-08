package com.junittestcases;

import com.juinttesting.UserRegisterationProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {
    @Test
    public void should_Enter_firstName_According_To_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_name("Ashu");
        Assertions.assertEquals("valid",re);
    }
    @Test
    public void should_Enter_firstName_As_Per_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_name("ashi");
        Assertions.assertEquals("invalid",re);
    }
    @Test
    public void should_Enter_lastName_As_Per_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Lastname("as45");
        Assertions.assertEquals("invalid",re);
    }
    @Test
    public void should_Enter_lastName_According_to_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Lastname("Chauhan");
        Assertions.assertEquals("valid",re);
    }
    @Test
    public void should_Enter_Email_As_Per_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Email(".as45@popcorn");
        Assertions.assertEquals("invalid",re);
    }
    @Test
    public void should_Enter_Phonenumber_According_to_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Phonenumber("917011275754");
        Assertions.assertEquals("valid",re);
    }
    @Test
    public void should_Enter_Phonenum_As_Per_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Phonenumber("456554665454656");
        Assertions.assertEquals("invalid",re);
    }
    @Test
    public void should_Enter_Email_According_to_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Email("ashuc306@gmail.com");
        Assertions.assertEquals("valid",re);
    }
    @Test
    public void should_Enter_Password_As_Per_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Password(".as45@popcorn");
        Assertions.assertEquals("invalid",re);
    }
    @Test
    public void should_Enter_Password_According_to_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Password("Kunal@123");
        Assertions.assertEquals("valid",re);
    }
    @Test
    public void should_Enter_Every_Email_According_to_Pattern(){
        ArrayList<String> al =new ArrayList<>();
        //list of valid emails only.
        al.add("abc@yahoo.com");
        al.add("abc-100@yahoo.com");
        al.add("abc.100@yahoo.com");
        al.add("abc111@abc.com");
        al.add("abc-100@abc.net");
        al.add("abc.100@abc.com.au");
        al.add("abc@1.com");
        al.add("abc@gmail.com.com");
        al.add("abc+100@gmail.com");
        UserRegisterationProblem obj = new UserRegisterationProblem();
        for (String emails:al) {
        String re= obj.is_valid_Email(emails);
        Assertions.assertEquals("valid",re);}
    }

}
