package com.mdground.yideguanregister;

import android.graphics.Typeface;

/**
 * 网络请求的常量类
 * 
 * @author Administrator
 * 
 */
public class MedicalConstant {
	/**
	 * 全局服务器地址
	 */
	public static final String GLOBAL_HOST = "https://g.yideguan.com";
	// public static final String GLOBAL_HOST = "https://guat.yideguan.com";
	public static final String API_ACTION = "/Api/ClinicService.aspx";
	public static final String GLOBAL_SERVER = GLOBAL_HOST + API_ACTION;

	// public static final String IMAGE_SERVER = "fuat.yideguan.com";
	public static final String IMAGE_SERVER = "file.yideguan.com";
	public static final String WEB_SERVICE_NAMESPACE = "http://tempuri.org/";

	// 短信接口参数
	public static final String APP_KEY = "fdd3cf873a60";
	public static final String APP_SECRECT = "bb31da16613ce49ba8cb815ccf5afe7d";
	
	// APP_ID 替换为你的应用从官方网站申请到的合法appId   
	public static final String WECHAT_MOBILE_APP_ID = "wx89ed82042044ca4a";
    public static final String WECHAT_MOBILE_APP_SECRET = "14234cb71fc29c657be5cb8db93a6fb4";
     
    // 微信公众平台的Appid
//    public static final String WECHAT_PUBLIC_APP_ID = "wxcb3d5adbfb987208";
//    public static final String WECHAT_PUBLIC_APP_SECRET = "c05eec74ab0ecde5d6bd1f16c2bfb548";

	// 医直达在sdcar的目录
	public static final String APP_PATH = "/yideguan";
	// 保存数据目录 
	public static final String APP_DATA = "/data";
	// 保存二维码目录
	public static final String APP_QRCODE = "/qrcode";
	//保存crash打印
	public static final String APP_CRASH = "/crash";
 
	// 信鸽推送
	public static final long XG_V2_ACCESS_ID = 2100142473;
	public static final String XG_V2_ACCESS_KEY = "AP6YZ6M68H1M";
	
	// 字体
	public static Typeface NotoSans_Regular;

	public static final String IMAGE_URI_PREFIX = "image://";

}
