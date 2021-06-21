package com.ablyy.common;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.ablyy.common.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 全局配置类
 *
 * @author ruoyi
 */
public class Global
{
    private static final Logger log = LoggerFactory.getLogger(Global.class);

    private static String NAME = "application.yml";

    private static String TEAMGROUP ="";//班组全局变量
    public static boolean IsHook=true;//系统是否配置钩号自动识别
    public static boolean IsAutoMeter=true;//系统是否自动抄表


    private static String STEELGRADE ="";//钢种
    private static String DIAMETER ="";//直径
    private static String TERMINALSPEED ="";//终轧速度


    public static String getSTEELGRADE() {
		return STEELGRADE;
	}

	public static void setSTEELGRADE(String sTEELGRADE) {
		STEELGRADE = sTEELGRADE;
	}

	public static String getDIAMETER() {
		return DIAMETER;
	}

	public static void setDIAMETER(String dIAMETER) {
		DIAMETER = dIAMETER;
	}

	public static String getTERMINALSPEED() {
		return TERMINALSPEED;
	}

	public static void setTERMINALSPEED(String tERMINALSPEED) {
		TERMINALSPEED = tERMINALSPEED;
	}

	public static String getTEAMGROUP() {
		return TEAMGROUP;
	}

	public static void setTEAMGROUP(String tEAMGROUP) {
		TEAMGROUP = tEAMGROUP;
	}

	/**
     * 当前对象实例
     */
    private static Global global;

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = new HashMap<String, String>();

    private Global()
    {
    }

    /**
     * 静态工厂方法
     */
    public static synchronized Global getInstance()
    {
        if (global == null)
        {
            global = new Global();
        }
        return global;
    }

}
