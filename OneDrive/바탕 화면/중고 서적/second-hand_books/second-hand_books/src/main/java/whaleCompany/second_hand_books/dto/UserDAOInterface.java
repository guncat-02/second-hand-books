package whaleCompany.second_hand_books.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import whaleCompany.second_hand_books.entity.UserEntity;

@Repository
public interface UserDAOInterface extends JpaRepository<UserEntity, String> {

    @Query("SELECT u.id FROM UserEntity u WHERE u.id = :id")
    public String userIdChk(@Param("id") String id) throws Exception;
}
