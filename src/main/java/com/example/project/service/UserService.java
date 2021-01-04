package com.example.project.service;

import com.example.project.Common.GlobalExceptionHandling;
import com.example.project.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    List<User> topicList = new ArrayList();

    public UserService() {
    }

    public List<User> getAllemp() {
        return this.topicList;
    }

    public User getempById(int id) throws GlobalExceptionHandling {
        int counter = 0;

        for(Iterator var3 = this.topicList.iterator(); var3.hasNext(); ++counter) {
            User emp1 = (User)var3.next();
            if (emp1.getempId() == id) {
                return emp1;
            }
        }

        throw new GlobalExceptionHandling();
    }

    public void addEmp(User emp) {
        this.topicList.add(emp);
    }

    public void updateEmp(User emp, int id) {
        int counter = 0;

        for(Iterator var4 = this.topicList.iterator(); var4.hasNext(); ++counter) {
            User emp1 = (User)var4.next();
            if (emp1.getempId() == id) {
                this.topicList.set(counter, emp);
            }
        }

    }

    public void deleteEmp(int id) {
        int counter = 0;

        for(Iterator var3 = this.topicList.iterator(); var3.hasNext(); ++counter) {
            User emp1 = (User)var3.next();
            if (emp1.getempId() == id) {
                this.topicList.remove(counter);
            }
        }

    }
}


