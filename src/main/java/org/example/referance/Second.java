package org.example.referance;

import org.springframework.context.ApplicationContext;

public class Second {

    private int num2;
    private  First ob;

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum()
    {
        return num2+ ob.getNum1();
    }

    public First getOb() {
        return ob;
    }

    public void setOb(First ob) {
        this.ob = ob;
    }

    @Override
    public String  toString() {
        return "Second{" +
                "num2=" + num2 +
                ", ob=" + ob +
                '}';
    }
}
