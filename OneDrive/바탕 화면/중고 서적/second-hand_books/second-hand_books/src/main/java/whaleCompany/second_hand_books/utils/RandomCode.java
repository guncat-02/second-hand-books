package whaleCompany.second_hand_books.utils;

import java.util.Random;

public class RandomCode {
    private Random rd = new Random();
    private StringBuilder builder = new StringBuilder();

    /**
     * 랜덤 영어 대문자 코드 반환
     * @return 영어 대문자 코드
     */
    public String bigSpellCode() {
        for (int i = 0; i < 6; i++) {
            char code = (char)(rd.nextInt(26)+65);
            builder.append(code);
        }
        return builder.toString();
    }
}
