package whaleCompany.second_hand_books.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    /**
     * SHA-256 해시 생성
     * @param text
     * @return SHA-256 hash
     * @throws NoSuchAlgorithmException
     * SHA-256 알고리즘이 지원되지 않을 경우
     */
    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());
        return bytesToHex(md.digest());
    }

    /**
     * SHA-256 hash 생성 값을 16진수 문자열로 변환
     * @param bytes
     * @return SHA-256 hash 변환 값
     */
    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}