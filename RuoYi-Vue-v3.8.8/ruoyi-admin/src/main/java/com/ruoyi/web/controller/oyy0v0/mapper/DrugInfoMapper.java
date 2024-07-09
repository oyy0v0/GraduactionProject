package com.ruoyi.web.controller.oyy0v0.mapper;

import com.ruoyi.web.controller.oyy0v0.domain.DrugInfo;

import java.util.List;


/**
 * 药品基本信息Mapper接口
 *
 * @author oyy0v0
 * @date 2024-07-09
 */
public interface DrugInfoMapper {
    /**
     * 查询药品基本信息
     *
     * @param id 药品基本信息主键
     * @return 药品基本信息
     */
    public DrugInfo selectDrugInfoById(Long id);

    /**
     * 查询药品基本信息列表
     *
     * @param drugInfo 药品基本信息
     * @return 药品基本信息集合
     */
    public List<DrugInfo> selectDrugInfoList(DrugInfo drugInfo);

    /**
     * 新增药品基本信息
     *
     * @param drugInfo 药品基本信息
     * @return 结果
     */
    public int insertDrugInfo(DrugInfo drugInfo);

    /**
     * 修改药品基本信息
     *
     * @param drugInfo 药品基本信息
     * @return 结果
     */
    public int updateDrugInfo(DrugInfo drugInfo);

    /**
     * 删除药品基本信息
     *
     * @param id 药品基本信息主键
     * @return 结果
     */
    public int deleteDrugInfoById(Long id);

    /**
     * 批量删除药品基本信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDrugInfoByIds(Long[] ids);
}
