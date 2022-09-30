import java.util.*;

public class Bus extends PublicTransportation{

// 요소
    int nowGuest;

//기능


//기본값
    int maxGuest = 30;
    String status = "운행";
    int cash = 1000;

//생성자
    Bus(int num, int nowGuest) {
        this.nowGuest = nowGuest;
    }

}
