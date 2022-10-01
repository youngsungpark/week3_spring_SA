import java.util.*;

public class Taxi extends PublicTransportation{

// 요소
    String destination;
    int distanceToDestination;
    int standardDisdance = 1;
    int basicFare = 3000;
    int farePerDistance = 1000;
    int taxiNum;

//기능

    int totalFare;


//기본값
    int maxPassenger = 4;
    int oil = 100;
    int speed = 0;

//생성자
    Taxi() {
        this.maxPassenger = 4;
        this.status = "일반";
    }


//메소드
    //택시 번호 생성
    public int getTaxiNum() {
        this.taxiNum = (int) ((Math.random()) * 9999 + 1);
        System.out.println("택시 번호판 : " + this.taxiNum);
        return this.taxiNum;
    }

    //승객 변화
    public void board(int boardPassengers) {
        this.nowPassenger += boardPassengers;

        if (nowPassenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
            this.nowPassenger -= boardPassengers;
        }
        else {
            System.out.println("탑승 승객 수 : " + boardPassengers);
            System.out.println("잔여 승객 수 : " + (this.maxPassenger - boardPassengers));
            System.out.println("기본 요금 : " + (this.basicFare ));
            changeStatusTaxi(true);
        }


    }

    // 목적지 선정
    public void setDestination(String destination, int distanceToDestination) {
        System.out.println("목적지 : " + destination);
        System.out.println("목적지까지의 거리 : " + distanceToDestination);

        getTotalFare();
    }

    // 요금 지불
    public int getTotalFare() {
        this.totalFare = basicFare + farePerDistance * (this.distanceToDestination - 1);
        System.out.println("지불할 요금 : " + this.totalFare);
        return this.totalFare;
    }


}
