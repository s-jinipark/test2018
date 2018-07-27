package kr.co.infopub.chap200.chat.server;
import  java.io.*;
import  java.net.*;
import  java.util.*;

import kr.co.infopub.chap200.chat.common.Message;
public class ChatServer{
   //Vector		buffer=new Vector(5,3);
   Vector<Message> buffer=new Vector<Message>(5,3);
   ServerSocket			serverSocket;
   Socket				socket;
   ObjectInputStream	ois;
   ObjectOutputStream   oos;
   public void service(){
	   System.out.println("start Server service...");
     try{
        System.out.println("���� �غ���");
        serverSocket=new ServerSocket(5200);
		serverSocket.getReuseAddress() ;//ServerSocket port �ٷ� �ٽû��
        }catch(IOException e){
        System.out.println("���� �غ��߿� IOException �߻�.");
     }
    while(true){
      try{
           socket=serverSocket.accept();
           System.out.println(socket.getInetAddress()+"�� �پ����ϴ�.");
           ois=new ObjectInputStream(socket.getInputStream());
           oos=new ObjectOutputStream(socket.getOutputStream());
           String ip=socket.getInetAddress().toString();
           Thread t=new Thread(new ChatServerThread(buffer,ois,oos));
           t.start();
         }catch(IOException e){
           System.out.println("IOException�� �߻��߽��ϴ�.");
      }
    }
  }
}

