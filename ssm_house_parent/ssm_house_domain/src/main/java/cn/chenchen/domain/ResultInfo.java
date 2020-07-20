package cn.chenchen.domain;

public class ResultInfo {

    private String errorMsg; //发生异常的错误提醒


    @Override
    public String toString() {
        return "ResultInfo{" +
                "errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
