package whaleCompany.second_hand_books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whaleCompany.second_hand_books.dto.UserDAOInterface;
import whaleCompany.second_hand_books.entity.UserEntity;
import whaleCompany.second_hand_books.vo.UserVO;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    UserDAOInterface userDAOInterface;

    @Override
    public void createUser(UserVO userVO) throws Exception {
        UserEntity userEntity = new UserEntity(userVO);
        userDAOInterface.save(userEntity);
    }

    @Override
    public Boolean userIdChk(String id) throws Exception {
        if(userDAOInterface.userIdChk(id) != null) {
            return false;
        } else {
            return true;
        }
    }
}
