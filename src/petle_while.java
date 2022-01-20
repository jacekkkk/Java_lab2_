public class petle_while {

        public static void main(String[] args) {

            /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
/*
        {
    int i = 1000;
        i = 1000;
        System.out.println("\n");
        do {
            System.out.print("\nLiczba: " + i);
            if (i % 61 == 0) {
                System.out.println(" jest podzielna przez 61");
            }
        } while (--i > 0);
    }
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
/* a)
        int[] tab1 = {3, 8, 25, 73, 12};
        int i = 0;
        while (i < 5) {
            System.out.println("i " + i + ": " + tab1[i]);
            ++i;
        }*/

        /* b)
        {
            double[] tab2 = {1.15, 5.95, 10.25, 14.154, 55.874};
            int j = 0;
            while (j < 5) {
                System.out.println("i " + j + ": " + tab2[j]);
                ++j;
            }*/

            /* c)
            {
                String[] tab3 = {"Sklep", "Piwo", "Spacer", "Dom", "Sen"};
                int j = 0;
                while (j < 5) {
                    System.out.println("i " + j + ": " + tab3[j]);
                    ++j;
                }*/


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
      /*  while (true) {
            System.out.println("SPAM");
        }*/

       /* while (false) {
            System.out.println("NIC");
        }*/
                
                
        /* ćw.2 pętle for 

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
                
//        for (int i = 100; i >= 0; i--) {
//            System.out.print("\nliczba: " + i);
                
//            if (i % 1 == 0) {
                
//                System.out.print(" - podzielna przez 1");
//            }
//        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


        Scanner in = new Scanner(System.in);
                
        System.out.println("\nPodaj pięć liczb.");
                
        int[] liczba = new int[5];
        for(int i=0;i<5;i++){
                
            liczba[i] = in.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(liczba[i]);
        }
        for (int x : liczba) {
            System.out.println(x + 11);
                
                
                  /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

//        int a;
//        Scanner scan = new Scanner(System.in);
                
//        System.out.print("Podaj liczbe.");
                
//        a = scan.nextInt();
                
//        switch (a % 2) {
//            case 1:
                
//                System.out.println("Liczba jest nieparzysta");
//                break;
                
//            default:
                
//                System.out.println("Liczba jest parzysta");
//
//        }
//        int a;
                
//        int b = 7;
                
//        Scanner scan = new Scanner(System.in);
                
//        System.out.print("\nPodaj liczbe:");
                
//        a = scan.nextInt();
                
//        switch (a / b) {
//            case 2:
                
//                System.out.println("Liczba jest podzielna przez 7");
//                break;
                
//            default:
                
//                System.out.println("liczba jest nie podzielna przez 7");
//                break;



        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
                
        int[] tablica = {0, 0, 0, 0, 0};
                
        /* toCharArray() - metoda zamienia String na tablicę char[] */
                
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3], tablica[4]);
        }
                
                  /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
                
      for (int i = 0; i <= 50; i++) {
              
           if (i % 2 == 0)
                   
               continue;
              
           System.out.print(i + " ");
       }

       for (int i = 0; i <= 300; i++) {
               
           if (i == 85)
                   
              break;
               
           System.out.print(i + " ");
       }
        for (int i = 0; i <= 33; i++) {
                
            if (i == 33)
                    
                return;
                
            System.out.print(i + " ");
                
                
                
        }
                
                
                
                  ćw_6 Listy

        public static void main(String[]args) {
            System.out.println("Wpisz 10 liczb");
            Scanner in = new Scanner(System.in);
            Set<Integer>number = new TreeSet<>();

            for (int i = 0; i < 10; i++) {
                int numbers = in.nextInt();
                number.add(numbers);
            }


            System.out.println("Liczby: " + number);
            metod(number);
        }
    public static void metod (Set <Integer> number) {
            
        int i = 0;
            
        for (Integer x : number) {
                
            System.out.println("liczba " + (i + 1) + ":" + x);
            i++;



        }
    }

