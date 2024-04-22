

import java.util.linkedlist;
import java.util.Queue;
public class main {
    public static void main (string[] args){

Queue<String> filaCarros = new LinkedList<>();
filaCarros.add("branco"); 
filaCarros.add("preto");
filaCarros.add("vermelho");
string primeirocarro=filacarros.peek();
string carroremovido=filacarros.poll();
boolean filavazia=filacarros.isEmpty();
system.out.print("primeiro elemento da fila" + primeirocarro);
system.out.print(" carro removido" + carroremovido);
system.out.print(" a fila está vazia?" +filavazia);
    
    }
}