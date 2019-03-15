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
    //System.out.println(pivot);
    int bottom = lo;
    int top = hi;
    //partition normally, splits into hi and low
    while(lo<=hi){
      if(ary[lo]<pivot){lo++;}
      else{swap(ary,lo,hi);hi-=1;}
    //  System.out.println(Arrays.toString(ary));
    }
    hi++;
    //partition but the other half depending whether equal or not equal to pivot!
    while(hi<top){
      if(ary[hi]==pivot){hi++;}
      else{swap(ary,hi,top);top-=1;}
      //System.out.println(Arrays.toString(ary));
    }
    int[] tbr = new int[]{lo-1,top+1};
    return tbr;
  }
  public static void quicksort(int[] data){
    quicksortH(data,0,data.length-1);
  }
  private static void quicksortH(int[] data, int lo, int hi){
    if(lo>=hi)return;
    int[] pivot = partition(data,lo,hi);
    quicksortH(data,lo,pivot[0]);
    quicksortH(data,pivot[1],hi);
  }
  public static void main(String[]args){
    int[] test = new int[]{5,5,3,2,1,8,9,6,34,1,5,3,4,468,625,12,32,3};
    //int[] test1 = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
    System.out.println(Arrays.toString(test));
    //System.out.println(Arrays.toString(test1));
    //int[] r = partition(test,0,test.length-1);
    //System.out.println(Arrays.toString(r)+Arrays.toString(test));
    quicksort(test);
    System.out.println(Arrays.toString(test));
  }
  /*public static void main(String[]args){
  System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
  int[]MAX_LIST = {1000000000,500,10};
  for(int MAX : MAX_LIST){
    for(int size = 31250; size < 2000001; size*=2){
      long qtime=0;
      long btime=0;
      //average of 5 sorts.
      for(int trial = 0 ; trial <=5; trial++){
        int []data1 = new int[size];
        int []data2 = new int[size];
        for(int i = 0; i < data1.length; i++){
          data1[i] = (int)(Math.random()*MAX);
          data2[i] = data1[i];
        }
        long t1,t2;
        t1 = System.currentTimeMillis();
        Quick.quicksort(data2);
        t2 = System.currentTimeMillis();
        qtime += t2 - t1;
        t1 = System.currentTimeMillis();
        Arrays.sort(data1);
        t2 = System.currentTimeMillis();
        btime+= t2 - t1;
        if(!Arrays.equals(data1,data2)){
          System.out.println("FAIL TO SORT!");
          System.exit(0);
        }
      }
      System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
    }
    System.out.println();
  }
}**/
}
