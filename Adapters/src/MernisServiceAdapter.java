import mernisReference.SRJKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        SRJKPSPublicSoap client = new SRJKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfbirthYear());
    }
}
