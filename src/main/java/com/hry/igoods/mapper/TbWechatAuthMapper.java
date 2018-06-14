package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbWechatAuth;
import com.hry.igoods.pojo.TbWechatAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWechatAuthMapper {
    int countByExample(TbWechatAuthExample example);

    int deleteByExample(TbWechatAuthExample example);

    int deleteByPrimaryKey(Integer wechatAuthId);

    int insert(TbWechatAuth record);

    int insertSelective(TbWechatAuth record);

    List<TbWechatAuth> selectByExample(TbWechatAuthExample example);

    TbWechatAuth selectByPrimaryKey(Integer wechatAuthId);

    int updateByExampleSelective(@Param("record") TbWechatAuth record, @Param("example") TbWechatAuthExample example);

    int updateByExample(@Param("record") TbWechatAuth record, @Param("example") TbWechatAuthExample example);

    int updateByPrimaryKeySelective(TbWechatAuth record);

    int updateByPrimaryKey(TbWechatAuth record);
}