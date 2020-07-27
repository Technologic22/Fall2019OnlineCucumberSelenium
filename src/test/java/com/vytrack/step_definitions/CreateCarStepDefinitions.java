package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    VehiclesPage vehiclesPage=new VehiclesPage();

    @Then("user clicks on create a car button")
    public void user_clicks_on_create_a_car_button() {
        System.out.println("User clicks on a create a car button");
        vehiclesPage.clickToCreateCar();
    }

//    Then user creates a car with following info:
//            | License Plate | Driver    | Location | Model Year | Color |        >'
//            |   SDET        | Pro Racer | Brooklyn | 2018       | Gray  | =====>>  Row '0'....

    @Then("user creates a car with following info:")
    public void user_creates_a_car_with_following_info(List<Map<String, String>> dataTable) {

        System.out.println(dataTable);
        for (Map <String, String > row : dataTable) {
            vehiclesPage.setLicencePlateInput(row.get("License Plate"));

            vehiclesPage.setDriverInput(row.get("Driver"));

            vehiclesPage.setLocationInput(row.get("Location"));

            vehiclesPage.setModelYear(row.get("Model Year"));

            vehiclesPage.setColor(row.get("Color"));
            // click to save new car
            vehiclesPage.clickOnSaveAndClose();
        }

    }

}
