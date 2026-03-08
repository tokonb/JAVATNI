package Banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
    }

    public boolean hasAccountId() {
        try (BufferedReader br = new BufferedReader(new FileReader(getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2 && parts[0].equals(getAccId())) {
                    setAccBalance(Double.parseDouble(parts[1]));
                    return true;
                }
            }
        } catch (IOException e) {
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}
