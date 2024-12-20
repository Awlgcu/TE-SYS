package com.jiuaoedu.student.infrastracture.converter;

import com.jiuaoedu.json.JsonUtils;
import com.jiuaoedu.student.domain.aggregate.Address;

import javax.persistence.AttributeConverter;

/**
 * @description:属性转换器,和@Embedded, @Embeddable类似的值对象处理方式
 * @author: Rick
 * @date: 2024/12/9 10:00
 * @version: 1.0
 */

public class AddressConverter implements AttributeConverter<Address,String> {
    @Override
    public String convertToDatabaseColumn(Address address) {
        return JsonUtils.serialize(address);
    }

    @Override
    public Address convertToEntityAttribute(String dbData) {
        //最开始string是没有的,如果要先查找的话没有做空校验就会报错!!!
        if (dbData == null||dbData.equals("")) {
            return null;
        }
        return JsonUtils.parse(dbData, Address.class);
        //通过空校验则可以开始转换,一般通过json转换工具实现
    }
}
