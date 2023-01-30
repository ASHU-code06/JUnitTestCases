import java.util.ArrayList;
import java.util.Scanner;

public class CabInvoiceGenerator {
    public float Calculatedfare() {
        float fare=5, distance = 10, time = 6;
        if (distance==0||time==0){
            return fare;
        }else {
        fare = 10 * distance + 1 * time;
        System.out.println("Distance=10km and time is 6 minutes");
        System.out.println("fare is "+fare);
        return fare;}
    }
    public float CalculateFareForMultipleRides() {
        float Onetimefare=5, distance = 10, time = 6,total_fare_for_many_rides;
        int many_rides=8;
        if (distance==0||time==0){
            return Onetimefare;
        }else {
            Onetimefare = 10 * distance + 1 * time;
            total_fare_for_many_rides=Onetimefare*many_rides;
            System.out.println("Distance=10km and time is 6 minutes");
            System.out.println("fare is "+total_fare_for_many_rides);
            return total_fare_for_many_rides;}
    }
    public float CalculationOfFareForMultipleRides() {
        float fareperride=5, distance = 0, time = 0,ride1,ride2,ride3,total_fare;
        int many_rides=3;
        //for ride 1 : time = 10 minutes and distance = 5 km
        ride1 = 10 * 5 + 1 * 10;
        //for ride 2 : time = 55 minutes and distance = 30 km
        ride2 = 10 * 30 + 1 * 55;
        //for ride 3 : time = 45 minutes and distance = 26  km
        ride3 = 10 * 26 + 1 * 45;
        System.out.println("for ride 1 : time = 10 minutes and distance = 5 km , Average fare is "+ride1);
        System.out.println("for ride 2 : time = 55 minutes and distance = 30 km , Average fare is "+ride2);
        System.out.println("for ride 3 : time = 45 minutes and distance = 26  km , Average fare is "+ride3);
        System.out.println("Total rides is "+many_rides);
        total_fare=ride1+ride2+ride3;
        return total_fare;
    }
    public float premiumRides(){
        float distance=10,time=15,normal_ridefare,prem_ridefare;
        System.out.println("For premium ride fare is 15 rs per km + 2 rs per minute ");
        normal_ridefare = 10 * distance + 1 * time;
        prem_ridefare = 15 * distance + 2 * time;
        return prem_ridefare;
    }
    public float invoiceService(){
        ArrayList<Integer> riderepository = new ArrayList<>();
        float fareperride=5, distance = 0, time = 0,ride1,ride2,ride3,invoice;
        int many_rides=3;
        //for ride 1 : time = 10 minutes and distance = 5 km
        ride1 = 10 * 5 + 1 * 10;
        //for ride 2 : time = 55 minutes and distance = 30 km
        ride2 = 10 * 30 + 1 * 50;
        //for ride 3 : time = 45 minutes and distance = 26  km
        ride3 = 10 * 26 + 1 * 40;
        riderepository.add(60);
        riderepository.add(350);
        riderepository.add(300);
        invoice=ride1+ride2+ride3;
        return invoice;

    }

}
