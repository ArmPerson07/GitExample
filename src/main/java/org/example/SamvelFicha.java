package org.example;

import java.util.Objects;

public class SamvelFicha {
    private Integer age;
    private String name;
    private Integer weight;

    public SamvelFicha(Integer age, String name, Integer weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SamvelFicha{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SamvelFicha that = (SamvelFicha) object;
        return Objects.equals(age, that.age) && Objects.equals(name, that.name) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, weight);
    }
}
