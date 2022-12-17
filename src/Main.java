public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{1,5,2,3,9,4,2};
        //printTab(bobbleSort(tab));
        //printTab(insertionSort(tab));
        System.out.println(silnia(26));
    }

    private static void printTab(int[] tab){
        for(int elem: tab){
            System.out.print(elem+" ");
        }
    }

    private static int[] bobbleSort(int[] tab){
       for(int i=0; i<tab.length-1; i++){
           boolean swapped = false;
           for(int j=0; j< tab.length-1-i; j++){
               if(tab[j] > tab[j+1]){
                   swapped = true;
                   int temp = tab[j+1];
                   tab[j+1] = tab[j];
                   tab[j] = temp;
               }
           }
           if(!swapped) return tab;
       }
        return  tab;
    }

    private static int[] insertionSort(int[] tab){
        for(int i=1; i<tab.length; i++){
            int temp = tab[i];
            int j;
            for(j=i-1; j>=0 && tab[j] > temp; j--){
                tab[j+1] = tab[j];
            }
            tab[j+1] = temp;

        }

        return tab;
    }

    private static long silnia(int n){
        if(n==0) return 1L;
        return silnia(n-1)*n;
    }

    private static long fibo(int n){
        if(n <= 2) return 1;
        return fibo(n-2)+fibo(n-1);
    }
}