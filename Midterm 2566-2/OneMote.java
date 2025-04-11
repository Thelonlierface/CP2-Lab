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
        if (this.power && this.channel + 1 <= 50 && this.channel > 0) {
            this.channel++;
            return true;
        }
        return false;
    }

    public boolean channelDown() {
        if (this.power && this.channel - 1 > 0 && this.channel <= 50) {
            this.channel--;
            return true;
        }
        return false;
    }

    public boolean volumeUp() {
        if (this.power && this.volume + 1 < 100 && this.volume >= 0) {
            this.volume++;
            return true;
        }
        return false;
    }

    public boolean volumeDown() {
        if (this.power && this.volume - 1 >= 0 && this.volume < 100) {
            this.volume--;
            return true;
        }
        return false;
    }
}

public class OneMote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        Television[] tv = new Television[n];
        for (int i = 0; i < tv.length; i++) {
            tv[i] = new Television(1, 0);
        }
        int tvNum = 0;
        while (true) {
            String cmd = input.next();
            switch (cmd) {
                case "stop":
                    input.close();
                    System.exit(1);
                    break;
                case "change_target":
                    int temp = input.nextInt() - 1;
                    if(temp >= 0 && temp < n) {
                        tvNum = temp;
                        System.out.println("target tv is " + (tvNum+1));
                    }
                    else {
                        System.out.println("invalid position");
                    }
                    break;
                case "turn_on":
                    System.out.print(tv[tvNum].turnOn() ? String.format("%d tv has been turned on\n", tvNum+1) : "");
                    break;
                case "turn_off":
                    System.out.print(tv[tvNum].turnOff() ? String.format("%d tv has been turned off\n", tvNum+1) : "");
                    break;
                case "channel_up":
                    if (tv[tvNum].power)
                        System.out.println(tv[tvNum].channelUp() ? "the " + (tvNum+1) + " tv channel is " + tv[tvNum].channel : "cannot change " + (tvNum+1) + " tv channel");
                    break;
                case "channel_down":
                    if (tv[tvNum].power)
                        System.out.println(tv[tvNum].channelDown() ? "the " + (tvNum+1) + " tv channel is " + tv[tvNum].channel : "cannot change " + (tvNum+1) + " tv channel");
                    break;
                case "volume_up":
                    if (tv[tvNum].power)
                        System.out.println(tv[tvNum].volumeUp() ? "the " + (tvNum + 1) + " tv volume level is " + tv[tvNum].volume : "cannot change " + (tvNum+1) + " tv volume");
                    break;
                case "volume_down":
                    if (tv[tvNum].power)
                        System.out.println(tv[tvNum].volumeDown() ? "the " + (tvNum+1) + " tv volume level is " + tv[tvNum].volume : "cannot change " + (tvNum+1) + " tv volume");
                    break;
                case "all_turn_on":
                    for (int i = 0; i < tv.length; i++) {
                        System.out.print(tv[i].turnOn() ? String.format("%d tv has been turned on\n", i+1) : "");
                    }
                    break;
                case "all_turn_off":
                    for (int i = 0; i < tv.length; i++) {
                        System.out.print(tv[i].turnOff() ? String.format("%d tv has been turned off\n", i+1) : "");
                    }
                    break;
            }
        }
    }
}
/*editor's note:
 * holy fuck amount of data + should've used string.format for all the damn cases
 */