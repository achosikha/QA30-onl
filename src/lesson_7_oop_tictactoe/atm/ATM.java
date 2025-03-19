package lesson_7_oop_tictactoe.atm;

public class ATM {
    public String atmCompany;
    public String atmUser;
    public String atmCardHolderName;
    public long atmCardHolderNumber;
    public long atmCardHolderDebitAccount;

    // Если вы создали класс без КОНСТРУКТОРА
    // Программа во время компиляции создаст ДЕФОЛТНЫЙ КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    // Constructor, public + class name
    public ATM(){}

    // Если вы сами создали любой конструктор, тот компилятор ничего не будет больше добавлять
    // Вы обязаны делать все самостоятельно
    public ATM(String name, String user, String holderName, long holderNumber, long debitAccount){
        atmCompany = name;
        atmUser = user;
        atmCardHolderName = holderName;
        atmCardHolderNumber = holderNumber;
        atmCardHolderDebitAccount = debitAccount;
    }

    public String getATMFullInformation(){
        return "ATM Company: " + atmCompany + ".\n" +
                "AMT User: " + atmUser + ".\n" +
                "AMT card holder name: " + atmCardHolderName + ".\n" +
                "AMT card holder number: " + atmCardHolderNumber + ".\n" +
                "ATM card holder debit card account: " + atmCardHolderDebitAccount + ".\n";
    }
}
