package mx.iteso.adapter.enemy;

// The Adapter must provide an alternative action for
// the methods that need to be used because
// EnemyAttacker was implemented.

// This adapter does this by containing an object
// of the same type as the Adaptee (EnemyRobot)
// All calls to EnemyAttacker methods are sent
// instead to methods used by EnemyRobot

import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EnemyRobotAdapterTest{
    EnemyAttacker enemyRobot;
    EnemyGiantRobot giantRobot;
    @Before
    public void setUp(){
        giantRobot = mock(EnemyGiantRobot.class);
        enemyRobot = new EnemyRobotAdapter(giantRobot);
    }
    @Test
    public void fireWeaponTest() {
        when(giantRobot.smashWithHands()).thenReturn("Enemy Robot Causes Damage With Its Hands");
        assertEquals(enemyRobot.fireWeapon(), "Enemy Robot Causes Damage With Its Hands" );
    }
    @Test
    public void driveForwardTest() {
        when(giantRobot.walkForward()).thenReturn("Enemy Robot Walks Forward");
        assertEquals(enemyRobot.driveForward(), "Enemy Robot Walks Forward");

    }
    @Test
    public void assignDriverTest() {
        String driverName = "Juan";
        when(giantRobot.reactToHuman(driverName)).thenReturn("Enemy Robot Tramps on " + driverName);
        assertEquals(enemyRobot.assignDriver(driverName), "Enemy Robot Tramps on " + driverName);
    }

}
