
package socktestcp;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class server {

   
    public static void main(String[] args) throws Exception {
         
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept();
        System.out.println("Connection from " + socket + "!");

        // LENDO FLUXO DE BYTES ENVIADOS PELO  CLIENTE
        
        InputStream inputStream = socket.getInputStream();
        // DESSERIALIZA O FLUXO DE BYTES RECEBIDOS PELO SERVIDOR
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        // CRIANDO OBJETO APARTIR DO DADO DESSERIALIZADO
        Person egon = (Person) objectInputStream.readObject();
        System.out.println(egon.toString());
     

      System.out.println("fechando sockets.");
        ss.close();
        socket.close();
    }
}
        
    

