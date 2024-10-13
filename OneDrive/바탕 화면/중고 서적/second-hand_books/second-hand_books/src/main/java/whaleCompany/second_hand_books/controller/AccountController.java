package whaleCompany.second_hand_books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import whaleCompany.second_hand_books.service.UserService;
import whaleCompany.second_hand_books.vo.UserVO;

@Controller
public class AccountController {
    @Autowired
    UserService userService;

    /**
     * 로그인 view를 보여주는 method
     * @return login view
     */
    @GetMapping("/login")
    public String loginView() {
        return "login";
    }

    /**
     * 회원가입 하는 method
     * @param userVO 회원가입 form 태그 값
     */
    @PostMapping("/users")
    public String createUser(@ModelAttribute UserVO userVO) throws Exception {
        System.out.println("성공");
        System.out.println(userVO.toString());
        userService.createUser(userVO);
        return "redirect:/login";
    }

}
