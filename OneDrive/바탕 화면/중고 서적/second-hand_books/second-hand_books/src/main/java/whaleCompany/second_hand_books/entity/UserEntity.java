package whaleCompany.second_hand_books.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import whaleCompany.second_hand_books.vo.UserVO;

@Entity
@Table(name = "users")
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class UserEntity {
    @Id
    @Column(nullable = false)
    private String userCode;

    @Column(unique=true, nullable=false)
    private String id;

    @Column(nullable=false)
    private String pass;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String idNum;

    @Column(nullable=false)
    private String tel;

    @Column(nullable=false)
    private String email;

    /**
     * entity에 값을 넣기 위한 생성자
     * @param userVO 값이 있는 vo
     */
    public UserEntity(UserVO userVO) {
        this.userCode = userVO.getUserCode();
        this.id = userVO.getId();
        this.pass = userVO.getPass();
        this.name = userVO.getName();
        this.idNum = userVO.getIdNum();
        this.tel = userVO.getTel();
        this.email = userVO.getEmail();
    }
}
