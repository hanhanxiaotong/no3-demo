package com.gec.model.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * 房间信息表(RoomInfo)表实体类
 *
 * @author makejava
 * @since 2025-01-16 16:46:51
 */
@SuppressWarnings("serial")
public class RoomInfo extends BaseEntity implements Serializable {
    //序列化
    private static final long serialVersionUID = 1L;
    //房间id
    private Long id;
    //房间号
    private String roomNumber;
    //租金（元/月）
    private Double rent;
    //所属公寓id
    private Long apartmentId;
    //是否发布
    private Integer isRelease;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //是否删除
    private Integer isDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getIsRelease() {
        return isRelease;
    }

    public void setIsRelease(Integer isRelease) {
        this.isRelease = isRelease;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}

