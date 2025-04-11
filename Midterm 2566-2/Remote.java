import java.util.Scanner;

class Television {
    public int channel;
    public int volume;
    public boolean power; // true for on, false for off

    public Television(int ch, int vol) {
        this.channel = ch;
        this.volume = vol;
        this.power = false;
    }

    public boolean turnOn() {
        if (!power) {
            this.power = true;
            return true;
        }
        return false;
    }

    public boolean turnOff() {
        if (this.power) {
            this.power = false;
            return true;
        }
        return false;
    }

    public boolean channelUp() {
        if(this.power && this.channel + 1 <= 50 && this.channel > 0) {
            this.channel++;
            return true;
        }
        return false;
    }

    public boolean channelDown() {
        if(this.power && this.channel -1 > 0 && this.channel <= 50) {
            this.channel--;
            return true;
        }
        return false;
    }

    public boolean volumeUp() {
        if(this.power && this.volume + 1 < 100 && this.volume >= 0) {
            this.volume++;
            return true;
        }
        return false;
    }

    public boolean volumeDown() {
        if(this.power && this.volume - 1 >= 0 && this.volume < 100) {
            this.volume--;
            return true;
        }
        return false;
    }
}

public class Remote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();
        int vol = input.nextInt();
        Television tv = new Television(ch, vol);
        while (true) {
            String fn = input.next();
            switch (fn) {
                case "stop":
                    input.close();
                    System.exit(1);
                    break;
                case "turn_on":
                    System.out.print(tv.turnOn() ? String.format("tv has been turned on\n") : "");
                    break;
                case "turn_off":
                    System.out.print(tv.turnOff() ? String.format("tv has been turned off\n") : "");
                    break;
                case "channel_up":
                    if(tv.power) System.out.println(tv.channelUp() ? "the channel is " + tv.channel : "cannot change channel");
                    break;
                case "channel_down":
                    if(tv.power) System.out.println(tv.channelDown() ? "the channel is " + tv.channel : "cannot change channel");
                    break;
                case "volume_up":
                    if(tv.power) System.out.println(tv.volumeUp() ? "the volume level is " + tv.volume : "cannot change volume");
                    break;
                case "volume_down":
                    if(tv.power) System.out.println(tv.volumeDown() ? "the volume level is " + tv.volume : "cannot change volume");
                    break;
            }
        }
    }
}
