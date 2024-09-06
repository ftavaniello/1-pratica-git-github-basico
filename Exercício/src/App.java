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
        ArrayList<Integer> encontrados = new ArrayList<>(); 
        for (Integer num : l) { 
            if (encontrados.contains(num)) { 
                return true;
            }
            encontrados.add(num); 
        }
        return false;
    }

    //c
    public static int nroRepeat(ArrayList<Integer> lista) {
        int totalRepeticoes = 0;
        ArrayList<Integer> elementosVerificados = new ArrayList<>();
        
        for (int i = 0; i < lista.size(); i++) {
            int elementoAtual = lista.get(i);
            if (elementosVerificados.contains(elementoAtual)) {
            }
            
            int ocorrencias = 0;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).equals(elementoAtual)) {
                    ocorrencias++;
                }
            }
            
            if (ocorrencias > 1) {
                totalRepeticoes++;
            }
            
            elementosVerificados.add(elementoAtual); 
        }
        
        return totalRepeticoes;
    }

    //D
    public static ArrayList<Integer> listRepeat(ArrayList<Integer> lista) {
        ArrayList<Integer> elementosRepetidos = new ArrayList<>();
        ArrayList<Integer> elementosVerificados = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            int elementoAtual = lista.get(i);
            
            if (elementosVerificados.contains(elementoAtual)) {
                continue; 
            }
            
            int ocorrencias = 0;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).equals(elementoAtual)) {
                    ocorrencias++;
                }
            }
            
            if (ocorrencias > 1) {
                elementosRepetidos.add(elementoAtual);
            }
            
            elementosVerificados.add(elementoAtual); 
        }

        return elementosRepetidos;
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

    //F
    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> intList = new ArrayList<>();
        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i) == l2.get(i)) {
                    intList.add(l1.get(i));
                }
            }
        }
        return intList;
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
        System.out.println (nOcorrencias(teste, 3));
        System.out.println(hasRepeat(teste));
        System.out.println(nroRepeat(teste));
        System.out.println(listRepeat(teste));
    
        ArrayList <Integer> teste2 = new ArrayList<Integer>();
        teste2.add(4);
        teste2.add(5);
        teste2.add(6);
        teste2.add(7);
        teste2.add (8);
        System.out.println(union(teste, teste2));
        System.out.println(intersect(teste, teste2));

    }
}
