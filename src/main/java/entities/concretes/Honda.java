package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Honda extends Cars {

    public List<Honda> hondaList = new ArrayList<>();

    private String model;
//    private String modelName;

    public Honda() {
    }

    public Honda(String model, String id, int modelYear, boolean gear, String fuelType, double dailyPrice) {
        this.model = model;
        super.setId(id);
        super.setModelYear(modelYear);
        super.setGear(gear);
        super.setFuelType(fuelType);
        super.setDailyPrice(dailyPrice);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "Id: " + getId() +
                ", Model: "+ getModel() +
                ", Model Year: "+ getModelYear() +
                ", Automatic Gear: "+ isGear() +
                ", Fuel Type: " + getFuelType() +
                ", Daily Price: " + getDailyPrice()
                ;
    }

        public void fillHondaList() {
        Honda honda = new Honda("Accord","HAC2022100",2022,true,"gasoline",75.90);
        Honda honda2 = new Honda("Accord","HAC2022101",2022,false,"diesel",69.90);
        Honda honda3 = new Honda("Civic","HCV2021100",2021,true,"gasoline",65.90);
        Honda honda4 = new Honda("Civic","HCV2020101",2020,false,"diesel",60.90);
        Honda honda5 = new Honda("City","HCT2020100",2020,false,"diesel",42.95);
        Honda honda6 = new Honda("City","HCT2022101",2022,true,"diesel",46.95);
        Honda honda7 = new Honda("Jazz","HJZ2023100",2023,true,"hybrid",45.95);
        Honda honda8 = new Honda("Jazz","HJZ2020101",2020,false,"Gasoline",39.90);
        hondaList.add(honda);
        hondaList.add(honda2);
        hondaList.add(honda3);
        hondaList.add(honda4);
        hondaList.add(honda5);
        hondaList.add(honda6);
        hondaList.add(honda7);
        hondaList.add(honda8);
    }

    public void showHondaCars(){

        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");
        for (Honda w:hondaList){
            System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Honda",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
        }

    }

}

//this.model,super.getId(),super.getModelYear(),super.getColour(),super.getKm(),super.getSeat(),super.getDoor(),super.getGear(),super.getAc()
