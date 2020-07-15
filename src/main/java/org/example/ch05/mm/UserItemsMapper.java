package org.example.ch05.mm;

import org.example.pojo.UserCustom;

import java.util.List;

public interface UserItemsMapper {

    //查询用户及用户购买商品信息
    public List<UserCustom> find();

}
