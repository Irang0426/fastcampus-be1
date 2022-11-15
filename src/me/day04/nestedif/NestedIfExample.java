package me.day04.nestedIf;

public class NestedIfExample {
    public static void main(String[] args) {
        int score = 91;
        String grade = ""; // 학점

        // 리팩토링 전
        if (score >= 90) { // score >= 90
            if (score >= 95) { // score >= 95
                grade = "A+";
            } else { // 90 <= score < 95
                grade = "A-";
            }
        } else { // score < 90
            if (score >= 80) { // 80 <= score < 90
                if (score >= 85) { // 85 <= score < 90
                    grade = "B+";
                } else { // 80 <= score < 85
                    grade = "B-";
                }
            } else { // score < 80
                // code 작성 가능
            }
        }

        // 리팩토링 후
        if (score >= 95) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B-";
        } else {
            // code 작성 가능함
        }

        System.out.printf("당신의 학점은 %s 입니다 \n", grade);
    }
}
