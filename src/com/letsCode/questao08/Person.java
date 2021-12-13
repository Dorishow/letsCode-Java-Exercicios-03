package com.letsCode.questao08;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public float height;
    public float weight;

    public Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}
