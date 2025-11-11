
class Time {
    int hr, min, sec;

    // Default constructor
    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    // Parameterized constructor
    Time(int h, int m, int s) {
        this.hr = h;
        this.min = m;
        this.sec = s;
        normalize(); // ensure proper time format
    }

    // Normalize time 
    void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        hr = hr % 24; // 24-hour format
    }

    //  Add two Time objects
    Time add(Time t) {
        Time temp = new Time();
        temp.hr = this.hr + t.hr;
        temp.min = this.min + t.min;
        temp.sec = this.sec + t.sec;
        temp.normalize();
        return temp;
    }

    //  Add seconds 
    Time add(int seconds) {
        Time temp = new Time(this.hr, this.min, this.sec + seconds);
        temp.normalize();
        return temp;
    }

    // Display time
    void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}
class MainTime {
    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 30, 30);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        // Adding two time objects
        Time t3 = t1.add(t2);
        System.out.print("After adding t1 + t2: ");
        t3.display();

        // Adding seconds
        Time t4 = t1.add(5000); // Add 5000 seconds
        System.out.print("After adding t1 + 5000 seconds: ");
        t4.display();
    }
}

