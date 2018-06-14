package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbShopAuthMap;
import com.hry.igoods.pojo.TbShopAuthMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopAuthMapMapper {
    int countByExample(TbShopAuthMapExample example);

    int deleteByExample(TbShopAuthMapExample example);

    int deleteByPrimaryKey(Integer shopAuthId);

    int insert(TbShopAuthMap record);

    int insertSelective(TbShopAuthMap record);

    List<TbShopAuthMap> selectByExample(TbShopAuthMapExample example);

    TbShopAuthMap selectByPrimaryKey(Integer shopAuthId);

    int updateByExampleSelective(@Param("record") TbShopAuthMap record, @Param("example") TbShopAuthMapExample example);

    int updateByExample(@Param("record") TbShopAuthMap record, @Param("example") TbShopAuthMapExample example);

    int updateByPrimaryKeySelective(TbShopAuthMap record);

    int updateByPrimaryKey(TbShopAuthMap record);
}