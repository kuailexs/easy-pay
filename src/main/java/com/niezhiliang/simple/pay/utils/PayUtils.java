package com.niezhiliang.simple.pay.utils;

import com.niezhiliang.simple.pay.content.PayContent;
import com.niezhiliang.simple.pay.dto.*;
import com.niezhiliang.simple.pay.strategy.*;
import com.niezhiliang.simple.pay.vos.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2019/4/27 下午1:44
 */
public class PayUtils {


    /**
     * PC端支付下单 返回一个表单
     * @param pcPayDTO
     * @return
     */
    public static String alpayPcPay(AlipayPcPayDTO pcPayDTO) {
        PayContent<String,AlipayPcPayDTO> payContent = new PayContent(new AliPayPcPayStrategy());
        return payContent.execute(pcPayDTO);
    }

    /**
     * 支付宝二维码生成
     * @param qrcodeDTO
     * @return
     */
    public static AlipayQrcodeVO alipayQrcode(AlipayQrcodeDTO qrcodeDTO) {
        PayContent<AlipayQrcodeVO,AlipayQrcodeDTO> payContent = new PayContent(new AlipayQrcodeStrategy());
        return payContent.execute(qrcodeDTO);
    }

    /**
     * 支付宝退款接口
     * @param alipayRefundDTO
     * @return
     */
    public static AlipayRefundVO alipayRefund(AlipayRefundDTO alipayRefundDTO) {
        PayContent<AlipayRefundVO,AlipayRefundDTO> payContent = new PayContent(new AliPayRefundStrategy());
        return payContent.execute(alipayRefundDTO);
    }

    /**
     * 支付宝支付回调
     * @param request
     * @return
     */
    public static AlipayCallBackVO alipayPayCallBack(HttpServletRequest request) {
        PayContent<AlipayCallBackVO,HttpServletRequest> payContent = new PayContent(new AliPayCallBackStrategy());
        return payContent.execute(request);

    }

    /**
     * 微信生成二维码
     * @param wxQrcodeDTO
     * @return
     */
    public static WxpayQrcodeVO wxpayQrcode(WxpayQrcodeDTO wxQrcodeDTO) {
        PayContent<WxpayQrcodeVO,WxpayQrcodeDTO> payContent = new PayContent(new WxpayQrcodeStrategy());
        return payContent.execute(wxQrcodeDTO);
    }

    /**
     * 微信支付回调
     * @param request
     * @return
     */
    public static WxpayCallBackVO wxpayNotify(HttpServletRequest request) {
        PayContent<WxpayCallBackVO,HttpServletRequest> payContent = new PayContent(new WxpayNotifyStrategy());
        return payContent.execute(request);
    }

    /**
     * 微信关闭订单
     * @param wxCloseOrderDTO
     * @return
     */
    public static WxpayCloseOrderVO wxpayCloseOrder(WXCloseOrderDTO wxCloseOrderDTO) {
        PayContent<WxpayCloseOrderVO,WXCloseOrderDTO> payContent = new PayContent(new WxpayCloseOrderStrategy());
        return payContent.execute(wxCloseOrderDTO);
    }

    /**
     * 微信退款
     * @param wxRefundDTO
     * @return
     */
    public static WxpayRefundVO wxRefund(WxpayRefundDTO wxRefundDTO){
        PayContent<WxpayRefundVO,WxpayRefundDTO> payContent = new PayContent(new WxpayRefundStrategy());
        return payContent.execute(wxRefundDTO);
    }

    /**
     * 微信退款查询
     * @param wxRefundQueryDTO
     * @return
     */
    public static WxpayRefundQueryVO wxRefundQuery(WxpayRefundQueryDTO wxRefundQueryDTO) {
        PayContent<WxpayRefundQueryVO,WxpayRefundQueryDTO> payContent = new PayContent(new WxpayRefundQueryStrategy());
        return payContent.execute(wxRefundQueryDTO);
    }

}
