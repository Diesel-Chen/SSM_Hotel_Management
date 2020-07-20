package cn.chenchen.dao;

import cn.chenchen.domain.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    //增加一条订单
    @Insert("insert into orders(orderStatus,orderPrice,orderTime,comeTime,departureTime,houseId,memberId) values(#{orderStatus},#{orderPrice},#{orderTime},#{comeTime},#{departureTime},#{houseId},#{memberId})")
    void addOrder(Order order);

    //根据会员id查询订单
    @Select("select * from orders where memberId = #{mid} order by orderTime desc")
    @Results({
            @Result(id = true,property = "oid",column = "oid"),
            @Result(property = "orderTime" ,column = "orderTime"),
            @Result(property = "orderPrice" ,column = "orderPrice"),
            @Result(property = "orderStatus" ,column = "orderStatus"),
            @Result(property = "comeTime" ,column = "comeTime"),
            @Result(property = "departureTime" ,column = "departureTime"),
            @Result(column = "houseId",property = "house",one =@One(select = "cn.chenchen.dao.HouseDao.findById")),
    })
    List<Order> findByMid(int mid);

    //根据订单id查询订单
    @Select("select * from orders where oid = #{oid}")
    Order findByOid(int oid);

    //查询全部订单
    @Select("select * from orders order by orderTime desc ")
    @Results({
            @Result(id = true,property = "oid",column = "oid"),
            @Result(property = "orderTime" ,column = "orderTime"),
            @Result(property = "orderPrice" ,column = "orderPrice"),
            @Result(property = "orderStatus" ,column = "orderStatus"),
            @Result(property = "comeTime" ,column = "comeTime"),
            @Result(property = "departureTime" ,column = "departureTime"),
            @Result(column = "houseId",property = "house",one =@One(select = "cn.chenchen.dao.HouseDao.findById")),
            @Result(column = "memberId",property = "member",one =@One(select = "cn.chenchen.dao.MemberDao.findById")),
    })
    List<Order> findAll();

    //查询全部状态为已预订的订单
    @Select("select * from orders where orderStatus = '已预订' order by orderTime desc")
    @Results({
            @Result(id = true,property = "oid",column = "oid"),
            @Result(property = "orderTime" ,column = "orderTime"),
            @Result(property = "orderPrice" ,column = "orderPrice"),
            @Result(property = "orderStatus" ,column = "orderStatus"),
            @Result(property = "comeTime" ,column = "comeTime"),
            @Result(property = "departureTime" ,column = "departureTime"),
            @Result(column = "houseId",property = "house",one =@One(select = "cn.chenchen.dao.HouseDao.findById")),
            @Result(column = "memberId",property = "member",one =@One(select = "cn.chenchen.dao.MemberDao.findById")),
    })
    List<Order> findReserveByPage();

    //修改订单为已预订
    @Update("update orders set orderStatus = '已预订' where oid = #{id}")
    void updateToReserveById(int id);

    //办理入住，订单为已完成
    @Update("update orders set orderStatus = '已完成' where oid = #{id}")
    void updateToCompleteById(int id);

    //取消预订
    @Update("update orders set orderStatus = '已取消' where oid = #{id}")
    void updateToCancelById(int id);
}
