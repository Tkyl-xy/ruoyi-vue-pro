package cn.iocoder.yudao.adminserver.modules.pay.controller.order.vo.order;

import cn.iocoder.yudao.adminserver.modules.system.enums.SysDictTypeConstants;
import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 支付订单Excel VO
 *
 * @author aquan
 */
@Data
public class PayOrderExcelVO {

    @ExcelProperty("支付订单编号")
    private Long id;

    @ExcelProperty(value = "商户名称")
    private String merchantName;

    @ExcelProperty(value = "应用名称")
    private String appName;

    @ExcelProperty("商品标题")
    private String subject;

    @ExcelProperty("商户订单编号")
    private String merchantOrderId;

    @ExcelProperty("渠道订单号")
    private String channelOrderNo;

    @ExcelProperty(value = "支付订单号")
    private String no;

    @ExcelProperty("支付金额,单位：元")
    private String amount;

    @ExcelProperty("渠道手续金额，单位：元")
    private String channelFeeAmount;

    @ExcelProperty("渠道手续费，单位：百分比")
    private String channelFeeRate;

    @DictFormat(SysDictTypeConstants.PAY_ORDER_STATUS)
    @ExcelProperty(value = "支付状态", converter = DictConvert.class)
    private Integer status;

    @DictFormat(SysDictTypeConstants.PAY_ORDER_NOTIFY_STATUS)
    @ExcelProperty(value = "通知商户支付结果的回调状态", converter = DictConvert.class)
    private Integer notifyStatus;

    @ExcelProperty("异步通知地址")
    private String notifyUrl;

    @ExcelProperty("创建时间")
    private Date createTime;

    @ExcelProperty("订单支付成功时间")
    private Date successTime;

    @ExcelProperty("订单失效时间")
    private Date expireTime;

    @ExcelProperty("订单支付通知时间")
    private Date notifyTime;

    @ExcelProperty(value = "渠道编号名称")
    private String channelCodeName;

    @ExcelProperty("用户 IP")
    private String userIp;

    @DictFormat(SysDictTypeConstants.PAY_ORDER_REFUND_STATUS)
    @ExcelProperty(value = "退款状态", converter = DictConvert.class)
    private Integer refundStatus;

    @ExcelProperty("退款次数")
    private Integer refundTimes;

    @ExcelProperty("退款总金额，单位：元")
    private String  refundAmount;

    @ExcelProperty("商品描述")
    private String body;

}
