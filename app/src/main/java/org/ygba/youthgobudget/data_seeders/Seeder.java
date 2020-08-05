package org.ygba.youthgobudget.data_seeders;

import android.app.Application;
import android.content.Context;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;

public class Seeder {
    YGBARepository ygbaRepository;
    public Seeder(Context application) {
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }
    public void seed() {
        seedWaterAndEnvironment();
        seedAgriculture();
    }

    public void seedAgriculture() {
        for (int i = 0; i < 20; i++) {
            AgricultureQuestion agricultureQuestion = new AgricultureQuestion(
                    "2020-2021",
                    "02-03-2020",
                    "Kijjabwemi",
                    "Kyabakuza",
                    "Kimaanya",
                    "Simon Peter Ojok",
                    "0772241709",
                    "2344",
                    "Yes",
                    "I have just arrived here few minutes ago",
                    "24000",
                    "20000",
                    "20-03-2020",
                    "30-04-2020",
                    "20000",
                    "14000",
                    "12-02-2020",
                    "13-02-2020",
                    "456",
                    // "some reason",
                    "Yes",
                    "56",
                    "Kijjabwemi Village B",
                    "There was no enough fundings",
                    "Yes",
                    "78",
                    "Kijjabwemi Zone B",
                    "45",
                    "45",
                    "The date was not wel communicated",
                    "Yes",
                    "Cow",
                    "20-02-2020",
                    "45",
                    "30",
                    "Kabale",
                    "Pig",
                    "20-01-2020",
                    "4",
                    "39",
                    "Kabalema",
                    "Hoe",
                    "09-02-2020",
                    "45",
                    "30",
                    "Kabalwe",
                    "Goat",
                    "01-02-2020",
                    "4",
                    "30",
                    "Kabaleya",
                    "Cow",
                    "20-02-2020",
                    "45",
                    "30",
                    "Kabale",
                    "Less money was provided some data",
                    "There was not providing some informations"
            );
            ygbaRepository.saveAgricultureQuestion(agricultureQuestion);
        }
    }

    public void seedWaterAndEnvironment() {
        for(int i = 0; i <= 20; i++) {
            WaterEnvironmentQuestion waterEnvironmentQuestion = new WaterEnvironmentQuestion.Builder()
                    .setFinancialYear("2020-2030")
                    .setQuarter("iv")
                    .setDate("20-03-2020")
                    .setDistrict("Masaka" + String.valueOf(i))
                    .setVillage("Kijjabwemi" + String.valueOf(i))
                    .setParish("Kimanya" + String.valueOf(i))
                    .setDivision("Kimaanya-Kyabakuzza" + String.valueOf(i))
                    .setAgentFullName("Simon Peter Ojok" + String.valueOf(i))
                    .setAgentTel("0772241709")
                    .setQuestion1Objective(true)
                    .setQuestion1Reason("This value was entered during api testing" + String.valueOf(i))
                    .setQuestion2LongAnswer("Basing this was typed during api testing so please dont record it" + String.valueOf(i))
                    .setQuestion3ObjectiveAnswer(true)
                    .setQuestion4LongAnswer("This must be some long text though" + String.valueOf(i))
                    .setQuestion5Area1("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource1("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional1(45)
                    .setQuestion5NoneFunctional1(34)
                    .setQuestion5NoWaterSourceAvailable(45)
                    .setQuestion5Area2("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource2("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional2(45)
                    .setNonFunctional2(34)
                    .setQuestion5NoWaterSourceAvailable3(45)
                    .setQuestion5Area3("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource3("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional3(45)
                    .setNonFunctional3(34)
                    .setQuestion5NoWaterSourceAvailable3(45)
                    .setQuestion5Area4("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource4("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional4(45)
                    .setNonFunctional4(34)
                    .setQuestion5NoWaterSourceAvailable4(45)
                    .setQuestion5Area5("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource5("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional5(45)
                    .setNonFunctional5(34)
                    .setQuestion5NoWaterSourceAvailable5(45)
                    .setQuestion5Area6("Kijjabwemi" + String.valueOf(i))
                    .setQuestion5WaterSource6("Deep Ocean" + String.valueOf(i))
                    .setQuestion5Functional6(45)
                    .setNonFunctional6(34)
                    .setQuestion5NoWaterSourceAvailable6(45)
                    .setQuestion5Objective(true)
                    .setQuestion5ObjectiveReason("Basing I want all the api implemented and tested" + String.valueOf(i))
                    .setQuestion6WetlandDemarcated("There is no water deprecated" + String.valueOf(i))
                    .setQuestion6SubCounty1("Kimaanya" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction1(89)
                    .setQuestion6SubCounty2("Kimaanya1" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction2(93)
                    .setQuestion6SubCounty3("Kimaanya 3" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction3(80)
                    .setQuestion6SubCounty4("Kimaanya No" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction4(80)
                    .setQuestion6SubCounty5("Kimaanya No" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction5(80)
                    .setQuestion6SubCounty5("Kimaanya Better" + String.valueOf(i))
                    .setQuestion6WetlandUnderDestruction5(8)
                    .setQuestion62TreePlanting("There is nothing known here" + String.valueOf(i))
                    .build();

            ygbaRepository.saveWaterEnvironmentQuestion(waterEnvironmentQuestion);
        }

    }
}