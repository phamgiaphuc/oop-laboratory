package org.example.midterm.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Road {
    Random random = new Random();
    private final int length = 15;
    private final int width = 2;
    public final String[] directionList = {"WestToEast", "EastToWest", "SouthToNorth", "NorthToSouth"};
    private final int[][] road = new int[width][length];
    private final List<Vehicle> vehicles = new ArrayList<>();

    public Road() {
        roadInitialization();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        generateVehiclePosition(vehicle);
        System.out.println(vehicle.getBrandName() + " is added to the road");
    }

    public void generateVehiclePosition(Vehicle vehicle) {
        int x = 0, y = 0;
        String vehicle_type = vehicle.getClass().getSimpleName().toLowerCase();
        if (vehicle_type.equals("car")) {
            while(true) {
                x = random.nextInt(14);
                if (road[y][x] == 0 && road[y][x + 1] == 0 && road[y + 1][x] == 0 && road[y + 1][x + 1] == 0) {
                    vehicle.setPosition(new int[][]{
                            {y, x},
                            {y, x + 1},
                            {y + 1, x},
                            {y + 1, x + 1}
                    });
                    setVehicleOnTheRoad(vehicle.getPosition(), vehicle.getNum());
                    break;
                }
            }
        } else if (vehicle_type.equals("motorbike")) {
            while(true) {
                x = random.nextInt(14);
                y = random.nextInt(2);
                if (road[y][x] == 0 && road[y][x + 1] == 0) {
                    vehicle.setPosition(new int[][]{
                            {y, x},
                            {y, x + 1},
                    });
                    setVehicleOnTheRoad(vehicle.getPosition(), vehicle.getNum());
                    break;
                }
            }
        } else {
            while(true) {
                x = random.nextInt(15);
                y = random.nextInt(2);
                if (road[y][x] == 0) {
                    vehicle.setPosition(new int[][]{
                            {y, x},
                    });
                    setVehicleOnTheRoad(vehicle.getPosition(), vehicle.getNum());
                    break;
                }
            }
        }
    }

    public void movement() {
        int num = random.nextInt(4);
        int move = (directionList[num].equals("WestToEast") || directionList[num].equals("SouthToNorth")) ? 1 : -1;
        System.out.println(move);
        checkVehiclePosition(move);
        for (Vehicle vehicle : vehicles) {
            for (int[] position : vehicle.getPosition()) {
                road[position[0]][position[1]] = 0;
                position[1] += move;
            }
        }
        for (Vehicle vehicle : vehicles) {
            setVehicleOnTheRoad(vehicle.getPosition(), vehicle.getNum());
        }
    }

    public void checkVehiclePosition(int move) {
        if (move == 1) {
            for (int i = 0; i < vehicles.size(); i++) {
                int[][] positions = vehicles.get(i).getPosition();
                int lastIndex = positions.length - 1;
                if (positions[lastIndex][1] == length - 1) {
                    resetVehiclePosition(vehicles.get(i));
                }
            }
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                int[][] positions = vehicles.get(i).getPosition();
                if (positions[0][1] == 0) {
                    resetVehiclePosition(vehicles.get(i));
                }
            }
        }
    }

    private void resetVehiclePosition(Vehicle vehicle) {
        int[][] positions = vehicle.getPosition();
        vehicles.remove(vehicle);
        System.out.println(vehicle.getBrandName() + " is off on the road");
        setVehicleOnTheRoad(positions, 0);
    }


    public void setVehicleOnTheRoad(int[][] positions, int num) {
        for (int[] position : positions) {
            road[position[0]][position[1]] = num;
        }
    }

    public void roadInitialization() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                road[i][j] = 0;
            }
        }
    }

    public void showRoad() {
        System.out.println("----------The road-----------");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(road[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
