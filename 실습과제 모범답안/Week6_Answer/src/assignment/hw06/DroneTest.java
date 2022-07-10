package assignment.hw06;

import java.util.Scanner;

import assignment.hw06.drone.Drone;
import assignment.hw06.drone.DroneManager;
import assignment.hw06.drone.GlobalHawk;
import assignment.hw06.drone.Point;
import assignment.hw06.drone.Predator;
import assignment.hw06.drone.Quadrotor;

import static assignment.hw06.drone.DroneUtil.getMostClosestTargetDrone;
import static assignment.hw06.drone.DroneUtil.calculateDistance;
import static assignment.hw06.drone.DroneUtil.isOverlap;

public class DroneTest {
    static Scanner scan = new Scanner(System.in);
    static DroneManager droneManager = new DroneManager();

    public static void main(String[] args) {

        boolean programFlag = true;
        while (programFlag) {
            System.out.println("1. 드론 추가");
            System.out.println("2. 드론 삭제");
            System.out.println("3. 드론 위치 변경");
            System.out.println("4. 드론 조회");
            System.out.println("5. 타겟 지정");
            System.out.println("6. 타겟과 가장 가까운 드론 검색");
            System.out.println("7. 드론 상호 조회");
            System.out.println("8. 프로그램 종료");
            System.out.print("선택: ");

            switch (scan.nextInt()) {
                case 1:
                    addDrone();
                    break;

                case 2:
                    removeDrone();
                    break;

                case 3:
                    changePosition();
                    break;

                case 4:
                    searchDrone();
                    break;

                case 5:
                    setTarget();
                    break;

                case 6:
                    closestDrone();
                    break;

                case 7:
                    droneCrossSearch();
                    break;

                case 8:
                    programFlag = false;
                    break;

                default:
                    System.out.println("다시 입력해 주세요");
                    break;
            }
            System.out.println();
        }
    }

    /**
     * Drone 추가 기능
     */
    public static void addDrone() {
        System.out.print("\ndrone type: ");
        String droneType = scan.next();

        System.out.print("drone code: ");
        String droneCode = scan.next();

        System.out.print("position x: ");
        int x = scan.nextInt();
        System.out.print("position y: ");
        int y = scan.nextInt();

        System.out.print("search range: ");
        int searchRange = scan.nextInt();

        System.out.print("movable distance: ");
        int movableDistance = scan.nextInt();

        Drone droneInstance = null;

        switch (droneType) {
            case "default":
                droneInstance = new Drone(new Point(x, y), droneCode, searchRange, movableDistance);
                break;

            case "GlobalHawk":
                droneInstance = new GlobalHawk(new Point(x, y), droneCode, searchRange, movableDistance);
                break;

            case "Predator":
                droneInstance = new Predator(new Point(x, y), droneCode, searchRange, movableDistance);
                break;

            case "Quadrotor":
                droneInstance = new Quadrotor(new Point(x, y), droneCode, searchRange, movableDistance);
                break;

            default:
                break;
        }

        droneManager.addDrone(droneInstance);
    }

    /**
     * Drone 삭제 기능
     */
    public static void removeDrone() {
        System.out.print("\ndrone code: ");
        String droneCode = scan.next();

        droneManager.removeDrone(droneCode);
    }

    /**
     * Drone 위치 변경 기능
     */
    public static void changePosition() {
        System.out.print("\ndrone code: ");
        String droneCode = scan.next();

        System.out.print("position x: ");
        int x = scan.nextInt();
        System.out.print("position y: ");
        int y = scan.nextInt();

        if (droneManager.getDrone(droneCode).setPosition(x, y)) {
            System.out.println("정상적으로 이동하였습니다.");
        } else {
            System.out.println("거리가 너무 멀어서 이동할 수 없습니다.");
        }
    }

    /**
     * Drone 조회 기능
     */
    public static void searchDrone() {
        System.out.println();

        for (Drone drone : droneManager.getDroneList()) {
            System.out.println(drone);
        }
    }

    /**
     * 타겟 지정 기능
     */
    public static void setTarget() {
        System.out.print("\nposition x: ");
        int x = scan.nextInt();
        System.out.print("position y: ");
        int y = scan.nextInt();

        droneManager.setTarget(x, y);
    }

    /**
     * 타겟 최근접 drone 조회 기능
     */
    public static void closestDrone() {
        System.out.println();

        Drone closest = getMostClosestTargetDrone(droneManager.getDroneList());
        System.out.println(closest);
        System.out.printf("distance: %.3f\n", calculateDistance(closest.getPosition(), Drone.target));
    }

    /**
     * Drone 상호검색 기능
     */
    public static void droneCrossSearch() {
        System.out.print("\nFirst drone code: ");
        Drone drone1 = droneManager.getDrone(scan.next());

        System.out.print("\nSecond drone code: ");
        Drone drone2 = droneManager.getDrone(scan.next());

        double distance = calculateDistance(drone1, drone2);
        boolean isOverlap = isOverlap(drone1, drone2);

        System.out.printf("distance: %.3f    Both %s overlap\n", distance, isOverlap ? "are" : "are not");
    }
}
