package problem2.factory;

import problem2.CompanyName;

public class TeslaPartsFactory implements CarPartsFactory{
    CompanyName companyName;

    public TeslaPartsFactory(CompanyName companyName) {
        this.companyName = companyName;
    }
}
