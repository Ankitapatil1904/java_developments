class TribonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;  
        System.out.print("Tribonacci series up to 1000: " + a + ", " + b + ", " + c);

        while (true) {
            int next = a + b + c;  
            if (next > 1000) break; 
            System.out.print(", " + next);
            a = b;  
            b = c;  
            c = next;  
        }
    }
}
