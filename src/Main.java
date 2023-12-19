public class Main {
    public static void main(String[] args) {
        Phone a = new Phone("Apple" , "897897" , 90);
        Phone b = new Phone("Apple" , "897897" , 90);
        Phone c = new Phone("Apple" , "897897" , 90);

        System.out.println(a.number + " " + a.model + " " + a.weight);
        System.out.println(b.number + " " + b.model + " " + b.weight);
        System.out.println(c.number + " " + c.model + " " + c.weight);


        a.receiveCal("ALikhan");

        System.out.println(a.getNumber());

        Phone q = new Phone("Samsung" , "897979");

        a.receiveCal("ALIKHAN" , "8979867857");

        a.sendMessage("784395743" , "u34895739" , "89038");






    }
}
