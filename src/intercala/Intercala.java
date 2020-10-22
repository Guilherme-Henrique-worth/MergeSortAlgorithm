package intercala;

public class Intercala {
    public static void intercala(int X[],int inicio,int fim,int meio){
        int poslivre;
        int inicio_vetor1;
        int inicio_vetor2;
        int i;
        int aux[] = new int[10];
        inicio_vetor1= inicio;
        inicio_vetor2= meio + 1;
        poslivre= inicio;
        while(inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            if (X[inicio_vetor1] <= X[inicio_vetor2]) {
                aux[poslivre] = X[inicio_vetor1];
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
                aux[poslivre] = X[inicio_vetor2];
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }
            for (i=inicio_vetor1;i<=meio;i++){
                aux[poslivre] = X[i];
                poslivre = poslivre +1;
            }
            for(i=inicio_vetor2;i<=fim;i++){
                aux[poslivre] = X[i];
                poslivre = poslivre +1;
            }
            for(i=inicio;i<=fim;i++){
                X[i] = aux[i];
            }
    }
}
