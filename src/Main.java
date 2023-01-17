public class Main {
    public static void main(String[] args) {
        /*
        Definire un programma per determinare i costi di servizio legati alla riscossione di assegni.
        il costo del servizio dipende dall'ammontare degli assegni:
        se è <=10 il costo è di 1euro
        se è >10 ma <=100euro il costo del servizio è pari a 10% dell'importo
        se è >100 ma <=1000 il costo è pari a 5euro piu il 5% dell'importo
        se è >1000 il costo è pari a 40 euro piu l'1% dell'importo
        scrivere un codice che permetta di computare questa cifra tramite un'istruzione if else multiramo
         */
        System.out.println("determinare i costi di servizio per la riscossione degli assegni");

        int ammontareAssegno=20;
        int costoServizio=0;

        if (ammontareAssegno<=10){
            costoServizio=1;
        }
        else if (ammontareAssegno>10 && ammontareAssegno<=100){
            costoServizio=(ammontareAssegno*10)/100;
        }
        else if (ammontareAssegno>100 && ammontareAssegno<=1000){
            costoServizio=5+((ammontareAssegno*5)/100);
        }
        else if (ammontareAssegno>1000){
            costoServizio=40+((ammontareAssegno*1)/100);
        }
        System.out.println("il costo del servizio è:" +costoServizio);
    }
}