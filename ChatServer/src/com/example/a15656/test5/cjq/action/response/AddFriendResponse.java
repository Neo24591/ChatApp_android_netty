package com.example.a15656.test5.cjq.action.response;

public class AddFriendResponse extends ResponseImpl{
	
	private int state;  // 0 Ϊ���ʧ�ܣ�1Ϊ��ӳɹ���
	private String fname;
	public AddFriendResponse(int state,String fname){
		this.state = state;
		this.fname = fname;
	}
	public String getFname(){
		return fname;
	}
	
	public String toString(){
		return (state == 0?"���ʧ��":state == 1?"��ӳɹ�":"�Ѵ��ں���");
	}

}
