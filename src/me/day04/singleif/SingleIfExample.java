package me.day04.singleIf;

public class SingleIfExample {
    public static void main(String[] args) {
        int score = 200; // 0 ~ 100

        // single-if (데이터의 유효성 검증)
        if (!(score >= 0 && score <= 100)) {
            System.out.println("유효하지 않은 데이터입니다.");
            return; // 메인 함수 종료
        }

        if (score >= 70) {
            System.out.println("70점 이상이네요!");
            System.out.println("합격");
        } else { // !(score >= 70) == score < 70
            System.out.println("70점 미만이네요!");
            System.out.println("불합격"); // 평서문
        }
        System.out.println("이 문장은 실행될까요?");

    }
}
