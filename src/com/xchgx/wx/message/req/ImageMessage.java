package com.xchgx.wx.message.req;

/** 
 * 图片消息  请求消息之图片消息
 ToUserName 	开发者微信号 
FromUserName 	发送方帐号（一个OpenID） 
CreateTime 	消息创建时间 （整型） 
MsgType 	image 
PicUrl 	图片链接 
MediaId 	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。 
MsgId 	消息id，64位整型 
 * @author liufeng 
 * @date 2013-05-19 
 */  
public class ImageMessage extends BaseMessage {  
    // 图片链接  
    private String PicUrl;  
    private String MediaId;
  
    public String getPicUrl() {  
        return PicUrl;  
    }  
  
    public void setPicUrl(String picUrl) {  
        PicUrl = picUrl;  
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