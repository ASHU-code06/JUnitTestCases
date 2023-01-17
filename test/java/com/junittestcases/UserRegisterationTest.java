package com.junittestcases;

import com.juinttesting.UserRegisterationProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {
    @Test
    public void should_Enter_firstName_According_To_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_name("Ashukuldeep");
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
    public void should_Enter_Email_According_to_Pattern(){
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
    public void should_Enter_Phonemun_According_to_Pattern(){
        UserRegisterationProblem obj = new UserRegisterationProblem();
        String re= obj.is_valid_Email("ashuc306@gmail.com");
        Assertions.assertEquals("valid",re);
    }


}
