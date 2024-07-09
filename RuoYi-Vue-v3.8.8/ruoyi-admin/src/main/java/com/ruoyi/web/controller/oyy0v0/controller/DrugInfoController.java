package com.ruoyi.web.controller.oyy0v0.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.oyy0v0.domain.DrugInfo;
import com.ruoyi.web.controller.oyy0v0.service.IDrugInfoService;
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
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品基本信息Controller
 *
 * @author oyy0v0
 * @date 2024-07-09
 */
@RestController
@RequestMapping("/system/druginfo")
public class DrugInfoController extends BaseController {
    @Autowired
    private IDrugInfoService drugInfoService;

    /**
     * 查询药品基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrugInfo drugInfo) {
        startPage();
        List<DrugInfo> list = drugInfoService.selectDrugInfoList(drugInfo);
        return getDataTable(list);
    }

    /**
     * 导出药品基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:export')")
    @Log(title = "药品基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DrugInfo drugInfo) {
        List<DrugInfo> list = drugInfoService.selectDrugInfoList(drugInfo);
        ExcelUtil<DrugInfo> util = new ExcelUtil<DrugInfo>(DrugInfo.class);
        util.exportExcel(response, list, "药品基本信息数据");
    }

    /**
     * 获取药品基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(drugInfoService.selectDrugInfoById(id));
    }

    /**
     * 新增药品基本信息
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:add')")
    @Log(title = "药品基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DrugInfo drugInfo) {
        return toAjax(drugInfoService.insertDrugInfo(drugInfo));
    }

    /**
     * 修改药品基本信息
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:edit')")
    @Log(title = "药品基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DrugInfo drugInfo) {
        return toAjax(drugInfoService.updateDrugInfo(drugInfo));
    }

    /**
     * 删除药品基本信息
     */
    @PreAuthorize("@ss.hasPermi('system:druginfo:remove')")
    @Log(title = "药品基本信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(drugInfoService.deleteDrugInfoByIds(ids));
    }
}
