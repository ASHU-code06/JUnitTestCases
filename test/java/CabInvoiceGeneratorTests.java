import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CabInvoiceGeneratorTests {
    @Test
    public void Should_Return_Appropriate_Calculated_Fare_As_Per_Formula(){
        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        float totalfare=cabInvoiceGenerator.Calculatedfare();
        Assertions.assertEquals(106,totalfare);
    }
    @Test
    public void should_Return_Appropriate_Calculated_Fare_As_Per_Formula_For_Many_Rides(){
        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        float result=cabInvoiceGenerator.CalculateFareForMultipleRides();
        Assertions.assertEquals(848,result);
    }
    @Test
    public void should_Return_Appropriate_Result_Calculation_Of_Fare_For_Multiple_Rides_When_Distance_And_Time_Is_Different(){
        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        float result=cabInvoiceGenerator.CalculationOfFareForMultipleRides();
        Assertions.assertEquals(720,result);
    }
    @Test
    public void should_Return_Appropriate_Result_For_Premium_rides(){
        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        float result=cabInvoiceGenerator.invoiceService();
        Assertions.assertEquals(710,result);
    }

}
