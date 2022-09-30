public class Publicexample {
    public static void main(String[] args) {

// Taxi 1번
        Taxi taxiCase1 = new Taxi(1111, 70, "일반");
        Taxi taxiCase2 = new Taxi(1234, 100, "일반");

        System.out.println("taxi1 번호: " + taxiCase1.num);
        System.out.println("taxi1 주유량: " + taxiCase1.oil);
        System.out.println("taxi1 상태: " + taxiCase1.status);

        System.out.println();

        System.out.println("taxi2 번호: " + taxiCase2.num);
        System.out.println("taxi2 주유량: " + taxiCase2.oil);
        System.out.println("taxi2 상태: " + taxiCase2.status);

// Taxi 1번

        Taxi taxiCase3 = new Taxi(2, 4);

        System.out.println("taxi3 탑승 승객 수: " + taxiCase3.customorcnt);

        = taxiCase3.customorcnt - taxiCase3.maxGuest;
        System.out.println("taxi3 잔여 승객 수: " + );



    }
}
