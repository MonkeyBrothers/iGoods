package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbPersonInfo;
import com.hry.igoods.pojo.TbPersonInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPersonInfoMapper {
    int countByExample(TbPersonInfoExample example);

    int deleteByExample(TbPersonInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TbPersonInfo record);

    int insertSelective(TbPersonInfo record);

    List<TbPersonInfo> selectByExample(TbPersonInfoExample example);

    TbPersonInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TbPersonInfo record, @Param("example") TbPersonInfoExample example);

    int updateByExample(@Param("record") TbPersonInfo record, @Param("example") TbPersonInfoExample example);

    int updateByPrimaryKeySelective(TbPersonInfo record);

    int updateByPrimaryKey(TbPersonInfo record);
}