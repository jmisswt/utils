package com.jwt.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @description: 用户Bean
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2021/12/10 16:08
 */
@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private Integer id;

    private String username;

    private String password;


    private String phone;


    private String email;

//    public UserVO(SysUserPO userPO) {
//        this.id = userPO.getId();
//        this.username = userPO.getUsername();
//        this.password = userPO.getPassword();
//        this.phone = userPO.getPhone();
//        this.email = userPO.getEmail();
//    }
}
