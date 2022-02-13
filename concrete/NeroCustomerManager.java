public class NeroCustomerManager extends BaseCustomerManager{

    CustomerCheckService _checkService;

    public NeroCustomerManager(CustomerCheckService checkService) {
        _checkService = checkService;
    }

    @Override
    public void save(Customer customer) {
        try {
            if(_checkService.checkIfRealPerson(customer)) {
                super.save(customer);
            }
            else {
                try {
                    throw new Exception("Not a valid person.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
