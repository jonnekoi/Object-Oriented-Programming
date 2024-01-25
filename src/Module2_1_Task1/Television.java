package Module2_1_Task1;

public class Television {
    private boolean isOn;
    private int channel;

    public Television(){
        this.isOn = false;
        this.channel = 1;
    }

    public boolean isOn(){
        return isOn;
    }

    public int getChannel(){
        return channel;
    }

    public void setChannel(int channel){
        if (channel > 10){
            this.channel = 1;
        }else{
            this.channel = channel;
        }
    }

    public void pressOnOff(){
        if (isOn){
            channel = 1;
        }
    }

}
