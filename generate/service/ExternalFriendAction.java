package service;
import util.RequestObject;

public final class ExternalFriendAction {
		public static interface OnSyncWeiBoFriendsSuccessListener {
			public void onSyncWeiBoFriendsSuccess();
		}

		public static RequestObject<OnSyncWeiBoFriendsSuccessListener> syncWeiBoFriends(String tokenId, String uId, Integer type) {
			RequestObject<OnSyncWeiBoFriendsSuccessListener> obj = new RequestObject<OnSyncWeiBoFriendsSuccessListener>();
			obj.setListenerInterfaceClass(OnSyncWeiBoFriendsSuccessListener.class);
			obj.setUrl(RequestObject.baseUrl + "/inf/syncweibofriends" + ".json");
			obj.addParam("token", tokenId);
			obj.addParam("uid", uId);
			obj.addParam("type", type);
			obj.enque();
			return obj;
		}
}
