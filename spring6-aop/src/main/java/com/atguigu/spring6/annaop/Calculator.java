package com.atguigu.spring6.annaop;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {
    int add(int i, int j);

    int sub(int i, int j);

    int mul(int i, int j);

    int div(int i, int j);

}
