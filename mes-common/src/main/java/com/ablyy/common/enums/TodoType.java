package com.ablyy.common.enums;

/**
 * 待办事宜类型
 * @author ly
 * @date 2020/7/20 10:22
 */
public enum TodoType {

    TOCHECKORDER("0"),
    TOCHECKPLAN("1"),
    TOCHECKEQUIPMENT("2"),
    TOROAT("3");

    private String value = "";
    private TodoType(String value){
        this.value=value;
    }
    public String getValue () {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}