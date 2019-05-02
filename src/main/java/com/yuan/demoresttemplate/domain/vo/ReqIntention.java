package com.yuan.demoresttemplate.domain.vo;

import lombok.Data;

/**
 * @author David Hong
 * @version 1.0
 * @description
 */
@Data
public class ReqIntention {

    /**
     * 咨询公司
     */
    private String company;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 传真
     */
    private String fax;

    /**
     * 用户备注
     */
    private String more;


}
