package kr.co.infopub.chap200.chat.server;
import   java.io.*;
import   java.util.*;

import kr.co.infopub.chap200.chat.common.Message;
public class ChatServerThread implements Runnable{
   Vector<Message>   buffer;   //Vector<Message> buffer;
   ObjectInputStream  ois;
   ObjectOutputStream oos;
   Message  mess;
   boolean  exit;
   String   name;
   public ChatServerThread(Vector<Message> v,ObjectInputStream ois,ObjectOutputStream oos){
     buffer=v;
     this.ois=ois;
     this.oos=oos;
     exit=false;
   }
   public void run(){
     while(!exit){
       try{
            mess=(Message)ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception�� �߻�");
       }
       int state=mess.getState();
       if(state==Message.END){
             mess.setMessage("���� �����ϼ̽��ϴ�.");
             name=mess.getName();
             broadCasting();
             for (int i = 0; i < buffer.size(); i++) {
               if ( ( (Message) buffer.get(i)).getName().equals(name)) {
                 buffer.remove(i);
               }
             }
             try {
               ois.close();
               oos.close();
             }
             catch (Exception x) {}
             exit = true;
			 System.out.println(name+"���� �����ϼ̽��ϴ�.");
       }else if(state==Message.INITCONTACT){

           Vector<String> userName=new Vector<>(5,1);
		  // Vector<String> userName=new Vector<String>(5,1);
           mess.setObjectStream(oos);
           buffer.add(mess);
           for(int i=0;i<buffer.size();i++){
             userName.add(((Message)buffer.get(i)).getName());
           }
           mess.setUserName(userName);
           System.out.println("broadCasting ����");
           broadCasting();
        }else{
           broadCasting();
        }//
      }
    }
    public synchronized void broadCasting(){
       for(int i=0;i<buffer.size();i++){
          try{
           ((Message)buffer.get(i)).getObjectStream().writeObject(mess);
          }catch(IOException e){
             System.out.println("broadCasting method���� IOException.");
           e.printStackTrace();
          }
        }
    }
}//class



