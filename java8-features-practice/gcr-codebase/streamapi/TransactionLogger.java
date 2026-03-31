package streamapi;

import java.util.*;

public class TransactionLogger {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
            "TXN101", "TXN102", "TXN103", "TXN104", "TXN105"
        );

        // Log each transaction
        transactionIds.forEach(id ->
            System.out.println("Transaction logged: " + id)
        );
    }
}

