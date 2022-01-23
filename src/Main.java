public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}


//        int ticketPrice = 3000;
//        int moneyForBonusMile = 20 * 1;
//
//        int bonusMile = ticketPrice / moneyForBonusMile ;
//
//        System.out.println("Количество бонусных милей за покупку билета - " );
//        System.out.println((bonusMile));
//
//        int receivedBonus = 150;
//    }


