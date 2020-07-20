package cn.chenchen.service.impl;

import cn.chenchen.dao.HouseDao;
import cn.chenchen.dao.OrderDao;
import cn.chenchen.domain.Order;
import cn.chenchen.service.OrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private HouseDao houseDao;

    @Override
    public void addOrder(Order order) {

        //新建呢一条新的订单
        orderDao.addOrder(order);

        //改变房间的状态
        houseDao.updateToReserveById(order.getHouseId());
    }

    @Override
    public List<Order> findByMid(int mid, int page, int size) {

        PageHelper.startPage(page,size);
        return orderDao.findByMid(mid);
    }

    @Override
    public List<Order> findAll(int page, int size) {
        PageHelper.startPage(page,size);
        return orderDao.findAll();
    }

    @Override
    public List<Order> findReserveByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return orderDao.findReserveByPage();
    }

    @Override
    public void updateToReserveById(int id) {
        orderDao.updateToReserveById(id);
    }

    @Override
    public void updateToCompleteById(int id) {
        //办理入住
         //修改订单状态
        orderDao.updateToCompleteById(id);

        //根据订单id查询出一条订单。拿房间id
        Order order = orderDao.findByOid(id);

        //修改相应得房间id状态为入住
        houseDao.updateToNotVacant(order.getHouseId());
    }

    @Override
    public void updateToCancelById(int id) {
        //取消订单
        //修改订单状态
        orderDao.updateToCancelById(id);

        //根据订单id查询出一条订单。拿房间id
        Order order = orderDao.findByOid(id);

        //修改相应得房间状态为空房
        houseDao.updateToVacant(order.getHouseId());
    }

    @Override
    public void addOrder2(Order order) {
        orderDao.addOrder(order);
    }

}
