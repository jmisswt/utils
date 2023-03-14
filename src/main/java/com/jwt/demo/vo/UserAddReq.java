package com.jwt.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @description: 新增用户请求
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2021/12/13 11:33
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserAddReq {

    public interface Add {
    }

    public interface Delete {
    }

    @NonNull
    @NotBlank(message = "用户名不能为空", groups = {Add.class, Delete.class})
    private String username;

    @NonNull
    @NotBlank(message = "密码不能为空")
    private String password;

    @NonNull
    @NotBlank(message = "电话不能为空")
    private String phone;

    @NonNull
    @NotBlank(message = "邮箱不能为空")
    private String email;


}
