package com.hry.igoods.pojo;

import java.util.Date;

public class TbShopAuthMap {
    /**  */
    private Integer shopAuthId;

    /**  */
    private Integer employeeId;

    /**  */
    private Integer shopId;

    /** 冗余是为了让shop在查找员工的时候，不需要去连tb_shop表，直接连tb_shop_auth_map就okay */
    private String name;

    /**  */
    private String title;

    /**  */
    private Integer titleFlag;

    /**  */
    private Date createTime;

    /**  */
    private Date lastEditTime;

    /**  */
    private Integer enableStatus;

    public Integer getShopAuthId() {
        return shopAuthId;
    }

    public void setShopAuthId(Integer shopAuthId) {
        this.shopAuthId = shopAuthId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTitleFlag() {
        return titleFlag;
    }

    public void setTitleFlag(Integer titleFlag) {
        this.titleFlag = titleFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }
}