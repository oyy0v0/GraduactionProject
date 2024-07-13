package com.ruoyi.web.controller.oyy0v0.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.oyy0v0.domain.DrugCategory;
import com.ruoyi.web.controller.oyy0v0.service.IDrugCategoryService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品分类
Controller
 * 
 * @author oyy0v0
 * @date 2024-07-08
 */
@RestController
@RequestMapping("/system/drug")
public class DrugCategoryController extends BaseController
{
    @Autowired
    private IDrugCategoryService drugCategoryService;

    @PostMapping(value = "listAll")
    public AjaxResult listAll(){
        List<DrugCategory> datalist = drugCategoryService.selectDrugCategoryList(null);
        return AjaxResult.success(datalist);
    }
    /**
     * 查询药品分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:drug:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrugCategory drugCategory)
    {
        startPage();
        List<DrugCategory> list = drugCategoryService.selectDrugCategoryList(drugCategory);
        return getDataTable(list);
    }

    /**
     * 导出药品分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:drug:export')")
    @Log(title = "药品分类 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DrugCategory drugCategory)
    {
        List<DrugCategory> list = drugCategoryService.selectDrugCategoryList(drugCategory);
        ExcelUtil<DrugCategory> util = new ExcelUtil<DrugCategory>(DrugCategory.class);
        util.exportExcel(response, list, "药品分类 数据");
    }

    /**
     * 获取药品分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:drug:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(drugCategoryService.selectDrugCategoryById(id));
    }

    /**
     * 新增药品分类

     */
    @PreAuthorize("@ss.hasPermi('system:drug:add')")
    @Log(title = "药品分类 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DrugCategory drugCategory)
    {
        return toAjax(drugCategoryService.insertDrugCategory(drugCategory));
    }

    /**
     * 修改药品分类

     */
    @PreAuthorize("@ss.hasPermi('system:drug:edit')")
    @Log(title = "药品分类 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DrugCategory drugCategory)
    {
        return toAjax(drugCategoryService.updateDrugCategory(drugCategory));
    }

    /**
     * 删除药品分类

     */
    @PreAuthorize("@ss.hasPermi('system:drug:remove')")
    @Log(title = "药品分类 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(drugCategoryService.deleteDrugCategoryByIds(ids));
    }
}
