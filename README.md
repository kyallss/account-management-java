# Personal Account Management System
## 
This project implements a basic personal account management system in Java. The system includes the functionality to deposit, withdraw, and display transaction history for a user's account. It uses an Amount class to store transaction details and a TransactionType enum to classify transactions as either DEPOSIT or WITHDRAWAL.

## 
## Table of Contents
+ Features
+ Usage
+ Classes
+ PersonalAccount
+ Amount
+ TransactionType

## Features
+ Create a personal account with an account number and account holder's name.
+ Deposit money into the account.
+ Withdraw money from the account (ensures sufficient balance).
+ Print transaction history (showing all deposits and withdrawals).
+ View account balance, account number, and account holder details.

# Classes
+ PersonalAccount Class
The PersonalAccount class represents a bank account

+ accountNumber: The account number (integer).
+ accountHolder: The name of the account holder (string).
+ balance: The current account balance (double).
+ transactions: A list of transactions (ArrayList<Amount>).

Methods:
+ deposit(amount: double): Deposits money into the account.
+ withdraw(amount: double): Withdraws money from the account.
+ printTransactionHistory(): Prints a list of all transactions.
+ getBalance(): Returns the current balance.
+ getAccountNumber(): Returns the account number.
+ getAccountHolder(): Returns the account holder's name.

Amount Class
The Amount class stores information about a single transaction. 
+ amount: The transaction amount (double).
+ transactionType: The type of transaction (TransactionType, enum).
+ TransactionType Enum
+ The TransactionType enum defines two types of transactions:

+ DEPOSIT: For deposit transactions.
+ WITHDRAWAL: For withdrawal transactions.
