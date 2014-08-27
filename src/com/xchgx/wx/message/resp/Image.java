package com.xchgx.wx.message.resp;

/**
 * 图片消息
 * 
 * <Image>
<MediaId><![CDATA[media_id]]></MediaId>
</Image>
ToUserName 	是 	接收方帐号（收到的OpenID）
FromUserName 	是 	开发者微信号
CreateTime 	是 	消息创建时间 （整型）
MsgType 	是 	image
MediaId 	是 	通过上传多媒体文件，得到的id。 
 * @author chengang
 *
 */
public class Image {

	//通过上传多媒体文件，得到的id。 
	private String MediaId;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the mediaId
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * @param mediaId the mediaId to set
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
