package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbProductImg;
import com.hry.igoods.pojo.TbProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductImgMapper {
    int countByExample(TbProductImgExample example);

    int deleteByExample(TbProductImgExample example);

    int deleteByPrimaryKey(Integer productImgId);

    int insert(TbProductImg record);

    int insertSelective(TbProductImg record);

    List<TbProductImg> selectByExample(TbProductImgExample example);

    TbProductImg selectByPrimaryKey(Integer productImgId);

    int updateByExampleSelective(@Param("record") TbProductImg record, @Param("example") TbProductImgExample example);

    int updateByExample(@Param("record") TbProductImg record, @Param("example") TbProductImgExample example);

    int updateByPrimaryKeySelective(TbProductImg record);

    int updateByPrimaryKey(TbProductImg record);
}