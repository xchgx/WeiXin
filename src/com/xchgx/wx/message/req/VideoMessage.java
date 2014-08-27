package com.xchgx.wx.message.req;

/**
 * 视频消息 请求消息之视频消息 
 * 
FromUserName 	发送方帐号（一个OpenID） 
CreateTime 	消息创建时间 （整型） 
MsgType 	视频为video 

MediaId 	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。 
ThumbMediaId 	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
 
MsgId 	消息id，64位整型 
 * 
 * @author chengang
 *
 */
public class VideoMessage extends BaseMessage {

	//视频消息媒体id
	private String MediaId;
	//视频消息缩略图媒体id
	private String ThumbMediaId;
	
	public VideoMessage() {
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

	/**
	 * @return the thumbMediaId
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	/**
	 * @param thumbMediaId the thumbMediaId to set
	 */
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
	

}
