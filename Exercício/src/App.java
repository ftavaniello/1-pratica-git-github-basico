import java.util.ArrayList;

public class App {
    
    //A
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int cont = 0;
        for (Integer i : l) {
            if (i == el) {
                cont +=1;
            }
        }
        return cont;
    }

    //B
    public static boolean hasRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> encontrados = new ArrayList<>(); //Cria uma lista 'seen' para armazenar elementos já encontrados na lista original.
        for (Integer num : l) { //Define a variável num do tipo Integer, que vai armazenar cada elemento da lista l durante a iteração 
            if (encontrados.contains(num)) { //Verifica se o número num já está na lista seen. Se sim, isso significa que o número é repetido, e o método retorna true.
                return true;
            }
            encontrados.add(num); //Adiciona o número à lista de vistos
        }
        return false;
    }

    //E
    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> uniao = new ArrayList<>(l1);
        for (Integer item : l2) {
            if (uniao.contains(item)) {
                uniao.addAll(l2);
                break;
            }
        }
        return uniao;
    }

    //MAIN
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> teste = new ArrayList<Integer>();
        teste.add(1);
        teste.add(2);
        teste.add(3);
        teste.add(3);
        teste.add (6);
        teste.add (4);
        System.out.println ("O número 3 aparece " + nOcorrencias(teste, 3) + " vezes");
        System.out.println(hasRepeat(teste));
        ArrayList <Integer> teste2 = new ArrayList<Integer>();
        teste2.add(4);
        teste2.add(5);
        teste2.add(6);
        teste2.add(7);
        teste2.add (8);
        teste2.add (9);
        System.out.println(union(teste, teste2));

    }
}
