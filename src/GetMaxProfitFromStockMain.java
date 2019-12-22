
import java.util.Arrays;
import java.util.stream.IntStream;

public class GetMaxProfitFromStockMain {

    public static void main(String[] args) {

        int[] stockPricesYesterday = { 10, 7, 5, 8, 11, 9 };

        int maxProfit = getMaxProfit(stockPricesYesterday);
        System.out.println("maximum profit is " + maxProfit);


    }

    private static int getMaxProfit(int[] data) {

        int max = Arrays.stream(data).max().getAsInt();
        int maxIndex = IntStream.range(0, data.length).filter(i -> data[i] == max).findFirst().getAsInt();

        int min = Arrays.stream(data).min().getAsInt();
        int minIndex = IntStream.range(0, data.length).filter(i -> data[i] == min).findFirst().getAsInt();


        System.out.println("max price is (for selling) "+max +"  index is "+ maxIndex );
        System.out.println("min price is (for buying) "+min+"   index is "+minIndex);

        if ((maxIndex - minIndex) >= 1 && minIndex < maxIndex){
            return max - min;
        } else {
            int[] slicedata = IntStream
                              .range(minIndex, data.length - 1)
                              .map(i -> data[i])
                              .toArray();

           // int[] slicedata = Arrays.copyOfRange(data, minIndex, data.length - 1);
            return getMaxProfit(slicedata);
        }
    }
    }




