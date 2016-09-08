package com.szzgkon.learngit;

/**
 * Created by zhangyongke on 16/9/8.
 */
public class People {
    public People(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "name='" + name + ", hobby='" + hobby;
    }

    private String name;
      private String hobby;

}
