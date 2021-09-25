
public class Main {

    public static void main(String[] args) {
        BonusServiceOne service = new BonusServiceOne();

        long amount = 1000_60;
        boolean registered = true;

        long bonus = service.calculate(amount, registered);

        System.out.println(bonus);

    }
}
