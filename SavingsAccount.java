final class SecurityPolicy {
}

class SavingsAccount {
    
    final double interestRate = 4.5; 

    public final double getPenalty(double balance, double minimumRequired) {
        if (balance < minimumRequired) {
            return 100.0; 
        }
        return 0.0;
    }
}