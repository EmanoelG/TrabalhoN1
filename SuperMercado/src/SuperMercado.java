
import java.util.ArrayList;
import java.util.Scanner;


//import supermercado.totalCompra;
public class SuperMercado {

    public static void main(String[] args) {
        // TODO code application logic here]
        System.out.println("NOME FUNCIONARIO");
        Scanner funcionario = new Scanner(System.in);
        String nomeF = funcionario.next();

        funcionario_mercado func = new funcionario_mercado();
        func.setCpf(2353252);
        func.setFolga(false);
        func.setIdade(28);
        func.setNome(nomeF.toString());

        System.out.println(func.toString());
        System.out.println("--------------------------------");
        System.out.println("NOME CLIENTE");
        // Scanner clie = new Scanner(System.in);
        String funci = funcionario.next();
        clienteMlk cliente = new clienteMlk();
        cliente.setCpf(1212412);
        cliente.setIdade(18);
        cliente.setNome(funci);
        System.out.println(cliente.toString());

        System.out.println("--------------------------------");
        System.out.println("NOME CHEFE");
        Scanner ch = new Scanner(System.in);
        String nomeCh = ch.next();

        chefe chfe = new chefe();
        chfe.setSalario(121212);
        chfe.setCpf(135235);
        chfe.setIdade(26);
        chfe.setNome(nomeCh);
        System.out.println(chfe.toString());

        System.out.println("--------------------------------");
        System.out.println("VAMOS AS COMPRAS !!!");
        System.out.println("--------------------------------");
        Scanner entrada = new Scanner(System.in);
        System.out.println("O QUE DESEJA ? ");
        boolean contador = false;
        ArrayList<String> listaCarnes = new ArrayList<>();
        while (contador == false) {
            System.out.println("PARA FINALIZAR PEDIDO DIGITE A ");
            String a = entrada.nextLine();
            if (a.equals("a")) {
                System.out.println("PAROU !!!");

                contador = true;
                //break;
            } else {
               // acougueMerc carnes = new acougueMerc();

                listaCarnes.add(a);

            }
        }
        System.out.println("DIGITE O RESPECTIVO NUMERO DO ITEM QUE DESEJA EXCLUIR !!!");
        System.out.println("LISTA DE COMPRAS ATE AGORA =  " + listaCarnes);
        System.out.println("DESEJA EXCLUIR ALGUMA? S/N: ");
        String escolher = entrada.nextLine();
        int contado = 0;
        if (escolher.equals("s")) {
            boolean sair = false;

            while (sair == false) {
                for (int i = 0; i < listaCarnes.size(); i++) {
                    if (listaCarnes.get(i) != null) {
                        contado++;
                    }
                    System.out.println("ITEM--- " + i + ":  " + listaCarnes.get(i));
                }

                for (int i = 0; i < listaCarnes.size(); i++) {
                    System.out.println("----------------------------------------");
                    int escolha = entrada.nextInt();
                    listaCarnes.remove(escolha);
                    System.out.println("----------------------------------------");
                    System.out.println("DESEJA EXCLUIR MAIS? S/N");
                    String escolh = entrada.next();
                    if (escolh.equals("n")) {
                        System.out.println("SAIUUU");

                        comprasFeita cpm = new comprasFeita();
                        cpm.setLista_compras(listaCarnes.toString());

                        cpm.nota();

                        sair = true;
                    }
                    for (int s = 0; s < listaCarnes.size(); s++) {
                        if (listaCarnes.get(i) != null) {
                            contado++;
                        }
                        System.out.println("ITEM--- " + s + listaCarnes.get(s));
                    }

                }

            }
        } else if (escolher.equals("n")) {
            System.out.println("OKAY, vamos la ");

            comprasFeita cp = new comprasFeita();
            cp.setLista_compras(listaCarnes.toString());

            cp.nota();

            for (int s = 0; s < listaCarnes.size(); s++) {
                if (listaCarnes.get(s) != null) {
                    contado++;
                }
                System.out.println("ITEM--- " + s + listaCarnes.get(s));

            }

        }
    }
}
