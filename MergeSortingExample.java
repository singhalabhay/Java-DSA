public class MergeSortingExample {
    int[] array;
    int[] temparray;
    int length;
    public static void main(String[] args) {
       int[] inputArr={48,36,13,52,94,21};
        MergeSortingExample ms=new MergeSortingExample();
        ms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i+"" +
                    ",");
        }

    }

    public  void sort(int[] inputarr){
        this.array=inputarr;
        this.length=inputarr.length;
        this.temparray=new int[length];
DivideArray(0,length-1);
    }
  public  void DivideArray(int lowerindex,int higerIndex) {
      if (lowerindex < higerIndex) {

          int middle = lowerindex + (higerIndex - lowerindex) / 2;
          // sort the left index
          DivideArray(lowerindex, middle);
          // sort higher index
          DivideArray(middle + 1, higerIndex);
          MergeArray(lowerindex,middle,higerIndex);
      }
  }
  public   void MergeArray(int loweindex,int middle,int higerIndex){
        for(int i=loweindex;i<=higerIndex;i++){
            temparray[i]=array[i];
        }
        int i=loweindex;
        int j=middle+1;
        int k=loweindex;
        while (i<=loweindex && j<=higerIndex){
            if(temparray[i]<=temparray[j]){
                array[k]=temparray[i];
                i++;
            }else{
array[k]=temparray[j];
j++;

            }
            k++;

        }
        while ( i<=middle){
            array[k]=temparray[i];
            k++;
            i++;
        }

    }

}


