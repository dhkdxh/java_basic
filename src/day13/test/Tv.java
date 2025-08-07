package day13.test;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power(){
        this.power = !this.power;
    }

    public void channelUp(){
        this.channel += 1;
    }

    public void channelDown(){
        this.channel -= 1;
    }

    public void print(){
        System.out.println("color :"+this.color+"\tpower:"+this.power+"\t\tchannel:"+this.channel);
    }
}
