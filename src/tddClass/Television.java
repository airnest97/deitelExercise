package tddClass;

import java.util.Objects;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;
    private String input = "TV";
    private boolean isMute;


    public void powerStatus() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channelNumber){
        if (isOn){
            if (channelNumber < 0)
                channel = 1;
            else if (channelNumber > 50)
                channel = 50;
            else
                channel = channelNumber;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void programUp() {
        if (isOn) {
            if (channel >= 50)
                channel = 50;
            else
                channel = channel + 1;
        }
    }

    public void programDown() {
        if (isOn) {
            if (channel <= 0)
                channel = 1;
            else
                channel = channel - 1;
        }
    }

    public int getVolume() {
        if (isMute)
            volume = 0;
        return volume;
    }

    public void volumeUp() {
        if (isOn){
            if(volume >= 100) volume = 100;
            else{
                if(isMute) isMute = false;
                volume =  volume + 1;
            }
        }
    }

    public void volumeDown() {
        if (isOn) {
            if (volume < 1) volume = 0;
            else {
                if (isMute) isMute = false;
                volume = volume - 1;
            }
        }
    }

    public void inputMode() {
        if(isOn){
            if(Objects.equals(input, "TV"))
                {input = "AV1";}
                else
                    if(Objects.equals(input, "AV1"))
                        {input = "AV2";}
                    else
                        if(Objects.equals(input, "AV2"))
                            {input = "TV";}
        }
    }

    public String getInputMode() {
        return input;
    }

    public void mute() {
        if (isOn) {
            isMute = !isMute;
        }
    }


    public boolean isMute() {
        return isMute;
    }
}
