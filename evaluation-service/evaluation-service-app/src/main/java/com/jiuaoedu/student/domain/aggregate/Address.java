package com.jiuaoedu.student.domain.aggregate;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/9 9:58
 * @version: 1.0
 */

public class Address {
    private String province;
    private String city;
    private String district;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return province+"."+city+"."+district;
    }
}
