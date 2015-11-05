package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public String fireWeapon() {
        System.out.println("Enemy tank fires weapon");
        return "Enemy tank fires weapon";
    }

    public String driveForward() {
        System.out.println("Enemy Tank moves forward");
        return "Enemy Tank moves forward";
     }

    public String assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
        return driverName + " is driving the tank";
    }

}
