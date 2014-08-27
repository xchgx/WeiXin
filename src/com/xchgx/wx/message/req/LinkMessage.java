package com.xchgx.wx.message.req;

/** 
 * 链接消息  请求消息之链接消息
 *  
ToUserName 	接收方微信号
FromUserName 	发送方微信号，若为普通用户，则是一个OpenID
CreateTime 	消息创建时间
MsgType 	消息类型，link

Title 	消息标题
Description 	消息描述
Url 	消息链接

MsgId 	消息id，64位整型 
 *  
 * @author liufeng 
 * @date 2013-05-19 
 */  
public class LinkMessage extends BaseMessage {  
    // 消息标题  
    private String Title;  
    // 消息描述  
    private String Description;  
    // 消息链接  
    private String Url;  
  
    public String getTitle() {  
        return Title;  
    }  
  
    public void setTitle(String title) {  
        Title = title;  
    }  
  
    public String getDescription() {  
        return Description;  
    }  
  
    public void setDescription(String description) {  
        Description = description;  
    }  
  
    public String getUrl() {  
        return Url;  
    }  
  
    public void setUrl(String url) {  
        Url = url;  
    }  
}  