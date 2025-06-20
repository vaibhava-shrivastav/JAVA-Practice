public class quicksort {
    public static void sort(int[] n){
        int j=n.length-1;
        int i=0;
        while(i<j){
            if(n[i+1]<n[i]){
                int temp=n[i];
                n[i]=n[i+1];
                n[i+1]=temp;
            }
            if(n[j]<n[j-1]){
                int temp=n[j];
                n[j]=n[j-1];
                n[j-1]=temp;
            }
            i++;
            j--;

        }
    }
    public static void main(String[] args){
        quicksort sortedarry= new quicksort();
        int[] arr={4,3,5,1,2,6,84,5,2};
        int i=0;
        while(arr[i+1]-arr[i]!=1){
            sortedarry.sort(arr);
            i++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
