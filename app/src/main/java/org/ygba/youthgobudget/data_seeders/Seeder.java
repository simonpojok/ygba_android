package org.ygba.youthgobudget.data_seeders;

import android.app.Application;
import android.content.Context;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;
import org.ygba.youthgobudget.utils.DynamicData;

public class Seeder {
    YGBARepository ygbaRepository;
    public Seeder(Context application) {
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }
    public void seed() {
//        seedWaterAndEnvironment();
//        seedAgriculture();
//        seedSocialDevelopment();
    }

    public void seedAgriculture() {
        for (int i = 0; i < 20; i++) {
            AgricultureQuestion agricultureQuestion = new AgricultureQuestion(
                    "2020/21",
                    "IV",
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
                    .setDate("2020-03-04")
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

    public void seedSocialDevelopment() {
        for(int i = 0; i <= 20; i++) {
            SocialDevelopmentQuestion question = new SocialDevelopmentQuestion();
            question.setFinancialYear("2020-2025");
            question.setDate(DynamicData.getDate());
            question.setDistrict("Masaka");
            question.setVillage("Kijjabwemi");
            question.setParish("Kimaanya");
            question.setDivision("Kyabakuzza");
            question.setYgbaAgentFullName("Simon Peter Ojok");
            question.setYgbaTel("0772241709");
            question.setQ2CommunityExpected(500000.90);
            question.setQ2CommunityAmountReceived(2000.50);
            question.setQ2CommunityDateReceived("2020-08-05");
            question.setQ2CommunityDateWithdrawn("2020-07-30");
            question.setQ2OtherExpectedAmount(67000);
            question.setQ2OtherAmountedReceived(60000.0);
            question.setQ2OthersDateReceived("2020-04-30");
            question.setQ2OthersDateWithdrawn("2020-05-05");
            question.setQ3WomenEmpowermentObjective(true);
            question.setQ3WomenEmpowermentObjectiveReason("This form was made under app development");

            question.setQ3WomanGroup1Name("Youth For me");
            question.setQ3WomenGroup1Village("Kijjabwemi");
            question.setQ3WomenGroup1MaleNumber(90);
            question.setQ3WomenGroup1FemaleNumber(10);
            question.setQ3WomenGroup1AmountReceived(1000000);

            question.setQ3WomanGroup2Name("Hope For Live");
            question.setQ3WomenGroup2Village("Koro Abili");
            question.setQ3WomenGroup2MaleNumber(0);
            question.setQ3WomenGroup2FemaleNumber(10);
            question.setQ3WomenGroup2AmountReceived(0.0);

            question.setQ3WomanGroup3Name("Men Of All");
            question.setQ3WomenGroup3Village("Anaka");
            question.setQ3WomenGroup3MaleNumber(100);
            question.setQ3WomenGroup3FemaleNumber(0);
            question.setQ3WomenGroup3AmountReceived(40000.00);

            question.setQ3WomanGroup4Name("Better For All");
            question.setQ3WomenGroup4Village("Twangala");
            question.setQ3WomenGroup4MaleNumber(78);
            question.setQ3WomenGroup4FemaleNumber(60);
            question.setQ3WomenGroup4AmountReceived(20);

            question.setQ3WomanGroup5Name("Great God Love");
            question.setQ3WomenGroup5Village("Palenga");
            question.setQ3WomenGroup5MaleNumber(10);
            question.setQ3WomenGroup5FemaleNumber(20);
            question.setQ3WomenGroup5AmountReceived(20000);

            question.setQ3WomanGroup6Name("Karamoja Men On Move");
            question.setQ3WomenGroup6Village("Karamoja");
            question.setQ3WomenGroup6MaleNumber(30);
            question.setQ3WomenGroup6FemaleNumber(45);
            question.setQ3WomenGroup6AmountReceived(56000);

            question.setQ3WomanGroup7Name("Youth Lads");
            question.setQ3WomenGroup7Village("Kirinya");
            question.setQ3WomenGroup7MaleNumber(567);
            question.setQ3WomenGroup7FemaleNumber(10);
            question.setQ3WomenGroup7AmountReceived(45000.00);

            question.setQ4LivelihoodObjective(true);
            question.setQ4LivelihoodObjectiveReason("This answer was correct");


            question.setQ4YouthGroup1Name("The Men And Gold");
            question.setQ4YouthGroup1Village("Kijjabwemi");
            question.setQ4YouthGroup1MaleNumber(10);
            question.setQ4YouthGroup1FemaleNumber(10);
            question.setQ4YouthGroup1AmountReceived(200000);

            question.setQ4YouthGroup2Name("Love God Yeah");
            question.setQ4YouthGroup2Village("Kijjabwemi");
            question.setQ4YouthGroup2MaleNumber(10);
            question.setQ4YouthGroup2FemaleNumber(20);
            question.setQ4YouthGroup2AmountReceived(20000);

            question.setQ4YouthGroup3Name("Men Love Me");
            question.setQ4YouthGroup3Village("Kijjabwemi");
            question.setQ4YouthGroup3MaleNumber(20);
            question.setQ4YouthGroup3FemaleNumber(5);
            question.setQ4YouthGroup3AmountReceived(2000);

            question.setQ4YouthGroup4Name("Man Of Gold");
            question.setQ4YouthGroup4Village("Kabalagala");
            question.setQ4YouthGroup4MaleNumber(45);
            question.setQ4YouthGroup4FemaleNumber(78);
            question.setQ4YouthGroup4AmountReceived(200000);

            question.setQ4YouthGroup5Name("Golden Trial");
            question.setQ4YouthGroup5Village("Kwekungula");
            question.setQ4YouthGroup5MaleNumber(56);
            question.setQ4YouthGroup5FemaleNumber(90);
            question.setQ4YouthGroup5AmountReceived(2000000);

            question.setQ4YouthGroup6Name("The Gread Man");
            question.setQ4YouthGroup6Village("Makerere Kavule");
            question.setQ4YouthGroup6MaleNumber(30);
            question.setQ4YouthGroup5FemaleNumber(30);
            question.setQ4YouthGroup6AmountReceived(30000);

            question.setQ4YouthGroup7Name("Total Grembet");
            question.setQ4YouthGroup7Village("Kimanya");
            question.setQ4YouthGroup7MaleNumber(89);
            question.setQ4YouthGroup7FemaleNumber(89);
            question.setQ4YouthGroup7AmountReceived(2000000);

            question.setQ5NumberMaleTrained(69);
            question.setQ5NumberFemaleTrained(89);
            question.setQ6CommunityGroupFormed("They are still in the process of forming them");
            question.setQ7OtherChallengesObservations("This data was generated by the computer, it took a lot og my time");

            ygbaRepository.saveSocialDevelopmentQuestion(question);
        }
    }
}