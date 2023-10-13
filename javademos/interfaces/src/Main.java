public class Main {
    public static void main(String[] args) {
        //ICostumerDal costumerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager();
        customerManager.costumerDal = new SqlCostumerDal();
        customerManager.add();
    }
}