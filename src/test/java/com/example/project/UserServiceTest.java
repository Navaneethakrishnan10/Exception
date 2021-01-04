
package com.example.project;

import com.example.project.model.User;
import com.example.project.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService service=new UserService();
    User a=new User(1,"krish","@krish",10000);

    User b=new User(2,"navanee","@navanee",20000);


    List<User> topic = new ArrayList<User>(Arrays.asList(a,b));

    @Test
    public void getAllemp() {


    }

    @Test
    public void getempById() {
        User c=service.getempById(a.getempId());
        assertEquals(a.getempName(),c.getempName());
        assertEquals(a.getEmailId(),c.getEmailId());


    }



    @Test
    public void addemp() {

    }

    @Test
    public void updateemp() {
    }

    @Test
    public void deleteemp() {
    }
}
