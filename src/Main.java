//public class Main {
//    public static void main(String[] args) {
//
//        BonusMilesService service = new BonusMilesService();
//        int miles = service.calculate(10000, 20);
//        System.out.println(miles + " бонусных миль");
//
//    }
//}
public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles + " бонусных миль");

    }
}
