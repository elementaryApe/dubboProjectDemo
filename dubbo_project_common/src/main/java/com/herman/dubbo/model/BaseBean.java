package com.herman.dubbo.model;

import java.util.Date;

/**
 * @author hsh
 * @create 2018-06-27 17:21
 **/
public class BaseBean {

    private String id;
    private Date createTime;
    private Date updateTime;
    private Integer isDeleted;

    public BaseBean() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id == null?null:id.trim();
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
