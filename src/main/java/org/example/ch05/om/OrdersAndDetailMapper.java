package org.example.ch05.om;

import org.example.pojo.OrdersCustom;

import java.util.List;

public interface OrdersAndDetailMapper {

    //查询订单及订单明细的信息
    public List<OrdersCustom> find();

    public List<OrdersCustom> find_user();

}
