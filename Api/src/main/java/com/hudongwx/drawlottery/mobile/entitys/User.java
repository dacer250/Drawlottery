package com.hudongwx.drawlottery.mobile.entitys;

import javax.persistence.*;

@Table(name = "t_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户账号,ID号
     */
    @Column(name = "account_id")
    private Long accountId;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户姓名
     */
    @Column(name = "real_name")
    private String realName;

    private String nickname;

    /**
     * 用户电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 用户积分
     */
    @Column(name = "user_integral")
    private Integer userIntegral;

    /**
     * 用户当前状态
     */
    @Column(name = "current_state")
    private Integer currentState;

    /**
     * 头像id
     */
    @Column(name = "header_id")
    private Integer headerId;

    /**
     * 账户余额
     */
    @Column(name = "gold_number")
    private Integer goldNumber;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户账号,ID号
     *
     * @return account_id - 用户账号,ID号
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置用户账号,ID号
     *
     * @param accountId 用户账号,ID号
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取用户姓名
     *
     * @return real_name - 用户姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户姓名
     *
     * @param realName 用户姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取用户电话
     *
     * @return phone_number - 用户电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置用户电话
     *
     * @param phoneNumber 用户电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取密码盐
     *
     * @return salt - 密码盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置密码盐
     *
     * @param salt 密码盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取用户积分
     *
     * @return user_integral - 用户积分
     */
    public Integer getUserIntegral() {
        return userIntegral;
    }

    /**
     * 设置用户积分
     *
     * @param userIntegral 用户积分
     */
    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    /**
     * 获取用户当前状态
     *
     * @return current_state - 用户当前状态
     */
    public Integer getCurrentState() {
        return currentState;
    }

    /**
     * 设置用户当前状态
     *
     * @param currentState 用户当前状态
     */
    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    /**
     * 获取头像id
     *
     * @return header_id - 头像id
     */
    public Integer getHeaderId() {
        return headerId;
    }

    /**
     * 设置头像id
     *
     * @param headerId 头像id
     */
    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    /**
     * 获取账户余额
     *
     * @return gold_number - 账户余额
     */
    public Integer getGoldNumber() {
        return goldNumber;
    }

    /**
     * 设置账户余额
     *
     * @param goldNumber 账户余额
     */
    public void setGoldNumber(Integer goldNumber) {
        this.goldNumber = goldNumber;
    }

    //获取公盐+私盐
    public String getCredentialsSalt() {
        return this.salt + "294786949@qq.com";
    }

}