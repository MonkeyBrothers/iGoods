package com.hry.igoods.service.impl;

import com.hry.igoods.mapper.TbAreaMapper;
import com.hry.igoods.pojo.TbArea;
import com.hry.igoods.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务实现层
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private TbAreaMapper areaMapper;

    /**
     * 查询所有区域信息
     * @return
     */
    @Override
    public List<TbArea> getAllArea() {
        return areaMapper.selectByExample(null);
    }
}
