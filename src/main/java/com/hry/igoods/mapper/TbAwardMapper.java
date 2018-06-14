package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbAward;
import com.hry.igoods.pojo.TbAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAwardMapper {
    int countByExample(TbAwardExample example);

    int deleteByExample(TbAwardExample example);

    int deleteByPrimaryKey(Integer awardId);

    int insert(TbAward record);

    int insertSelective(TbAward record);

    List<TbAward> selectByExample(TbAwardExample example);

    TbAward selectByPrimaryKey(Integer awardId);

    int updateByExampleSelective(@Param("record") TbAward record, @Param("example") TbAwardExample example);

    int updateByExample(@Param("record") TbAward record, @Param("example") TbAwardExample example);

    int updateByPrimaryKeySelective(TbAward record);

    int updateByPrimaryKey(TbAward record);
}