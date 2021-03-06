package com.zixin;


public enum CountryEnum {
    ONE(1,"齐"),
    TWO(2,"楚"),
    THREE(3,"燕"),
    FOUR(4,"韩"),
    FIVE(5,"赵"),
    SIX(6,"魏"),
    SEVEN(7,"秦");


    private Integer retCode;
    private String retMessage;

    public Integer getRetCode() {
        return retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach(int index){
        CountryEnum[] myArray = CountryEnum.values();
        for (CountryEnum element:myArray) {
            if(index ==element.retCode){
                return element;
            }
        }
        return null;
    }
}
