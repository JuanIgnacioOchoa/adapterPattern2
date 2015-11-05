package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public String smashWithHands() {
        System.out.println("Enemy Robot Causes Damage With Its Hands");
        return "Enemy Robot Causes Damage With Its Hands";
    }

    public String walkForward() {
        System.out.println("Enemy Robot Walks Forward");
        return "Enemy Robot Walks Forward";
    }

    public String reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
        return "Enemy Robot Tramps on " + driverName;
    }

}
