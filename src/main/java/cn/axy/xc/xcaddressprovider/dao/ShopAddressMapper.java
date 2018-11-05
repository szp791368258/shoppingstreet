package cn.axy.xc.xcaddressprovider.dao;

import cn.axy.xc.xcaddressprovider.pojo.ShopAddress;

public interface ShopAddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(ShopAddress record);

    int insertSelective(ShopAddress record);

    ShopAddress selectByPrimaryKey(Integer addressid);

    int updateByPrimaryKeySelective(ShopAddress record);

    int updateByPrimaryKey(ShopAddress record);
}