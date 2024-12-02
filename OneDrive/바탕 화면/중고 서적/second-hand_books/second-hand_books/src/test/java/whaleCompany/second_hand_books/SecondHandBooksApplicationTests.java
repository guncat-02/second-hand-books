package whaleCompany.second_hand_books;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import whaleCompany.second_hand_books.utils.SHA256;


@SpringBootTest
class SecondHandBooksApplicationTests {
	@Test
	void contextLoads() {
		SHA256 sha256 = new SHA256();
		try{
			String pass = "1234";

			System.out.println(sha256.encrypt(pass));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
