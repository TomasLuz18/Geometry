public class T2time {
    static final int T2DAYSECONDS = 13*3600+27*60+16; //48436 secs/day
    private int seconds = 0; //valid range [0, T2DAYSECONDS-1]
    /**
     * @param secs an integer representing the number of seconds since midnight
     * @inv this.seconds in 0..T2DAYSECONDS-1
     * @post this.seconds==secs
     * @throws IllegalArgumentException if secs not in 0..T2DAYSECONDS-1
     */
    public T2time(int secs) {
        if (secs < 0 || secs >= T2DAYSECONDS)
            throw new IllegalArgumentException("0 <= secs < T2DAYSECONDS");
        this.seconds = secs;
    }
    /**
     * @param h an integer representing the number of hours since midnight
     * @param m an integer representing the number of min since h
     * @param s an integer representing the number of hours since m
     * @inv this.seconds in 0..T2DAYSECONDS-1
     * @post this.seconds = h*3600 + m*60 + s
     * @throws IllegalArgumentException if (h*3600 + m*60 + s) not in
    [0, T2DAYSECONDS-1]
     */
    public T2time(int h, int m, int s) {
        this(h*3600 + m*60 + s);
    }

    public T2time(String timeString) {
        if (!isTime(timeString)){
            throw new IllegalArgumentException("A string não está no formato correto (HH:MM:SS)");

        } else{
            String[] parts = timeString.split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);

            this.seconds = h * 3600 + m * 60 + s;

        }

    }


    /**
     * @return this.seconds
     */
    public int asSeconds() { return seconds; }

    /**
     * @return this.seconds formatted as "HH:MM:SS"
     */
    public String toString() {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = (seconds % 3600) % 60;
        return String.format("%02d:%02d:%02d",h,m,s);
    }

    /**
     * @pre arg != null
     * @return new T2time with the sum of this and arg mod T2DAYSECONDS
     * @post this == old this
     */
    public T2time add(T2time arg) {

        int totalSeconds = (this.seconds + arg.seconds) % T2DAYSECONDS;
        return new T2time(totalSeconds);
    }

    public static boolean isTime(String input) {
        return input.matches("\\d{2}:\\d{2}:\\d{2}");
    }

}
