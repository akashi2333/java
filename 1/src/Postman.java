
public class Postman {

	protected Double pricePerKg = 1.0;
    protected Double pricePerMail = 5.0;
    protected Double pricePerPaper = 2.0;

    public Double calculateEachExpress(Double kg) {
        return this.pricePerKg * kg;
    }

    public Double calculateMail(Integer mailCount) {
        return this.pricePerMail * mailCount;
    }

    public Double calculatePaper() {
        return this.pricePerPaper;
    }

    public Double calculatePrice(Double kg, Integer mailCount, Boolean paper) {
        return this.calculatePaper() + this.calculateMail(mailCount) + this.calculateEachExpress(kg);
    }
}
