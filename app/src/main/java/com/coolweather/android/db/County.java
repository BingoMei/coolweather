package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lizhi on 2017/5/24 0024.
 * 存放县的信息的类包含天气情况
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//记录县的名字
    private String weatherId;//记录县锁对应的天气
    private int cityId;///记录当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
