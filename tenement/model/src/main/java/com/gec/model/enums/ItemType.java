package com.gec.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

//枚举房间类型

public enum ItemType implements BaseEnum {
    APARTMENT(1, "公寓"),
    ROOM(2, "房间");

    //表示在请求提交时是以code的值进行提交
    //@JsonValue的作用是：已知请求体参数中有{type:1,name:"公寓"},那么label_info中的type属性到底存储的是枚举的type还是name属性？ 依据是哪个属性被@JsonValue修饰
    //@EnumValue的作用是：已知从数据库中查询出的数据是： {type:1} , 那么这个type:1应该要对应一个枚举值，但是枚举ItemType有两个属性：code , name , 到底这个数字1要复制给哪个属性，就看哪个属性被@EnumValue修饰
    @JsonValue
    @EnumValue
    private Integer code;
    private String name;

    ItemType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
