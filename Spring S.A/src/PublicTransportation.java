import java.util.*;

public class PublicTransportation {
//  요소
    int nowOil = 100;
    int nowSpeed = 0;
    int maxPassenger;

//  기능
    String startDrive;
    String status;
    int nowPassenger;

//  기본값


// 메소드



    //정보 확인
    public void info() {
        System.out.println("상태 : " + status);
        System.out.println("주유량 : " + this.nowOil);
        if (this.nowOil < 10) {
            System.out.println("주유 필요");
        }
    }

    //버스 상태 변화
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

    //택시 상태 변화
    public boolean changeStatusTaxi(boolean change) {
        System.out.println("택시의 상태가 변화하였습니다.");
        if (change == false || this.nowOil < 10) {
            status = "운행불가";
            System.out.println("상태 : " + status);
        } else {
            status = "운행 중";
            System.out.println("상태 : " + status);
        }
        return change;
    }

    // 오일 변화
    public void setNowOil(int useoil) {
        System.out.println("주유량이 " + useoil + "만큼 변화하였습니다.");
        this.nowOil += useoil;
        if (nowOil < 10) {
            changeStatus(false);
        }
        System.out.println("주유량 : " + this.nowOil);
    }

    // 속도 변화
    public int getNowSpeed(int pushspeed) {
        if (nowOil >= 10) {
            this.status = "운행 중";
            this.nowSpeed += pushspeed;
        } else {
            changeStatus(false);
        }
        return nowSpeed;
    }



}

