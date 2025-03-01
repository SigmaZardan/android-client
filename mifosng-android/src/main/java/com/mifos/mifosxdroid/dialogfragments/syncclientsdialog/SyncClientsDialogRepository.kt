package com.mifos.mifosxdroid.dialogfragments.syncclientsdialog

import com.mifos.objects.accounts.ClientAccounts
import com.mifos.objects.accounts.loan.LoanWithAssociations
import com.mifos.objects.accounts.savings.SavingsAccountWithAssociations
import com.mifos.objects.client.Client
import com.mifos.objects.templates.loans.LoanRepaymentTemplate
import com.mifos.objects.templates.savings.SavingsAccountTransactionTemplate
import rx.Observable

/**
 * Created by Aditya Gupta on 16/08/23.
 */
interface SyncClientsDialogRepository {

    fun syncClientAccounts(clientId: Int): Observable<ClientAccounts>

    fun syncLoanById(loanId: Int): Observable<LoanWithAssociations>

    fun syncLoanRepaymentTemplate(loanId: Int): Observable<LoanRepaymentTemplate>

    fun syncSavingsAccount(
        type: String?, savingsAccountId: Int, association: String?
    ): Observable<SavingsAccountWithAssociations>

    fun syncSavingsAccountTransactionTemplate(
        savingsAccountType: String?, savingsAccountId: Int, transactionType: String?
    ): Observable<SavingsAccountTransactionTemplate>

    fun syncClientInDatabase(client: Client): Observable<Client>
}