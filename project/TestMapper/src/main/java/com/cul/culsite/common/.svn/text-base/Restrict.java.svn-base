package com.cul.culsite.common;

import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: kely@rd
 * Date: 14-6-10
 * Time: 下午3:55
 * Email: kely@upcard.com.cn
 */
public class Restrict {
    /** 在此定义校验需要用到的正则表达式 */
    public static final String EMPTY = "";                                 // 空注释
    public static final String JSON_OBJECT = "JSONObject";              // json对象
    public static final String JSON_ARRAY = "JSONArray";                // json数组
    public static final String CARD_NO = "^\\d{19}$";                  // 校验卡号19位数字
    public static final String CARD_TYPE = "^[\\w\\d]{4}$";           // 校验卡类型必须为4位数字字母
    public static final String AMOUNT = "^\\d{1,10}.?\\d{0,2}$";       // 金额整数部分1至10位数字，小数部分精确后两位，单位为元
    public static final String MOBILE = "^\\d{11}$";                     // 手机号为11位数字
    public static final String CARD_PWD = "^\\d{6}$";                    // 卡密码为6位数字
    public static final String CARD_PWD_TYPE = "^[PWA]$";                    // 密码类型P：pos，W：web, A: all
    public static final String PAYMENT_PWD = "^\\d{6}$";                // 支付密码为6位数字
    public static final String USER_ID = "^[\\d]{16}$";                // 用户id， 16位数字
    public static final String LOGIN_ID = "^[\\w\\W]{3,64}$";          // 登录id，3-64字节长度
    public static final String USER_NAME = "^[\\w\\W]{3,64}$";          // 登录名，3-64字节长度
    public static final String REAL_NAME = "^[\\w\\W]{2,32}$";          // 真实姓名，长度2-32
    public static final String LOGIN_PWD = "^[a-zA-Z-0-9_]{6,16}$";    // 登录密码，暂定6至16位数字字母下划线
    public static final String EMAIL = "^[\\w_]+@\\w+[.\\w]+$";         // 简单校验email格式
    public static final String CAPTCHA = "^\\d{6}$";                      // 验证码为6位数字
    public static final String PAGE = "^\\d{1,6}$";                       //页数，1至999999页
    public static final String PAGE_SIZE = "^\\d{1,4}$";                 //页大小，1至9999
    public static final String ISSUER_ID = "^[\\w\\d]{4}$";             // 商户代码，4位字母数字
    public static final String CLUB = "^[\\w\\d]{3}$";                      // 俱乐部，3位大写字母
    public static final String BIND_TYPE = "CARD";                       // 绑定卡/CARD, 绑定券
    public static final String YES_NO = "^[YN]$";                     // 是Y/、否/N
    public static final String CURRENT_HIS = "^[TH]$";               // T-当天查询，H-历史查询H
    public static final String WIDTH_HEIGHT = "^\\d{1,4}$";             // 长度宽度1-4位整数
    public static final String HID = "[\\w\\W]{6,60}";                      // hid标识为6-60位长度的字符组成
    public static final String TOKEN = "^[\\w\\W]{6,40}$";                    // token为1-40位长度的字符组成
    public static final String TIMESTAMP = "^\\d{10}$";                  // 时间戳，10位数字，取1970年到当前的秒数
    public static final String DATE = "^[2-9]\\d{3}[01]\\d[0-3]\\d$";   // 日期YYYYMMDD
    public static final String TIME = "^[012]\\d[0-6]\\d[0-6]\\d$";   // 时间hhmmss
    public static final String CHANNEL = "^[\\w\\W]{1,20}$";            //最长20位字符
    public static final String ORDER_ID = "^[\\w\\W]{6,40}$";            //最长40位字符
    public static final String MERCHANT_NO = "^\\d{15}$";			// 15位数字
    public static final String BRANCH_NO = "^\\d{3,4}$";				//1-4位整数
    public static final String TERMINAL = "^\\d{8}$";            // 8位数字
    public static final String CUL_SEQ = "^\\d{12,}$";            // 12位数字以上
    public static final String CUST_ID = "^\\d{1,16}$";            // 16位数字
    public static final String BUSINESS_ID = "^(FCARD|CCARD|PCARD|WCARD)$";            // CIF业务ID，FCARD：理财卡，CCARD：赊销卡，PCARD：手机APP
    public static final String CARD_STATUS = "^[IA]$";                     // CIF开通状态，I：未激活，A：已激活
    public static final String SMS_CODE = "^\\d{6}$";                    // 短信验证码为6位数字
    public static final String FCARD_PASS = "^[a-zA-Z-0-9_]{6,16}$";               // 理财卡密码，暂定6至16位数字字母下划线
    public static final String DATE_RANGE_TYPE = "^[012]$";               // 理财卡日期范围类型，1-选当前,2-起止日期,0-全部
    public static final String URL = "^http";               // URL必须以http开头
    public static final String DATE_REGULAR = "^(?:(?!0000)[0-9]{4}(?:(?:0[1-9]|1[0-2])(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])(?:29|30)|(?:0[13578]|1[02])31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)0229)$";     //完整日期校验YYYYMMDD，包括闰年
    public static final String PRODUCT_COUNT = "^\\d{1,2}$";         // 商品数量，限制为1至99
    
    public static final String ACTIVE_CODE = "^\\d{32}$"; // 激活码 32位
    public static final String RRN = "^\\d{12}$"; // 交易参考号12位
    
    public static final String BILL_NO = "^[\\w\\W]{1,40}$"; // 订单号1-40位数字
    public static final String TRACK2_DATA = "^\\d{19}=\\d{14}$"; //二磁信息

    public static final String CAPTCHA_EXPIRES = "^\\d{1,4}$";//过期时间1-4位数字
    public static final String PRODUCT_ID = "^[\\w\\W]{1,20}$"; // 商品id不超过20位
    
    public static final String IS_PARTIAL = "^[YN]$"; //// 是Y/、否/N
    /**
     * ipv4正则表达式，非获取匹配
     */
    public static final String IP_V4 = "^((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))$";
    
}
