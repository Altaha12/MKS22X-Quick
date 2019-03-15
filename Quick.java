import java.util.Arrays;
public class Quick{
  //swap function swaps elements at too indicies
  private static void swap(int[] ary, int x1, int x2){
    int a = ary[x1];
    int b = ary[x2];
    ary[x1]=b;
    ary[x2]=a;
  }
  private static int partition(int[] ary, int lo, int hi){
    int pivot = (hi-lo)/2;
    swap(ary,pivot,lo);
    pivot=lo;
    lo+=1;
    while(lo<hi){
      if(ary[lo]<=ary[pivot])lo+=1;
      if(ary[lo]>ary[pivot]){
        swap(ary,lo,hi);
        hi-=1;}
    }
    swap(ary,pivot,lo);
    return lo;
  }
  public static void quicksort(int[] data){
    quicksortH(data,0,data.length-1);
  }
  private static void quicksortH(int[] data, int lo, int hi){
    if(lo>=hi)return;
    int pivot = partition(data,lo,hi);
    quicksortH(data,lo,pivot-1);
    quicksortH(data,pivot+1,hi);
  }
  public static void main(String[]args){
    int[] test = new int[]{5,5,3,2,1,8,9,6,34,1,5,3,4};
    System.out.println(Arrays.toString(test));
    //int r = partition(test,0,test.length-1);
    //System.out.println(r+Arrays.toString(test));
    quicksort(test);
    System.out.println(Arrays.toString(test));
  }
}