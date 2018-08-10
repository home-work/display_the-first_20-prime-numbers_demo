public class DisplayTheFirst20PrimeNumbersDemo {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int index = 0;
        for (int i = 2; i < 200; i++) {
            boolean check = true;
            for (int count = 2; count <= Math.sqrt(i); count++) {
                if (i % count == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                index = index + 1;
                if (index <= 20) {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}
