import java.util.Arrays;
public class Quick{
  //swap function swaps elements at too indicies
  private static void swap(int[] ary, int x1, int x2){
    int a = ary[x1];
    int b = ary[x2];
    ary[x1]=b;
    ary[x2]=a;
  }
  //just made dutch partition rather than other partitioning will do anyway;
  private static int[] partition(int[] ary, int lo, int hi){
    int pivot = ary[(hi-lo)/2];
    System.out.println(pivot);
    int bottom = lo;
    int top = hi;
    while(lo<=hi){
      if(ary[lo]<pivot){lo++;}
      else{swap(ary,lo,hi);hi-=1;}
      System.out.println(Arrays.toString(ary));
    }
    hi++;
    while(hi<top){
      if(ary[hi]==pivot){hi++;}
      else{swap(ary,hi,top);top-=1;}
      System.out.println(Arrays.toString(ary));
    }
    int[] tbr = new int[]{lo-1,top+1};
    return tbr;
  }
  /*public static void quicksort(int[] data){
    quicksortH(data,0,data.length-1);
  }
  private static void quicksortH(int[] data, int lo, int hi){
    if(lo>=hi)return;
    int pivot = partition(data,lo,hi);
    quicksortH(data,lo,pivot-1);
    quicksortH(data,pivot+1,hi);
  }*/
  public static void main(String[]args){
    int[] test = new int[]{5,5,3,2,1,8,9,6,34,1,5,3,4};
    int[] test1 = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
    System.out.println(Arrays.toString(test));
    System.out.println(Arrays.toString(test1));
    int[] r = partition(test,0,test.length-1);
    System.out.println(Arrays.toString(r)+Arrays.toString(test));
    //quicksort(test);
    //System.out.println(Arrays.toString(test));
  }
}
