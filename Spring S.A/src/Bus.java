import java.util.*;

public class Bus extends PublicTransportation{

// 요소
    int num;
    int fareBus;


//기능


//기본값


//생성자
    Bus() {
        this.maxPassenger = 30;
        this.fareBus = 1000;
        this.status = "운행 중";
    }

//메소드

    //버스 번호 생성
    public int getNum() {
        this.num = (int) ((Math.random()) * 9999 + 1);
        System.out.println("버스 번호판 : " + this.num);
        return this.num;
    }

    //승객 변화
    public void board(int boardPassengers) {
        System.out.println("버스에 " + boardPassengers + "명의 승객이 탑승하였습니다.");
        this.nowPassenger += boardPassengers;

        if (nowPassenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
            this.nowPassenger -= boardPassengers;
        } else {
            System.out.println("탑승 승객 수 : " + boardPassengers);
            System.out.println("잔여 승객 수 : " + (this.maxPassenger - nowPassenger));
            System.out.println("요금 : " + (this.fareBus * boardPassengers));
        }
    }

    //상태 변화
    public boolean changeStatus(boolean change) {
        System.out.println("버스의 상태가 변화하였습니다.");
        if (change == false || this.nowOil < 10) {
            status = "차고지행";
            System.out.println("상태 : " + status);
        } else {
            status = "운행 중";
            System.out.println("상태 : " + status);
        }
        return change;
    }




}

