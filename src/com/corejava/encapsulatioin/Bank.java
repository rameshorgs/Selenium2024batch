package com.corejava.encapsulatioin;

public class Bank {

   private int accountno;

    private int bal;

    private int debt;

    private  String name;

    public int getAccountno(){
    return accountno;
    }

    public int getDebt() {
        return debt;
    }

    public int getBal() {
        return bal;
    }

    public String getName() {
        return name;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void BankManager(int accountno,int bal,int debt,String name){
    setAccountno(accountno);
    setBal(bal);
    setDebt(debt);
    setName(name);
    }

    public  void displayBankManager(){
      int acc=  getAccountno();
        System.out.println(acc);
        int balv=    getBal();
        System.out.println(balv);
        int debt1=   getDebt();
        System.out.println(debt1);
        String name1=    getName();
        System.out.println(name1);
    }
}
