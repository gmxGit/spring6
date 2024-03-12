package com.itguigu.spring6.iocxml;

 import org.springframework.stereotype.Controller;

//@Component
@Controller
public class User {
    private String name;
    private Integer age;

    public void run() {
        System.out.println("開始運行");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}