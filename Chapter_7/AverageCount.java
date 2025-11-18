public class AverageCount {
    
    public static int countElementsGreaterThanAverage(int[] elem) {

        int count = 0;
        double sum = elem[0];
        
        for (int i = 1; i < elem.length; i++) {
            double average = sum / i;
            
            if (elem[i] > average) {
                count++;
            }
            
            sum += elem[i];
        }
        
        return count;
    }
    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};
        
        int result = countElementsGreaterThanAverage(responseTimes);
        
        System.out.println("Input: [100, 200, 150, 300]");
        System.out.println("Output: " + result);
        
    }
}
