package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbUserProductMap;
import com.hry.igoods.pojo.TbUserProductMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserProductMapMapper {
    int countByExample(TbUserProductMapExample example);

    int deleteByExample(TbUserProductMapExample example);

    int deleteByPrimaryKey(Integer userProductId);

    int insert(TbUserProductMap record);

    int insertSelective(TbUserProductMap record);

    List<TbUserProductMap> selectByExample(TbUserProductMapExample example);

    TbUserProductMap selectByPrimaryKey(Integer userProductId);

    int updateByExampleSelective(@Param("record") TbUserProductMap record, @Param("example") TbUserProductMapExample example);

    int updateByExample(@Param("record") TbUserProductMap record, @Param("example") TbUserProductMapExample example);

    int updateByPrimaryKeySelective(TbUserProductMap record);

    int updateByPrimaryKey(TbUserProductMap record);
}