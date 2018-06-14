package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbLocalAuth;
import com.hry.igoods.pojo.TbLocalAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLocalAuthMapper {
    int countByExample(TbLocalAuthExample example);

    int deleteByExample(TbLocalAuthExample example);

    int deleteByPrimaryKey(Integer localAuthId);

    int insert(TbLocalAuth record);

    int insertSelective(TbLocalAuth record);

    List<TbLocalAuth> selectByExample(TbLocalAuthExample example);

    TbLocalAuth selectByPrimaryKey(Integer localAuthId);

    int updateByExampleSelective(@Param("record") TbLocalAuth record, @Param("example") TbLocalAuthExample example);

    int updateByExample(@Param("record") TbLocalAuth record, @Param("example") TbLocalAuthExample example);

    int updateByPrimaryKeySelective(TbLocalAuth record);

    int updateByPrimaryKey(TbLocalAuth record);
}