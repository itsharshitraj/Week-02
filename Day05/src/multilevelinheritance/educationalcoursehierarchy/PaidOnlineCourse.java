package multilevelinheritance.educationalcoursehierarchy;

class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected double discount;

    PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    // method to calculate discount
    public double calculateDiscountFee(){
        return  fee -(fee*discount)/100;
    }

    // method to display paid online course information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fee: INR " + fee);
        System.out.println("Discount : " + discount + "%");
        System.out.println("Discounted Fee: " + calculateDiscountFee());

    }
}