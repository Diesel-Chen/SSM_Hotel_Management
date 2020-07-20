package cn.chenchen.domain;

import cn.chenchen.utils.DateConvertUtils;

import java.util.Date;

public class SelectDate {
    private Date comeTime; //入住时间
    private String comeTimeStr; //日期字符串形式,方便在页面上显示il;
    private String comeTimeStr2; //类型转换器 配置失败 ..无奈之举
    private Date departureTime; //离店时间
    private String departureTimeStr;
    private String departureTimeStr2;
    private long count; //计算几晚上

    public String getComeTimeStr2() {
        if(comeTime!=null){
            comeTimeStr2 = DateConvertUtils.DateToString(comeTime,"yyyy/MM/dd");
        }
        return comeTimeStr2;
    }

    public void setComeTimeStr2(String comeTimeStr2) {
        this.comeTimeStr2 = comeTimeStr2;
    }

    public String getDepartureTimeStr2() {
        if(comeTime!=null){
            departureTimeStr2 = DateConvertUtils.DateToString(comeTime,"yyyy/MM/dd");
        }
        return departureTimeStr2;
    }

    public void setDepartureTimeStr2(String departureTimeStr2) {
        this.departureTimeStr2 = departureTimeStr2;
    }

    public long getCount() {
        long count = (departureTime.getTime()- comeTime.getTime())/(24*60*60*1000);
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getComeTimeStr() {
        if(comeTime!=null){
            comeTimeStr = DateConvertUtils.DateToString(comeTime,"yyyy年MM月dd日");
        }
        return comeTimeStr;
    }

    public void setComeTimeStr(String comeTimeStr) {
        this.comeTimeStr = comeTimeStr;
    }

    public String getDepartureTimeStr() {
        if(departureTime!=null){
            departureTimeStr = DateConvertUtils.DateToString(departureTime,"yyyy年MM月dd日");
        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
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
}
