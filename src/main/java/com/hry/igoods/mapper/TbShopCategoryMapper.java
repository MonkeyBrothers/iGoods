package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbShopCategory;
import com.hry.igoods.pojo.TbShopCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopCategoryMapper {
    int countByExample(TbShopCategoryExample example);

    int deleteByExample(TbShopCategoryExample example);

    int deleteByPrimaryKey(Integer shopCategoryId);

    int insert(TbShopCategory record);

    int insertSelective(TbShopCategory record);

    List<TbShopCategory> selectByExample(TbShopCategoryExample example);

    TbShopCategory selectByPrimaryKey(Integer shopCategoryId);

    int updateByExampleSelective(@Param("record") TbShopCategory record, @Param("example") TbShopCategoryExample example);

    int updateByExample(@Param("record") TbShopCategory record, @Param("example") TbShopCategoryExample example);

    int updateByPrimaryKeySelective(TbShopCategory record);

    int updateByPrimaryKey(TbShopCategory record);
}