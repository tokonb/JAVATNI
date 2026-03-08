package Banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    private boolean isExistingAccount(String account_name) {
        try (BufferedReader br = new BufferedReader(new FileReader(getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(account_name)) {
                    return true;
                }
            }
        } catch (IOException e) {
        }
        return false;
    }

    public String recordAccount() {
        if (isExistingAccount(getAccId())) {
            return "This account has been created!!";
        } else {
            try (FileWriter fw = new FileWriter(getFilename(), true)) {
                fw.write(this.toString() + "\n");
                return "Created account success!!";
            } catch (IOException e) {
                return "Error";
            }
        }
    }
}
