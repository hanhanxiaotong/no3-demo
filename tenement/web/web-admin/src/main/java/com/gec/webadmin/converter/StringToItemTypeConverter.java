//package com.gec.webadmin.converter;
//
//
//import com.gec.model.enums.ItemType;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class StringToItemTypeConverter implements Converter<String, ItemType> {
//
//    //将字符串转换为枚举类型
//    @Override
//    public ItemType convert(String code) {
//        System.out.println("__________转换执行——————————");
//        System.out.println(code);
//        ItemType itemType = Arrays.stream(ItemType.values())
//                .filter(ItemType -> code.equals(""+ItemType.getCode()))//getCode获取到的ItemType枚举中的Integer，拼接一个空字符串让他变成String类型，以和传入转换器的String类型的code对应
//                .findFirst()
//                .orElseThrow(IllegalAccessError::new);
//
//        System.out.println(itemType.toString());
//        return itemType;
//    }
//}
