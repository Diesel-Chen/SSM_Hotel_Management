package cn.chenchen.service;

import cn.chenchen.domain.Order;

import java.util.List;

public interface OrderService {

    //增加一条订单
    void addOrder(Order order);

    //根据会员id查找订单
    List<Order> findByMid(int id, int page, int size);

    //查询全部订单
    List<Order> findAll(int page, int size);

    //查询状态时已预定的订单
    List<Order> findReserveByPage(int page, int size);


    //修改订单为已预定
    void updateToReserveById(int id);

    //办理入住
    void updateToCompleteById(int id);

    //取消预定
    void updateToCancelById(int id);

    void addOrder2(Order order);
}
