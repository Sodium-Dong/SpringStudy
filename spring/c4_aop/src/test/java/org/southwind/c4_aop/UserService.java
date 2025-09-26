package org.southwind.c4_aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void add(){
        System.out.println("add");
    }

    public void delete(){
        System.out.println("delete");
    }

    public void update(){
        System.out.println("update");
    }

    public void query(){
        System.out.println("query");
    }
}
