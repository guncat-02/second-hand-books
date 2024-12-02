package whaleCompany.second_hand_books.service;

import whaleCompany.second_hand_books.vo.UserVO;

public interface UserServiceInterface {
    /**
     * 사용자 계정 생성 service
     * @param userVO 계정 정보
     * @throws Exception
     */
    public void createUser(UserVO userVO) throws Exception;

    /**
     * 사용자 계정 아이디 중복 체크
     * @param id 계정 아이디
     * @return 아이디 조회 결과
     * @throws Exception
     */
    public Boolean userIdChk(String id) throws Exception;
}
