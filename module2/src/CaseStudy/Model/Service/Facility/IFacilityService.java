package CaseStudy.Model.Service.Facility;

import CaseStudy.Model.model.Facility.Falicity;

public interface IFacilityService {
    void displayList();
    void add(Falicity falicity, int number);
    void displayListMaintenance();
}
