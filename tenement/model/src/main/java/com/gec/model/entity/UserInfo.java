package com.gec.model.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表(UserInfo)表实体类
 *
 * @author makejava
 * @since 2025-01-16 16:46:51
 */
@SuppressWarnings("serial")
public class UserInfo extends BaseEntity implements Serializable {
    //序列化
    private static final long serialVersionUID = 1L;
    //用户id
    private Long id;
    //手机号码（用做登录用户名）
    private String phone;
    //密码
    private String password;
    //头像url
    private String avatarUrl;
    //昵称
    private String nickname;
    //账号状态
    private Integer status;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
