package me.day04.nestedif;

public class NestedIfExample {
    public static void main(String[] args) {
        int score = 91;
        String grade = "";

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A-";
            }
        } else {
            if (score >= 80) {
                if (score >= 85) {
                    grade = "B+";
                } else {
                    grade = "B-";
                }
            }
        }

        if (score >= 95) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B-";
        } else {
            // code 작성 가능
        }

        System.out.printf("당신의 학점은 %s 입니다 \n", grade);
    }
}
