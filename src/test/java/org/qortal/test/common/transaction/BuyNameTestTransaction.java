package org.qortal.test.common.transaction;

import java.math.BigDecimal;

import org.qortal.account.PrivateKeyAccount;
import org.qortal.data.transaction.BuyNameTransactionData;
import org.qortal.data.transaction.TransactionData;
import org.qortal.repository.DataException;
import org.qortal.repository.Repository;

public class BuyNameTestTransaction extends TestTransaction {

	public static TransactionData randomTransaction(Repository repository, PrivateKeyAccount account, boolean wantValid) throws DataException {
		String name = "test name";
		if (!wantValid)
			name += " " + random.nextInt(1_000_000);

		BigDecimal amount = BigDecimal.valueOf(123);
		String seller = account.getAddress();

		return new BuyNameTransactionData(generateBase(account), name, amount, seller);
	}

}
