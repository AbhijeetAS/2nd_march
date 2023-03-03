package org.example.autowiring;

import java.util.List;

public class teacher {

    private int result;


    private student ob;

    public int getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        int sum=0;
        for (int i:result) {
            sum=sum+i;
        }
        this.result=sum;
    }

    public student getOb() {
        return ob;
    }

    public void setOb(student ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "result of the student is =" + result +
                ", ob=" + ob +
                '}';
    }
}
