public class UseInher {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,1);
        int r2 = obj.sub(4,1);
        int r3 = obj.multiply(4,1);
        int r4 = obj.divide(6, 3);
        double r5 = obj.exp(4,5);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " "+r5);

    }
    
}
