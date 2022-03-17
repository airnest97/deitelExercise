package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television samsung;
    @BeforeEach
    public void startsWith(){
     samsung = new Television();
    }

    @Test
        public void turnOnTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
    }

    @Test
    public void turnOffTest(){
        samsung.powerStatus();
        samsung.powerStatus();
        assertFalse(samsung.isOn());
    }

    @Test
    public void setChannelTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.setChannel(32);
        assertEquals(32, samsung.getChannel());
    }

    @Test
    public void programUpButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.setChannel(50);
        samsung.programUp();
        assertEquals(50, samsung.getChannel());
    }

    @Test
    public void programDownButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.setChannel(25);
        samsung.programDown();
        assertEquals(24, samsung.getChannel());
    }

    @Test
    public void volumeUpButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        int volume = 0;
        while(volume < 6){
            samsung.volumeUp();
            volume++;
        }
        assertEquals(6, samsung.getVolume());
    }

    @Test
    public void volumeDownButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        int volume = 1;
        while(volume <= 6){
            samsung.volumeUp();
            volume++;
        }
        for(int i = 0; i < 2; i++){
            samsung.volumeDown();
        }
        assertEquals(4, samsung.getVolume());
    }

    @Test
    public void TvModeTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        samsung.inputMode();
        assertEquals("AV2", samsung.getInputMode());
    }

    @Test
    public void muteButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.mute();
        assertTrue(samsung.isMute());
        assertEquals(0, samsung.getVolume());
    }

  @Test
    public void unMuteButtonTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.mute();
        samsung.mute();
        assertFalse(samsung.isMute());
        assertEquals(5, samsung.getVolume());
    }

    @Test
    public void volumeUpUnmuteTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.mute();
        assertTrue(samsung.isMute());
        samsung.volumeUp();
        assertFalse(samsung.isMute());
        assertEquals(5, samsung.getVolume());
    }

    @Test
    public void volumeDownUnmuteTest(){
        samsung.powerStatus();
        assertTrue(samsung.isOn());
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.mute();
        assertTrue(samsung.isMute());
        samsung.volumeDown();
        assertFalse(samsung.isMute());
        assertEquals(5, samsung.getVolume());
    }
}
