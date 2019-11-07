public class WorkerOfMonth implements Salary {

    private int SalaryOfMonth;

    public WorkerOfMonth(int SalaryOfMonth){
        this.SalaryOfMonth = SalaryOfMonth;

    }


    @Override
    public void Salary() {
             System.out.println("ДЕ МОЯ ЗАРПЛAПТА : "+SalaryOfMonth);
        }
    }

