package org.example.ch04.sql;

import org.example.pojo.UserCustom;
import org.example.pojo.UserQueryVO;

import java.util.List;

public interface UserMapper {

        //1.需求：通过用户性别和姓名查询用户列表 PS：不允许性别或者姓名为null或者空串
        public List<UserCustom> findList(UserQueryVO vo);

        //2.需求：通过用户性别和姓名查询用户列表条数 PS：不允许性别或者姓名为null或者空串
        public Integer findCounts(UserQueryVO vo);

        //3.需求：通过用户性别和姓名查询用户列表，且id值是15或20或25  PS：不允许性别或者姓名为null或者空串
        public List<UserCustom> findListByIds(UserQueryVO vo);

        public List<UserCustom> findListByIds_new(UserQueryVO vo);
}
