package problem2.factory;

import problem2.CompanyName;

public class TeslaPartsFactory extends CarPartsFactory{
    CompanyName companyName;

    public TeslaPartsFactory() { this.companyName = CompanyName.TESLA;}

    @Override
    public CompanyName getCompanyName() {
        return companyName;
    }
}
