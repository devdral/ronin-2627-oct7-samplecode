public class User {
    private int _kindBarCount;
    private int _cliffBarCount;
    private int _dietCokeCount;
    private int _waterCount;
    private double _balance;

    public User(double startingBalance) {
        _balance = startingBalance;
    }

    public String addKindBar() {
        if (_balance >= 1.99) {
            _kindBarCount++;
            _balance -= 1.99;
            return "Successfully purchased!";
        }
        return "Insufficient balance.";
    }

    public String addCliffBar() {
        if (_balance >= 1.99) {
            _cliffBarCount++;
            _balance -= 1.99;
            return "Successfully purchased!";
        }
        return "Insufficient balance.";
    }

    public String addWater() {
        if (_balance >= 0.99) {
            _waterCount++;
            _balance -= 0.99;
            return "Successfully purchased!";
        }
        return "Insufficient balance.";
    }

    public String addDietCoke() {
        if (_balance >= 0.99) {
            _dietCokeCount++;
            _balance -= 0.99;
            return "Successfully purchased!";
        }
        return "Insufficient balance.";
    }

    public void printStatus() {
        System.out.println("Balance: $" + Math.round(_balance * 100.0) / 100.0);
        System.out.println("# of Kind Bars: " + _kindBarCount);
        System.out.println("# of Clff Bars: " + _cliffBarCount);
        System.out.println("# of Diet Cokes: " + _dietCokeCount);
        System.out.println("# of Watter Bottles: " + _waterCount);
    }
}
