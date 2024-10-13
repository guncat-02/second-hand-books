package whaleCompany.second_hand_books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import whaleCompany.second_hand_books.service.MailService;

@RestController
public class MailController {
    @Autowired
    private MailService mailService;

    /**
     * 메일을 보내는 method
     * @param email 클라이언트의 이메일
     * @return 이메일을 보낸 결과값 가져오기 (성공 시 인증 코드 반환)
     */
    @PostMapping("/mail/{email}")
    public String sendJoinMail(@PathVariable("email") String email) {
        return mailService.sendMail(email, "회원가입");
    }
}
