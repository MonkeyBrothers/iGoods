package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbHeadLine;
import com.hry.igoods.pojo.TbHeadLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHeadLineMapper {
    int countByExample(TbHeadLineExample example);

    int deleteByExample(TbHeadLineExample example);

    int deleteByPrimaryKey(Integer lineId);

    int insert(TbHeadLine record);

    int insertSelective(TbHeadLine record);

    List<TbHeadLine> selectByExample(TbHeadLineExample example);

    TbHeadLine selectByPrimaryKey(Integer lineId);

    int updateByExampleSelective(@Param("record") TbHeadLine record, @Param("example") TbHeadLineExample example);

    int updateByExample(@Param("record") TbHeadLine record, @Param("example") TbHeadLineExample example);

    int updateByPrimaryKeySelective(TbHeadLine record);

    int updateByPrimaryKey(TbHeadLine record);
}