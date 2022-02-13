public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService _checkService;

    public StarbucksCustomerManager(CustomerCheckService checkService) {
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
