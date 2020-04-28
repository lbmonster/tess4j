package com.text.recognition.tess4j.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author libo
 */
@Data
@ApiModel("发票识别返回DTO")
public class InvoiceInfo implements Serializable {

    /**
     * 发票号码
     */
    @ApiModelProperty("发票号码")
    private String invoiceNum;

    /**
     * 发票金额
     */
    @ApiModelProperty("发票金额")
    private String invoiceAmount;

    /**
     * 不含税金额
     */
    @ApiModelProperty("开票日期")
    private String amountExcludingTax;

//    /**
//     * 税额
//     */
//    @ApiModelProperty("税额")
//    private String amountExcludingTax;

    /**
     * 开票日期
     */
    @ApiModelProperty("开票日期")
    private String invoiceDate;

    /**
     * 开票方名称
     */
    @ApiModelProperty("开票方名称")
    private String billingPartyName;

    /**
     * 购买方名称
     */
    @ApiModelProperty("购买方名称")
    private String buyersName;

    /**
     * 纳税人识别号
     */
    @ApiModelProperty("纳税人识别号")
    private String identifier;

}
