package mx.iteso.adapter.enemy.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTankTest {

    EnemyTank tank = new EnemyTank();
    @Test
    public void fireWeaponTest() {
        assertEquals(tank.fireWeapon(), "Enemy tank fires weapon");
    }
    @Test
    public void driveForwardTest() {
        assertEquals(tank.driveForward(), "Enemy Tank moves forward");

    }
    @Test
    public void assignDriverTest() {
        String driverName = "Jaime";
        assertEquals(tank.assignDriver(driverName),driverName + " is driving the tank");
    }

}
