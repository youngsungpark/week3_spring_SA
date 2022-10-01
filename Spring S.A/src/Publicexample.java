public class Publicexample {
    public static void main(String[] args) {

//        //버스 2대 생성
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//
//        bus1.getNum();
//        bus1.info();
//        System.out.println();
//        bus2.getNum();
//        bus2.info();
//        System.out.println();
//
//        bus1.board(2);
//        System.out.println();
//
//        bus1.setNowOil(-50);
//        System.out.println();
//
//        bus1.changeStatus(false);
//        System.out.println();
//
//        bus1.setNowOil(10);
//        System.out.println();
//
//        bus1.changeStatus(true);
//        System.out.println();
//
//        bus1.board(45);
//        System.out.println();
//
//        bus1.board(5);
//        System.out.println();
//
//        bus1.setNowOil(-55);
//        System.out.println();
//
//        bus1.info();

        //택시 2대 생성
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        taxi1.getTaxiNum();
        taxi1.info();
        System.out.println();
        taxi2.getTaxiNum();
        taxi2.info();
        System.out.println();

        taxi1.board(2);
        System.out.println();

        taxi1.setDestination("서울역", 2);
        System.out.println();

        taxi1.setNowOil(-80);
        System.out.println();

        taxi1.board(5);
        System.out.println();

        taxi1.board(3);
        taxi1.setDestination("구로디지털단지역", 12);
        System.out.println();

        taxi1.setNowOil(-20);
        System.out.println();

    }
}
