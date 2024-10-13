package whaleCompany.second_hand_books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whaleCompany.second_hand_books.service.UserService;

@RestController
public class UserRestController {
    @Autowired
    UserService userService;

    /**
     * 사용자 계정 아이디 중복 체크
     * @param id 계정 아이디
     * @return id가 중복되지 않은 경우 true, 중복인 경우 false 반환
     * @throws Exception
     */
    @GetMapping("/users/{id}")
    public Boolean userIdChk(@PathVariable("id") String id) throws Exception {
        return userService.userIdChk(id);
    }
}
