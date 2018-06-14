package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbUserAwardMap;
import com.hry.igoods.pojo.TbUserAwardMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserAwardMapMapper {
    int countByExample(TbUserAwardMapExample example);

    int deleteByExample(TbUserAwardMapExample example);

    int deleteByPrimaryKey(Integer userAwardId);

    int insert(TbUserAwardMap record);

    int insertSelective(TbUserAwardMap record);

    List<TbUserAwardMap> selectByExample(TbUserAwardMapExample example);

    TbUserAwardMap selectByPrimaryKey(Integer userAwardId);

    int updateByExampleSelective(@Param("record") TbUserAwardMap record, @Param("example") TbUserAwardMapExample example);

    int updateByExample(@Param("record") TbUserAwardMap record, @Param("example") TbUserAwardMapExample example);

    int updateByPrimaryKeySelective(TbUserAwardMap record);

    int updateByPrimaryKey(TbUserAwardMap record);
}