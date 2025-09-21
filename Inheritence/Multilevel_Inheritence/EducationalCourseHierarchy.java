public class EducationalCourseHierarchy {

    // Base class Course
    public static class Course {
        protected String courseName;
        protected int duration; // duration in hours

        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        public String getCourseDetails() {
            return "Course: " + courseName + ", Duration: " + duration + " hours";
        }
    }

    // Subclass OnlineCourse
    public static class OnlineCourse extends Course {
        protected String platform;
        protected boolean isRecorded;

        public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }

        @Override
        public String getCourseDetails() {
            return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
        }
    }

    // Subclass PaidOnlineCourse extending OnlineCourse
    public static class PaidOnlineCourse extends OnlineCourse {
        private double fee;
        private double discount; // discount in percentage

        public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
            super(courseName, duration, platform, isRecorded);
            this.fee = fee;
            this.discount = discount;
        }

        public double getDiscountedFee() {
            return fee - (fee * discount / 100);
        }

        @Override
        public String getCourseDetails() {
            return super.getCourseDetails() + ", Fee: $" + fee + ", Discount: " + discount + "%, Discounted Fee: $" + getDiscountedFee();
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 40);
        System.out.println(course.getCourseDetails());

        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 50, "Udemy", true);
        System.out.println(onlineCourse.getCourseDetails());

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 60, "Coursera", false, 200.0, 15.0);
        System.out.println(paidCourse.getCourseDetails());
    }
}
