public class Main {
    public static void main(String[] args) {
        Phone a = new Phone("Apple" , "897897" , 90);
        Phone b = new Phone("Apple" , "897897" , 90);
        Phone c = new Phone("Apple" , "897897" , 90);

        System.out.println(a.getNumber() + " " + a.getModel() + " " + a.getWeight());
        System.out.println(b.getNumber() + " " + b.getModel() + " " + b.getWeight());
        System.out.println(c.getNumber() + " " + c.getModel() + " " + c.getWeight());


        a.receiveCall("ALikhan");

        System.out.println(a.getNumber());

        Phone q = new Phone("Samsung" , "897979");

        a.receiveCall("ALIKHAN" , "8979867857");

        a.sendMessage("784395743" , "u34895739" , "89038");






    }
}
