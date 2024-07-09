package com.ruoyi.web.controller.oyy0v0.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品基本信息对象 jk_drug_info
 *
 * @author oyy0v0
 * @date 2024-07-09
 */
public class DrugInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    private Long id;

    /**
     * 药品名称
     */
    @Excel(name = "药品名称")
    private String drugName;

    /**
     * 药品分类ID
     */
    @Excel(name = "药品分类ID")
    private Long drugId;

    /**
     * 是否过期（0全新，1快过期，2已经过期）
     */
    @Excel(name = "是否过期", readConverterExp = "0=全新，1快过期，2已经过期")
    private Long overdue;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setOverdue(Long overdue) {
        this.overdue = overdue;
    }

    public Long getOverdue() {
        return overdue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("drugName", getDrugName())
                .append("drugId", getDrugId())
                .append("overdue", getOverdue())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .toString();
    }
}
