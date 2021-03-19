
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class comprasFeita implements notaFiscal{
    

    public String lista_compras;

    public String getLista_compras() {
        return lista_compras;
    }

    public void setLista_compras(String lista_compras) {
        
        this.lista_compras = lista_compras;
    }
    
    @Override
    public void nota() {
        chefe as = new chefe();
      clienteMlk clie = new clienteMlk();
        funcionario_mercado funcionario = new funcionario_mercado();
        Date DataHora= new Date();
        String dasta = new SimpleDateFormat("dd/MM/yyy").format(DataHora);
        String hora= new SimpleDateFormat("HH:mm:ss").format(DataHora);
         String nomeFun =funcionario.getNome();
         
         
         System.out.println("*******");
        System.out.println("VOCE COMPROU  "+ this.lista_compras);
        System.out.println("*******");
       
        System.out.println("CPF== "+clie.getCpf());
        System.out.println("SUPER MAIS_COMPRA !");
        System.out.println("DATA "+ dasta);
        System.out.println("HORA "+ hora);
       
                
    }

    
    
}
