package org.example.poly;

import org.example.encap.Dancer;
import org.example.inherit.IdolDancer;

import java.util.ArrayList;
import java.util.List;

// 공연팀
public class PerformanceTeam {

    private List<Dancer> dancers = new ArrayList<>();

    // 팀원 추가하기
    public void addDancer(IdolDancer dancer) { //shift + f6
        dancers.add(dancer);
        System.out.println(dancer + "가 추가됨!");
    }
}