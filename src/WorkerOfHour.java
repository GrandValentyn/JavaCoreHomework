public class WorkerOfHour implements Salary {
    private int Hour;
    private int TaxesHour;
    private int Day;

    public WorkerOfHour(int Hour, int TaxesHour, int Day){
        this.Hour = Hour;
        this.TaxesHour = TaxesHour;
        this.Day = Day;
    }



    @Override
    public void Salary() {
        System.out.println(("ШЕФ НЕ ЗАТРИМУЙ ЗАРПЛАТУ :")+ +(+Hour*TaxesHour*Day));
    }
}
