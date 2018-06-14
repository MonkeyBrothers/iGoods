package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbProductCategory;
import com.hry.igoods.pojo.TbProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductCategoryMapper {
    int countByExample(TbProductCategoryExample example);

    int deleteByExample(TbProductCategoryExample example);

    int deleteByPrimaryKey(Integer productCategoryId);

    int insert(TbProductCategory record);

    int insertSelective(TbProductCategory record);

    List<TbProductCategory> selectByExample(TbProductCategoryExample example);

    TbProductCategory selectByPrimaryKey(Integer productCategoryId);

    int updateByExampleSelective(@Param("record") TbProductCategory record, @Param("example") TbProductCategoryExample example);

    int updateByExample(@Param("record") TbProductCategory record, @Param("example") TbProductCategoryExample example);

    int updateByPrimaryKeySelective(TbProductCategory record);

    int updateByPrimaryKey(TbProductCategory record);
}