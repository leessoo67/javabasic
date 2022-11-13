
package org.example.encap;


import org.example.inter.Danceable;

public abstract class Dancer extends Object implements Danceable {

    String crewName; // 팀의 이름
    Grade grade; // 실력
    String myName; // 내 이름

    private double height; // 키



    public Dancer(String crewName, Grade grade, String myName) {
        this.crewName = crewName;
        this.grade = grade;
        this.myName = myName;
    }

    // 스트레칭
    private void stretch() {
        System.out.println(myName + "이 몸을 풉니다.");
    }

    // 유연성 연습
    private void moreFlexible() {
        System.out.println(myName + "이 다리를 찢습니다.");
    }






    public void setHeight(double height) {
        if (height <= 130 || height >= 250) {
            this.height = 160;
            return;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "crewName='" + crewName + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }
}



/*package org.example.encap;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static org.example.encap.Grade.HIGH;

public class Dancer {
    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    String crewName; // 팀의 이름
    Grade grade = HIGH; //실력(Grade alt + enter
    String myName; //내 이름

    public Dancer() { //alt + insert = 기본 생성자
        //스트레칭

        public void stretch(){
            System.out.println(myName + "이 몸을 풉니다.");
        }

        // 유연성 연습
        private void moreFlexible() {
            System.out.println(myName + "이 다리를 찢습니다.");
        }

        // 춤추기
        private void dance() {
            stretch();
            moreFlexible();
            System.out.println(myName + "이 춤을 춥니다.");
        }

    }


    //=======================================================
    //random(); // new 쓸 수 없음
    //out.println(PI);//sout enter
    // ctrl + art + o = import 정리

}
*/