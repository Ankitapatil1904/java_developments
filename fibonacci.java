class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;  
        System.out.print("Fibonacci series up to 500: " + a); 

        while (b <= 500) {
            System.out.print(", " + b); 
            int next = a + b; 
            a=b;
            b = next;  
        }
    }
}
