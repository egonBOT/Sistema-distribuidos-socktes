
package socktestcp;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class cliente {
      public static void main(String[] args) throws IOException {
        
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        // FLUXO DE BYTES QUE SERA ENVIADO PELO CLIENTE
        OutputStream outputStream = socket.getOutputStream();
        // CRIANDO UM OBJETO PARA SERIALIZAR O OBJETO QUE SERA ENVIADO PARA O SERIVIDOR
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
       
        
        System.out.println("enviando para o ServerSocket");
        Person egon = new Person(10L, "egon","silva", "não informado");
        //SERIALIZANDO OBJETO
        objectOutputStream.writeObject(egon);

        System.out.println("fechando socket.");
        socket.close();
    }
    
}
