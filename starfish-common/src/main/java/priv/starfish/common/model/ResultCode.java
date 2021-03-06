package priv.starfish.common.model;

@SuppressWarnings("unused")
public final class ResultCode {
	private ResultCode() {
		//
	}

	public static final int Unknown = -1;

	public static final int Ok = 0;

	// 基本

	public static class Basic {
		private static final int Base = Ok;
		//
	}

	// 系统
	public static class SYS {
		private static final int Base = 1000;
		//
	}

	// App
	public static class App {
		private static final int Base = 1500;
		// app节点
		private static final int AppNode = Base + 100;
		// app节点信息
		public static final int AppNode_Info = AppNode + 1;
	}

	// 用户
	public static class User {
		private static final int Base = 2000;
		//
	}

	// 认证与授权
	public static class Auth {
		private static final int Base = 3000;
		// 认证
		private static final int Authenticate = Base + 100;
		// 认证 \ 失败
		public static final int Authenticate_Fail = Authenticate + 1;
		// 认证 \ 失败
		public static final int AnthenBinding_Fail = Authenticate + 2;

		// 授权
		private static final int Authorize = Base + 200;
		// 授权 \ 失败
		public static final int Authorize_Fail = Authorize + 1;

	}

	// 验证码

	public static class VCode {
		private static final int Base = 4000;
		//
	}

	// 商品
	public static class Goods {
		private static final int Base = 5000;
		//
	}

	// 订单
	public static class Order {
		private static final int Base = 6000;
		//
	}

	// 交易
	public static class Trade {
		private static final int Base = 7000;
		//
	}

	// 促销
	public static class Promotion {
		private static final int Base = 8000;
		//
	}

	// 物流
	public static class Logistic {
		private static final int Base = 9000;
		//
	}

	// 财务
	public static class Finance {
		private static final int Base = 10000;
		//
	}

	public static class Other {
		private static final int Base = 11000;
		//
	}
}
