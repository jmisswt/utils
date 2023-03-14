package com.jwt.demo.util.regex;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * @author jiangwentao
 * @version 2.0.0
 * @className RegexpUtil.java
 * @description 正则表法是
 * @createTime 2022年09月27日 10:51
 */
public class RegexpUtil {

    /**
     * ipv4地址 校验
     */
    private static final String REGEX_IPV4 = "^((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)$";

    /**
     * ipv4 cidr校验
     */
    private static final String REGEX_IPV4_CIDR = "^((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)[/](\\d|[1-2]\\d|3[0-2])";

    /**
     * ipv6地址 校验
     */
    private static final String REGEX_IPV6 = "^([\\da-fA-F]{1,4}:){6}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^::([\\da-fA-F]{1,4}:){0,4}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:):([\\da-fA-F]{1,4}:){0,3}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){2}:([\\da-fA-F]{1,4}:){0,2}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){3}:([\\da-fA-F]{1,4}:){0,1}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){4}:((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}$|^:((:[\\da-fA-F]{1,4}){1,6}|:)$|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)$|^([\\da-fA-F]{1,4}:){2}((:[\\da-fA-F]{1,4}){1,4}|:)$|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)$|^([\\da-fA-F]{1,4}:){4}((:[\\da-fA-F]{1,4}){1,2}|:)$|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?$|^([\\da-fA-F]{1,4}:){6}:$";

    /**
     * ipv6 cidr校验
     */
    private static final String REGEX_IPV6_CIDR = "^([\\da-fA-F]{1,4}:){6}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^::([\\da-fA-F]{1,4}:){0,4}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:):([\\da-fA-F]{1,4}:){0,3}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){2}:([\\da-fA-F]{1,4}:){0,2}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){3}:([\\da-fA-F]{1,4}:){0,1}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){4}:((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^:((:[\\da-fA-F]{1,4}){1,6}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){2}((:[\\da-fA-F]{1,4}){1,4}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){4}((:[\\da-fA-F]{1,4}){1,2}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){6}:(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$";

    /**
     * ipv4/ipv6 cidr校验
     */
    private static final String REGEX_IPV4_IPV6_CIDR = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/(\\d|[1-2]\\d|3[0-2]))?$|^([\\da-fA-F]{1,4}:){6}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^::([\\da-fA-F]{1,4}:){0,4}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:):([\\da-fA-F]{1,4}:){0,3}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){2}:([\\da-fA-F]{1,4}:){0,2}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){3}:([\\da-fA-F]{1,4}:){0,1}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){4}:((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^:((:[\\da-fA-F]{1,4}){1,6}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){2}((:[\\da-fA-F]{1,4}){1,4}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){4}((:[\\da-fA-F]{1,4}){1,2}|:)(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$|^([\\da-fA-F]{1,4}:){6}:(\\/([1-9]?\\d|(1([0-1]\\d|2[0-8]))))?$";

    /**
     * 以字母开头，由字母、中划线组成，不以中划线结尾
     */
    private static final String REGEX_LETTER_NUMBER = "^[A-Za-z][A-Za-z0-9\\-]+(?<!-)$";

    /**
     * 包含数字
     */
    private static final String REGEX_CONTAIN_NUMBER = ".*[0-9].*";

    /**
     * 包含小写字母
     */
    private static final String REGEX_LOWER_LETTER = ".*[a-z].*";

    /**
     * 包含大写字母
     */
    private static final String REGEX_UPPER_LETTER = ".*[A-Z].*";

    /**
     * 包含特殊字符 @$!%*#?&.
     */
    private static final String CHARACTER_REGEX = ".*[@$!%*#?&.].*";

    /**
     * 员工编号
     */
    private static final Pattern REGEX_STAFF_NUM = Pattern.compile("^[A-DF-SUW-Z0-9][A-Z0-9]{0,15}$");

    /**
     * 邮箱
     */
    private static final String REGEX_EMAIL_ADDR = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";

    /**
     * 手机号校验正则
     */
    private static final String REGEX_PHONE_NUM = "^1[3456789][0-9]{9}$";

    /**
     * 0-9和大小写英文字母
     */
    private static final String REGEX_NUMBER_AND_LETTER = "0123456789aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";

    /**
     * 车牌号校验规则
     */
    private static final String REGEX_CAR_NUM = "^([京津晋冀蒙辽吉黑沪苏浙皖闽赣鲁豫鄂湘粤桂琼渝川贵云藏陕甘青宁新][ABCDEFGHJKLMNPQRSTUVWXY][1-9DF][1-9ABCDEFGHJKLMNPQRSTUVWXYZ]\\d{3}[1-9DF]|[京津晋冀蒙辽吉黑沪苏浙皖闽赣鲁豫鄂湘粤桂琼渝川贵云藏陕甘青宁新][ABCDEFGHJKLMNPQRSTUVWXY][\\dABCDEFGHJKLNMxPQRSTUVWXYZ]{5})$";

    /**
     * 6位数字验证码
     */
    private static final String REGEX_VERIFY_CODE = "\\d{6}";

    /**
     * mac地址校验规则
     */
    private static final String REGEX_MAC_ADDR = "^[a-fA-F0-9]{2}([-:][a-fA-F0-9]{2}){5}";



    public static void main(String[] args) {
        Integer i1=10;
        Integer i2=10240;

        System.out.println(i2.equals(i1*1024));
    }

    /**
     * 对double类型值保留两位小数，若值小于0.01，则保留4位
     *
     * @param value 目标值
     * @return 保留小数后的值
     */
    private static double keep2Decimal(double value) {
        int bit = 2;
        if (value < 0.01) {
            bit = 4;
        }
        BigDecimal bigDecimal = new BigDecimal(value);
        return bigDecimal.setScale(bit, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
