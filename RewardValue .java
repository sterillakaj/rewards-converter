public class RewardValue {

	private double cashValue;
	private int miles;

    public static final double CASH_RATE = 0.0035;

	public RewardValue(double cashValue){
		this.cashValue=cashValue;
        this.miles = convertCashToMiles(cashValue);
	}
	
    public RewardValue(int miles){
		this.miles=miles;
		this.cashValue = convertMilesToCash(miles);
	}

    public double getCashValue() {
        return this.cashValue;
    }
    
    public int getMilesValue(){
        return this.miles;
    }

	private int convertCashToMiles(double cashValue){

        if(CASH_RATE == 0){
            throw new ArithmeticException("CASH_RATE cannot be zero.");
        }

		return (int)(cashValue / CASH_RATE);

	}

    private double convertMilesToCash(int miles){
        return miles * CASH_RATE;
    }

}
