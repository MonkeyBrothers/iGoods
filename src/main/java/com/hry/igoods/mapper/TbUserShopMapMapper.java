package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbUserShopMap;
import com.hry.igoods.pojo.TbUserShopMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserShopMapMapper {
    int countByExample(TbUserShopMapExample example);

    int deleteByExample(TbUserShopMapExample example);

    int deleteByPrimaryKey(Integer userShopId);

    int insert(TbUserShopMap record);

    int insertSelective(TbUserShopMap record);

    List<TbUserShopMap> selectByExample(TbUserShopMapExample example);

    TbUserShopMap selectByPrimaryKey(Integer userShopId);

    int updateByExampleSelective(@Param("record") TbUserShopMap record, @Param("example") TbUserShopMapExample example);

    int updateByExample(@Param("record") TbUserShopMap record, @Param("example") TbUserShopMapExample example);

    int updateByPrimaryKeySelective(TbUserShopMap record);

    int updateByPrimaryKey(TbUserShopMap record);
}