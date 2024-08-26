import java.util.ArrayList;

public class App {
    
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int cont = 0;
        for (Integer i : l) {
            if (i == el) {
                cont +=1;
            }
        }
        return cont;
    }
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> teste = new ArrayList<Integer>();
        teste.add(1);
        teste.add(2);
        teste.add(3);
        teste.add(3);
        teste.add (3);
        teste.add (4);
        System.out.println ("O número 3 aparece " + nOcorrencias(teste, 3) + " vezes");
    }
}
