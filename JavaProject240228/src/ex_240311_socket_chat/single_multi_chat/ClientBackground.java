package ex_240311_socket_chat.single_multi_chat;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
 
public class ClientBackground {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private ClientGUI gui;
    private String msg;
    private String nickName;
 
    public void setGui(ClientGUI gui) {
        this.gui = gui;
    }
    
    public static void main(String[] args) {
        ClientBackground clientBackground = new ClientBackground();
        clientBackground.connect();
    }
    //클라이언트 접속이 완료되면 
    public void connect(){
        try {
            socket = new Socket("10.100.104.27", 7777);
            System.out.println("서버에 연결됨");
            
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            
            //접속하자마자 닉네임 전송하면, 서버가 닉네임으로 인식 
            out.writeUTF(nickName);
            System.out.println("클라이언트 : 닉네임 전송완료 ");
            
            while(in!=null){
                msg = in.readUTF();
                gui.appendMsg(msg);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void sendMessage(String msg){
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void setNickname(String nickName){
        this.nickName = nickName;
    }
    
}
