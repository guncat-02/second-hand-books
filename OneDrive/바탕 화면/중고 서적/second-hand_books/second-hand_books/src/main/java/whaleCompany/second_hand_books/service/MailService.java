package whaleCompany.second_hand_books.service;

import jakarta.mail.Message;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import whaleCompany.second_hand_books.vo.MailVO;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    /**
     * 메일 전송 이메일
     * @param email 수신 이메일
     * @param category 수신 종류
     * @return 메일로 보내진 인증 코드
     */
    public String sendMail(String email, String category) {
        try {
            MailVO mailVO = new MailVO(email, category);
            MimeMessage message = mailSender.createMimeMessage();
            message.addRecipients(Message.RecipientType.TO, mailVO.getEmail());
            message.setSubject(mailVO.getSubject());
            message.setText(mailVO.getContent(), "UTF-8", "html");
            message.setFrom(mailVO.getAdminEmail());
//            mailSender.send(message);
            return mailVO.getMailCode();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
