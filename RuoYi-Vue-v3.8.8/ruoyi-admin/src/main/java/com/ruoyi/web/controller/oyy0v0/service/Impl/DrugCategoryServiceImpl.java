package com.ruoyi.web.controller.oyy0v0.service.Impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.web.controller.oyy0v0.domain.DrugCategory;
import com.ruoyi.web.controller.oyy0v0.mapper.DrugCategoryMapper;
import com.ruoyi.web.controller.oyy0v0.service.IDrugCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 药品分类
Service业务层处理
 * 
 * @author oyy0v0
 * @date 2024-07-08
 */
@Service
public class DrugCategoryServiceImpl implements IDrugCategoryService
{
    @Autowired
    private DrugCategoryMapper drugCategoryMapper;

    /**
     * 查询药品分类

     * 
     * @param id 药品分类
主键
     * @return 药品分类

     */
    @Override
    public DrugCategory selectDrugCategoryById(Long id)
    {
        return drugCategoryMapper.selectDrugCategoryById(id);
    }

    /**
     * 查询药品分类
列表
     * 
     * @param drugCategory 药品分类

     * @return 药品分类

     */
    @Override
    public List<DrugCategory> selectDrugCategoryList(DrugCategory drugCategory)
    {
        return drugCategoryMapper.selectDrugCategoryList(drugCategory);
    }

    /**
     * 新增药品分类

     * 
     * @param drugCategory 药品分类

     * @return 结果
     */
    @Override
    public int insertDrugCategory(DrugCategory drugCategory)
    {
        drugCategory.setCreateTime(DateUtils.getNowDate());
        return drugCategoryMapper.insertDrugCategory(drugCategory);
    }

    /**
     * 修改药品分类

     * 
     * @param drugCategory 药品分类

     * @return 结果
     */
    @Override
    public int updateDrugCategory(DrugCategory drugCategory)
    {
        drugCategory.setUpdateTime(DateUtils.getNowDate());
        return drugCategoryMapper.updateDrugCategory(drugCategory);
    }

    /**
     * 批量删除药品分类

     * 
     * @param ids 需要删除的药品分类
主键
     * @return 结果
     */
    @Override
    public int deleteDrugCategoryByIds(Long[] ids)
    {
        return drugCategoryMapper.deleteDrugCategoryByIds(ids);
    }

    /**
     * 删除药品分类
信息
     * 
     * @param id 药品分类
主键
     * @return 结果
     */
    @Override
    public int deleteDrugCategoryById(Long id)
    {
        return drugCategoryMapper.deleteDrugCategoryById(id);
    }
}
