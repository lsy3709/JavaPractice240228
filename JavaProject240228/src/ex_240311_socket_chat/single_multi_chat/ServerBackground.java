package ex_240311_socket_chat.single_multi_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
import javax.sound.midi.Receiver;
 
public class ServerBackground {
	// 클라이언트, 서버 연결 부분
	// 연결 후 메세지 전달 부분. 
	// 스레드 부분, 멀티 채팅을 할 때, 스레드 이용해서, 동시에 쓰고, 받기가 가능하게.
 
    private ServerSocket serverSocket; // 서버 소켓
    private Socket socket; // 받아올 소켓 저장
    private ServerGUI gui;
    private String msg;
    /** XXX 03. 사용자들의 정보를 저장하는 맵 */ 
    // 키 : 닉네임, 채팅방 입장시 사용했던 이름 : 예) 이상용 
    // 값 : DataOutputStream, 소켓을 이용해서, 상대방이 입력받은 내용을 출력을 해주는 기능. 
    // clientMap : 모든 사용자의 이름과, 해당 이름에 대한 출력을 하는 기능인 인스턴스가 들어가 있음. 
    
    private Map<String, DataOutputStream> clientMap = new HashMap<String, DataOutputStream>();
 
    public void setGui(ServerGUI gui) {
        this.gui = gui;
    }
 
    public static void main(String[] args) {
        ServerBackground serverBackground = new ServerBackground();
        serverBackground.setting();
    }
    //서버가 생성될때 셋팅해주는 함수 
    public void setting() {
        
        try {
        	// 스레드인데, 작업 스케줄, 순서 맞게 , 동시 실행이 가능하게 해주는 역할. 
            Collections.synchronizedMap(clientMap); //교통정리를 해준다.( clientMap을 네트워크 처리해주는것 )
            // 서버가 해당 포트로 소켓을 이용해서, 통신 준비. 
            serverSocket = new ServerSocket(7777);
 
            while (true) {
                /** XXX 01.서버가 할일 : 방문자를 계속 받아서, 쓰레드 리시버를 계속 생성 */
                
                System.out.println("대기중.....");
                // 소켓이 , 클라이언트가 요청을하면 수락을 하는 기능, 
                // 수락을하면 , 서버 <-->클라이언트 , 연결고리:소켓
                socket = serverSocket.accept(); // 여기서 클라이언트 받음
                // socket 의 여러 기능중 하나이고, getInetAddress, 정보를 출력해줌. 
                System.out.println(socket.getInetAddress() + "에서 접속했습니다.");
                
                //여기서 새로운 사용자 스레드 클래스를 생성해서 소켓 정보를 넣어줘야한다.
                // 스레드 클래스 
                Receiver receiver = new Receiver(socket);
                receiver.start();
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //맵의내용(클라이언트) 저장과 삭제 
    public void addClient(String nick, DataOutputStream out) throws IOException{
        String message=nick + "님이 접속하셨습니다.\n";
        // 모든 유저에게 전달.
        sendMessage(message);
        // 메세지를 본인의 채팅화면에 붙이고
        gui.appendMsg(message);
        // 해시맵에 인스턴스를 등록하기.(요소등록)
        clientMap.put(nick, out);
        
    }
    
    public void removeClient(String nick){
        String message=nick + "님이 나가셨습니다. \n";
        sendMessage(message);
        gui.appendMsg(message);
        clientMap.remove(nick);
    }
    
    //메세지 내용 전파 , 브로드캐스트(방송), 방송국 방송 전파 <-> 시청자들 모두 볼수 있음. 
    // 메세지 내용을 받으면, 
    // 메세지을 , 맵에 모든 유저가 들어가 있고, 해당 키에 대한 값으로, 
    // 그 유저에게 메세지를 쓰는 인스턴스가 있는데, 
    // 이 인스턴스를 이용해서, 메세지 모두 전판 하는 기능. 
    public void sendMessage (String msg){
    	//Iterator: 반복이 가능한 타입, 
    	// 보통은 해시맵에서, 해당 키에 대한 정보와 값을 모두 받습니다. 
    	// 현재는, keySet 키의 정보만 받았음. 
        Iterator<String> iterator = clientMap.keySet().iterator(); //key셋으로 반복자지정
        // 현재, 키에는 , 닉네임이 들어가 있음. 
        String key = "";
        
        // 모든 키값을 순회해서 확인,
        // 결론, 모든 닉네임에 해당하는 출력 기능 인스턴스를 이용해서, 출력을 할 예정. 
        while(iterator.hasNext()){
        	// 맵 , 키: 이상용, 값 : 출력기능 인스턴스
        	// 맵 , 키: 상준, 값 : 출력기능 인스턴스
        	// 맵, 키 : 서현, 값 : 출력기능 인스턴스
        	// ... , 모든 멤버가 해당 맵안에 다 들어가 있다. 
        	
        	// 키 : 이상용, 키2 : 상준, 키3: 서현.. 
            key = iterator.next();// 반복자에서 하나하나 키를 빼온다.
            try{
            	// 이상용 키에 대한get(key) 값을 가지고 옵니다.
            	// writeUTF, 쓰기 작업 , 출력을 , 채팅 메세지 내용. 
            	// writeUTF , 한글 안깨지기 위해서 사용. 
                clientMap.get(key).writeUTF(msg);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    // ------------------리시버---------------------------
    // 스레드 정의 1) Thread 상속 2) Runnable 인터페이스를 구현
    class Receiver extends Thread {
        /** XXX 리시버가 할일 : 네트워크 소켓을 받아서 계속듣고 보내는 일. */
    	// 데이터, 메세지를 전달하는 역할. 
        private DataInputStream in; // 데이터 입력 스트림
        private DataOutputStream out; // 데이터 아웃풋 스트림
        private String nick;
        
        // 생성자, Socket 타입의 인스턴스를 받고 있다. 
        // 유저가 1) 맵에 등록이되고, 2) 스레드를 상속받은 클래스를 생성 3) 해당 스레드 클래스에 소켓 인스턴스전달.
        // Socket , 서버, 클라이언트의 연결고리 
        public Receiver(Socket socket) {
            try {
            	// socket.getOutputStream() : 출력을 담당하기. , 기반 스트림. 
            	// new DataOutputStream : 보조 스트림
            	// 출력 담당, 예) 유저 가 입력한 채팅의 내용을 출력하는 기능. 
                out = new DataOutputStream(socket.getOutputStream());
                // 입력 담당 , 예) 유저가 입력한 내용을 입력으로 받아들이는 기능. 
                in = new DataInputStream(socket.getInputStream());
                // 실행후, 닉네임 : 이상용, 이상용을 읽을 때, 한글 깨짐 없게 할려고, 
                // 타입을 UTF 했음. 
                nick = in.readUTF();
                // 닉네임을 입력 받았고, 출력을 담당하는 기능과 같이해서, 맵에 담기. 
                //
                addClient(nick,out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        @Override
        public void run() {
 
            try {
            	// in이 null 이 아니면, 계속 동작을함. 
            	// in이 null 이면, 반복 멈춤. 
            	// in 자원 반납을 하지 않는 이상, 계속 동작을 한다. 
            	// 종료시에 자원을 반납합니다. ->이때 in null 이됨.  
                while (in != null) {
                	// 유저가 입력한 채팅의 내용을 한글 깨짐 방지 하기위해
                	// 중간 데이터 타입인 UTF 
                    msg = in.readUTF();// UTF로 읽어들인다.
                    // 다른 유저들에게 전달. 
                    sendMessage(msg);
                    // 본인의 창에 붙이기 작업. 
                    gui.appendMsg(msg);
                }
            } catch (Exception e) {
                //사용접속종료시 여기서 에러발생. 
                removeClient(nick);
            }
        }
    }
 
}
