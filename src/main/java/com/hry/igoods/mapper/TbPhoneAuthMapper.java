package com.hry.igoods.mapper;

import com.hry.igoods.pojo.TbPhoneAuth;
import com.hry.igoods.pojo.TbPhoneAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPhoneAuthMapper {
    int countByExample(TbPhoneAuthExample example);

    int deleteByExample(TbPhoneAuthExample example);

    int deleteByPrimaryKey(Integer phoneAuthId);

    int insert(TbPhoneAuth record);

    int insertSelective(TbPhoneAuth record);

    List<TbPhoneAuth> selectByExample(TbPhoneAuthExample example);

    TbPhoneAuth selectByPrimaryKey(Integer phoneAuthId);

    int updateByExampleSelective(@Param("record") TbPhoneAuth record, @Param("example") TbPhoneAuthExample example);

    int updateByExample(@Param("record") TbPhoneAuth record, @Param("example") TbPhoneAuthExample example);

    int updateByPrimaryKeySelective(TbPhoneAuth record);

    int updateByPrimaryKey(TbPhoneAuth record);
}