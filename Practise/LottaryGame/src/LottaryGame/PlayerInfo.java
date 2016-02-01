package LottaryGame;

public class PlayerInfo {

	private long EGN;
	private int[] userNumbers;

	public PlayerInfo() {
		super();

	}

	public PlayerInfo(long eGN, int[] userNumbers) {
		super();
		EGN = eGN;
		this.userNumbers = userNumbers;
	}

	public int[] getUserNumbers() {
		return userNumbers;
	}

	public void setUserNumbers(int[] userNumbers) {
		this.userNumbers = userNumbers;
	}

	public long getEGN() {
		return EGN;
	}

	public void setEGN(long eGN) {
		EGN = eGN;
	}

	public String toString() {
		return String.format("%d : %d , %d, %d, %d, %d ", this.EGN, this.userNumbers[0], this.userNumbers[1], this.userNumbers[2],this.userNumbers[3],this.userNumbers[4]);
	}

}