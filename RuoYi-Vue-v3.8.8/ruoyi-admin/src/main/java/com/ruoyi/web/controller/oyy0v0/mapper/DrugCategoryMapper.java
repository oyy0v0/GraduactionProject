package com.ruoyi.web.controller.oyy0v0.mapper;

import com.ruoyi.web.controller.oyy0v0.domain.DrugCategory;

import java.util.List;


/**
 * 药品分类
Mapper接口
 * 
 * @author oyy0v0
 * @date 2024-07-08
 */
public interface DrugCategoryMapper 
{
    /**
     * 查询药品分类

     * 
     * @param id 药品分类
主键
     * @return 药品分类

     */
    public DrugCategory selectDrugCategoryById(Long id);

    /**
     * 查询药品分类
列表
     * 
     * @param drugCategory 药品分类

     * @return 药品分类
集合
     */
    public List<DrugCategory> selectDrugCategoryList(DrugCategory drugCategory);

    /**
     * 新增药品分类

     * 
     * @param drugCategory 药品分类

     * @return 结果
     */
    public int insertDrugCategory(DrugCategory drugCategory);

    /**
     * 修改药品分类

     * 
     * @param drugCategory 药品分类

     * @return 结果
     */
    public int updateDrugCategory(DrugCategory drugCategory);

    /**
     * 删除药品分类

     * 
     * @param id 药品分类
主键
     * @return 结果
     */
    public int deleteDrugCategoryById(Long id);

    /**
     * 批量删除药品分类

     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDrugCategoryByIds(Long[] ids);
}
