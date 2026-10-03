// 1B if-else
class Javahack{
    public static void main(String[] args){
        int n=5;
        double W=100.5;
        int Hn =123;
        char ws='A';
        System.out.println("Number of family members: "+n);
        System.out.println("Consumed in liters: "+W);
        System.out.println("House number: "+Hn);
        System.out.println("Water usage status: "+ws);
        if(W<=500){
            System.out.println("the water bill is 100 RUPEES");
        }
         if (W>500){
            System.out.println("the water bill is 200 RUPEES");
        }
    }
}