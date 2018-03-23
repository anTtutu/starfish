package priv.starfish.mall.xpay.channel.alipay.mob;

import priv.starfish.common.base.AppNodeInfo;
import priv.starfish.common.config.PropertyConfigurer;
import priv.starfish.common.util.OSUtil;
import priv.starfish.mall.xpay.channel.alipay.BaseParams;

public class AlipayParams extends BaseParams {

	private static final String KEY_SUFFIX = ".mob";
	//
	public static final String KEY_SERVICE = KEY_PREFIX + "service" + KEY_SUFFIX;
	public static final String KEY_SIGN_TYPE = KEY_PREFIX + "sign.type" + KEY_SUFFIX;
	public static final String KEY_SIGN_ALGORITHM = KEY_PREFIX + "sign.algorithm" + KEY_SUFFIX;
	public static final String KEY_SYNC_NOTIFY_URL = KEY_PREFIX + "sync.notify.url" + KEY_SUFFIX;
	public static final String KEY_ASYNC_NOTIFY_URL = KEY_PREFIX + "async.notify.url" + KEY_SUFFIX;

	// ------------------------------
	public static String service;
	public static String signType;
	public static String signAlgorithm;
	private static String syncNotifyUrl;
	private static String asyncNotifyUrl;

	public static String getSyncNotifyUrl() {
		return AppNodeInfo.getCurrent().getAbsBaseUrl() + syncNotifyUrl;
	}

	public static String getAsyncNotifyUrl() {
		return AppNodeInfo.getCurrent().getAbsBaseUrl() + asyncNotifyUrl;
	}

	public static void clearConfig() {
		service = null;
		signType = null;
		signAlgorithm = null;
		syncNotifyUrl = null;
		asyncNotifyUrl = null;
	}

	public static void loadConfig(PropertyConfigurer configurer) {
		service = configurer.get(KEY_SERVICE);
		signType = configurer.get(KEY_SIGN_TYPE);
		signAlgorithm = configurer.get(KEY_SIGN_ALGORITHM);
		syncNotifyUrl = configurer.get(KEY_SYNC_NOTIFY_URL);
		asyncNotifyUrl = configurer.get(KEY_ASYNC_NOTIFY_URL);
	}

	public static void echo() {
		BaseParams.echo();
		//
		StringBuilder sb = new StringBuilder();
		sb.append(KEY_SERVICE).append("=").append(service).append(OSUtil.getLineSeparator());
		sb.append(KEY_SIGN_TYPE).append("=").append(signType).append(OSUtil.getLineSeparator());
		sb.append(KEY_SIGN_ALGORITHM).append("=").append(signAlgorithm).append(OSUtil.getLineSeparator());
		sb.append(KEY_SYNC_NOTIFY_URL).append("=").append(syncNotifyUrl).append(OSUtil.getLineSeparator());
		sb.append(KEY_ASYNC_NOTIFY_URL).append("=").append(asyncNotifyUrl).append(OSUtil.getLineSeparator());

		System.out.println(sb.toString());
	}
}
