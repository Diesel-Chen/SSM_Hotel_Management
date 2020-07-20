package cn.chenchen.domain;

import cn.chenchen.utils.DateConvertUtils;

import java.util.Date;

public class Order {
    private Integer oid; //订单编号
    private Date orderTime; //下单时间
    private String orderTimeStr;
    private Double orderPrice; //订单价格
    private String orderStatus; //订单状态
    private Date comeTime; //入住时间
    private String comeTimeStr;
    private Date departureTime; //离店时间
    private String departureTimeStr;
    private Integer houseId; //房间号
    private Integer memberId; //会员号

    private House house;
    private Member member;

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", orderTime=" + orderTime +
                ", orderStatus='" + orderStatus + '\'' +
                ", comeTime=" + comeTime +
                ", departureTime=" + departureTime +
                ", houseId=" + houseId +
                ", memberId=" + memberId +
                ", house=" + house +
                ", member=" + member +
                '}';
    }

    public String getOrderTimeStr() {
        if(orderTime!=null){
            orderTimeStr = DateConvertUtils.DateToString(orderTime,"yyyy-MM-dd HH:mm:ss");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public String getComeTimeStr() {
        if(comeTime!=null){
            comeTimeStr = DateConvertUtils.DateToString(comeTime,"yyyy-MM-dd");
        }
        return comeTimeStr;
    }

    public void setComeTimeStr(String comeTimeStr) {
        this.comeTimeStr = comeTimeStr;
    }

    public String getDepartureTimeStr() {
        if(departureTime!=null){
            departureTimeStr = DateConvertUtils.DateToString(departureTime,"yyyy-MM-dd");
        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
