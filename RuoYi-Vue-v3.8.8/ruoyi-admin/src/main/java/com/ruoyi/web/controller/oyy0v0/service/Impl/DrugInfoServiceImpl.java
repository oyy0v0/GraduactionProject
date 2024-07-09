package com.ruoyi.web.controller.oyy0v0.service.Impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.web.controller.oyy0v0.domain.DrugInfo;
import com.ruoyi.web.controller.oyy0v0.mapper.DrugInfoMapper;
import com.ruoyi.web.controller.oyy0v0.service.IDrugInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 药品基本信息Service业务层处理
 * 
 * @author oyy0v0
 * @date 2024-07-09
 */
@Service
public class DrugInfoServiceImpl implements IDrugInfoService
{
    @Autowired
    private DrugInfoMapper drugInfoMapper;

    /**
     * 查询药品基本信息
     * 
     * @param id 药品基本信息主键
     * @return 药品基本信息
     */
    @Override
    public DrugInfo selectDrugInfoById(Long id)
    {
        return drugInfoMapper.selectDrugInfoById(id);
    }

    /**
     * 查询药品基本信息列表
     * 
     * @param drugInfo 药品基本信息
     * @return 药品基本信息
     */
    @Override
    public List<DrugInfo> selectDrugInfoList(DrugInfo drugInfo)
    {
        return drugInfoMapper.selectDrugInfoList(drugInfo);
    }

    /**
     * 新增药品基本信息
     * 
     * @param drugInfo 药品基本信息
     * @return 结果
     */
    @Override
    public int insertDrugInfo(DrugInfo drugInfo)
    {
        drugInfo.setCreateTime(DateUtils.getNowDate());
        return drugInfoMapper.insertDrugInfo(drugInfo);
    }

    /**
     * 修改药品基本信息
     * 
     * @param drugInfo 药品基本信息
     * @return 结果
     */
    @Override
    public int updateDrugInfo(DrugInfo drugInfo)
    {
        drugInfo.setUpdateTime(DateUtils.getNowDate());
        return drugInfoMapper.updateDrugInfo(drugInfo);
    }

    /**
     * 批量删除药品基本信息
     * 
     * @param ids 需要删除的药品基本信息主键
     * @return 结果
     */
    @Override
    public int deleteDrugInfoByIds(Long[] ids)
    {
        return drugInfoMapper.deleteDrugInfoByIds(ids);
    }

    /**
     * 删除药品基本信息信息
     * 
     * @param id 药品基本信息主键
     * @return 结果
     */
    @Override
    public int deleteDrugInfoById(Long id)
    {
        return drugInfoMapper.deleteDrugInfoById(id);
    }
}
