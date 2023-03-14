package com.jwt.demo.mapper;

import com.jwt.demo.po.SysUserPO;
import com.jwt.demo.vo.UserVO;
import org.mapstruct.Mapper;

/**
 * @description: 用户信息转换
 * @author: jiangwentao
 * @email: jiangwentao@whty.com.cn
 * @date: 2022/1/28 15:32
 */
@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserVO, SysUserPO> {
    default UserVO formId(Integer id){
        if(id==null){
            return null;
        }
        UserVO userVO=new UserVO();
        userVO.setId(id);
        return userVO;
    }
}
