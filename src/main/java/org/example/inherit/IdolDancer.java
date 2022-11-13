package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

//상속은 확장개념
public class IdolDancer extends Dancer {

    public IdolDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
    }

    @Override
    public void dance() {

    }

    //생성자를 쓰며
}
