package com.xchgx.wx.message.resp;

/**
 * 回复图片消息
 * 
<xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[fromUser]]></FromUserName>
<CreateTime>12345678</CreateTime>
<MsgType><![CDATA[image]]></MsgType>
<Image>
<MediaId><![CDATA[media_id]]></MediaId>
</Image>
</xml>

参数 	是否必须 	说明
ToUserName 	是 	接收方帐号（收到的OpenID）
FromUserName 	是 	开发者微信号
CreateTime 	是 	消息创建时间 （整型）
MsgType 	是 	image
MediaId 	是 	通过上传多媒体文件，得到的id。 
 * 
 * 
 * @author chengang
 *
 */
public class ImageMessage  extends BaseMessage{

	private Image image;
	
	public ImageMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

}
