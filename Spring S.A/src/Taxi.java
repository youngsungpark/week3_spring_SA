import java.util.*;

public class Taxi extends PublicTransportation{

// 요소
    String destination;
    int distanceToDestination;
    int standardDisdance = 1;
    int standardCash = 3000;
    int cashPerDistance = 1000;

//기능

    int finalCash;


//기본값
    int maxGuest = 4;
    int oil = 100;
    String status = "일반";
    int speed = 0;


//생성자
    Taxi(int num, int oil, String status) {
        this.num = num;
        this.oil = oil;
        this.status = status;
    }

    Taxi(int customorcnt, int maxGuest){
        this.customorcnt = customorcnt;
        this.maxGuest = maxGuest;
    }

}
