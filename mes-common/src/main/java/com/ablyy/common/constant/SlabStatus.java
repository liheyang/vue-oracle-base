package com.ablyy.common.constant;

/**
 * 轧线状态
 * 0.未核对。1、已核对。2:炉内。3：已出炉。4.粗轧。5:中轧。6：预精轧。7：精轧。8：风冷。9:收集。10.完成。11:吊销。 12：改判 。13.炉甩。
 *
 * @author qinsy
 */
public class SlabStatus {

    /**
     * 未核对
     */
    public static final String INIT = "0";

    /**
     * 已核对
     */
    public static final String WAITING = "1";

    /**
     * 炉内
     */
    public static final String FCE_IN = "2";
    /**
     * 出炉
     */
    public static final String FCE_OUT = "3";
    /**
     * 粗轧
     */
    public static final String RM = "4";
    /**
     * 中轧
     */
    public static final String MM = "5";
    /**
     * 预精轧
     */
    public static final String PFM = "6";

    /**
     * 精轧
     */
    public static final String FM = "7";

    /**
     * 风冷
     */
    public static final String COLLING = "8";
    /**
     * 收集
     */
    public static final String COLLECT = "9";
    /**
     * 完成
     */
    public static final String FINISH = "10";

    /**
     * 吊销
     */
    public static final String REVOKE = "11";

    /**
     * 改判
     */
    public static final String REVERSED = "12";

    /**
     * 炉甩
     */
    public static final String FCE_THROW = "13";

}