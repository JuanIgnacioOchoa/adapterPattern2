package mx.iteso.adapter.enemy.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyGiantRobotTest{
    EnemyGiantRobot robot = new EnemyGiantRobot();
    @Test
    public void smashWithHandsTest() {
        assertEquals(robot.smashWithHands(),"Enemy Robot Causes Damage With Its Hands");
    }
    @Test
    public void walkForwardTest() {
        assertEquals(robot.walkForward(),"Enemy Robot Walks Forward");
    }
    @Test
    public void reactToHumanTest() {
        String driverName = "Juan";
        assertEquals(robot.reactToHuman(driverName), "Enemy Robot Tramps on " + driverName);

    }

}
