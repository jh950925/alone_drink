package com.example.alone_drink.module.service.user;


import com.example.alone_drink.module.vo.dto.user.UserInfoDto;

/**
 * 회원 Rest Api 인터페이스
 */
public interface UserService {

    UserInfoDto registerUser(UserInfoDto userInfoDto);
    UserInfoDto findUserId(UserInfoDto userInfoDto);
    UserInfoDto findUserPassword(UserInfoDto userInfoDto);
    UserInfoDto login(String userId, String password);
    void logout(Long userNo);

}
