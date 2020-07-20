package cn.chenchen.domain;

public class House {
    private Integer hid; //房间id
    private String houseName; //房间名称
    private String houseState; //房间状态
    private Double housePrice;  //房间价格
    private Integer houseNum; //房间号

    private Integer count; //房间剩余数量


    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", houseName='" + houseName + '\'' +
                ", houseState='" + houseState + '\'' +
                ", housePrice=" + housePrice +
                ", houseNum=" + houseNum +
                ", count=" + count +
                '}';
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseState() {
        return houseState;
    }

    public void setHouseState(String houseState) {
        this.houseState = houseState;
    }

    public Double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Double housePrice) {
        this.housePrice = housePrice;
    }
}
