package whaleCompany.second_hand_books.vo;

import lombok.Getter;
import whaleCompany.second_hand_books.utils.RandomCode;

@Getter
public class MailVO {
    private final String adminEmail = "nuit0204@gmail.com";
    private String category;
    private String email;
    private String subject = "whaleCompany ";
    private String content;
    private String mailCode;

    /**
     * MailVO 생성자
     * @param email 수신 이메일
     * @param category 이메일 분류 (회원가입, 비밀번호 재설정, 아이디 찾기)
     */
    public MailVO(String email, String category) {
        this.email = email;
        this.category = category;
        this.subject += category + " 인증";
        this.mailCode = new RandomCode().bigSpellCode();
        createContent();
    }

    /**
     * 메일로 보낼 내용 추가 (랜덤 코드)
     */
    private void createContent() {
        this.content = "<!DOCTYPE html>\n" +
                "<html lang=\"kor\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <section>\n" +
                "        <div style=\"text-align: center; margin-bottom: 50px;\">\n" +
                "            <span style=\"font-size: 50px; font-weight: bolder; color: rgb(27, 64, 126);\">whaleCompany</span>\n" +
                "        </div>\n" +
                "        <div style=\"text-align: center;\">\n";
        for(int i = 0; i < this.mailCode.length(); i++) {
            this.content += "            <span style=\"font-size: 40px; color: rgb(27, 64, 126); font-weight: bolder;\">"+this.mailCode.charAt(i)+"</span>\n";
        }
        this.content += "        </div>\n" +
                "    </section>\n" +
                "</body>\n" +
                "</html>";
    }
}
