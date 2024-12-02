package whaleCompany.second_hand_books.vo;

import lombok.*;
import whaleCompany.second_hand_books.utils.SHA256;

import java.beans.ConstructorProperties;
import java.util.UUID;

@ToString
@Getter
@EqualsAndHashCode
public class UserVO {
    private String userCode;
    private String id;
    private String pass;
    private String name;
    private String idNum;
    private String tel;
    private String email;

    /**
     * UserVO 값을 넣어주는 생성자
     * @param id
     * @param pass
     * @param name
     * @param idNum
     * @param tel
     * @param email
     */
    @ConstructorProperties({"id", "pass", "name", "idNum", "tel", "email"})
    public UserVO(String id, String pass, String name, String idNum, String tel, String email) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.idNum = idNum;
        this.tel = tel;
        this.email = email;

        passEncode();
        createUserCode();
    }

    /**
     * 비밀번호 암호화
     */
    private void passEncode() {
        try {
            SHA256 sha256 = new SHA256();
            final String noise = "GUNCAT";
            this.pass = sha256.encrypt(pass+noise);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * userCode 생성
     */
    private void createUserCode() {
        this.userCode = UUID.randomUUID().toString();
    }
}

