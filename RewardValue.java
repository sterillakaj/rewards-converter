public class RewardValue {
	private double cashValue;
	private int miles;
    public static final double cashRate = 0.0035;

	public RewardValue(double cashValue)
	{
		this.cashValue=cashValue;
		
	}
	public RewardValue(int miles)
	{
		this.miles=miles;
		this.cashValue=miles * cashRate;
	}
    public double getCashValue() {
        return this.cashValue;
    }
	public int getMilesValue() {
		return (int)(cashValue / cashRate);
	}
}
