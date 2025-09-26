package com.xs.service.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource("xushu.properties")
public class User {
    @Value("${xushu.name}")
    private String name;
    @Value("${xushu.age}")
    private Integer age;
    @Value("#{{'语文':'90', '数学':'100'}}")
    private Map<String,Integer> score;
    @Value("#{'唱歌, 打球'}")
    private List<String> hobbies;
}
