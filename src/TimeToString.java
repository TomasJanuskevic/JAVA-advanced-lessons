public class TimeToString {
    public static String time(int num) {
        if (num == 0) {
            return "now";
        } else {

            int years = num / (60 * 60 * 24 * 365);
            int days = num / (60 * 60 * 24) % 365;
            int hours = (num / (60 * 60)) % 24;
            int minutes = (num / 60) % 60;
            int seconds = num % 60;

            StringBuilder time = new StringBuilder();

            if (years == 1) {
                time.append(years + " year, ");
            } else if (years > 1) {
                time.append(years + " years, ");
            }
            if (days == 1) {
                time.append(days + " day, ");
            } else if (days > 1) {
                time.append(days + " days, ");
            }
            if (hours == 1) {
                time.append(hours + " hour, ");
            } else if (hours > 1) {
                time.append(hours + " hours, ");
            }
            if (minutes == 1) {
                time.append(minutes + " minute, ");
            } else if (minutes > 1) {
                time.append(minutes + " minutes, ");
            }
            if (seconds == 1) {
                time.append(seconds + " second, ");
            } else if (seconds > 1) {
                time.append(seconds + " seconds, ");
            }

            if (years != 0 && days == 0 && hours == 0 && minutes == 0 && seconds == 0) {
                return time.delete(time.length() - 2, time.length()).toString();
            } else if (years == 0 && days != 0 && hours == 0 && minutes == 0 && seconds == 0) {
                return time.delete(time.length() - 2, time.length()).toString();
            } else if (years == 0 && days == 0 && hours != 0 && minutes == 0 && seconds == 0) {
                return time.delete(time.length() - 2, time.length()).toString();
            } else if (years == 0 && days == 0 && hours == 0 && minutes != 0 && seconds == 0) {
                return time.delete(time.length() - 2, time.length()).toString();
            } else if (years == 0 && days == 0 && hours == 0 && minutes == 0 && seconds != 0) {
                return time.delete(time.length() - 2, time.length()).toString();
            } else {
                return time.delete(time.length() - 2, time.length()).replace(time.lastIndexOf(","),
                        time.lastIndexOf(",") + 1, " and").toString();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(time(900000));

    }
}
