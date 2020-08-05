package org.ygba.youthgobudget.data_seeders;

import android.app.Application;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

public class Seeder {
    YGBARepository ygbaRepository;
    Seeder(Application application) {
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }
    public void seed() {

    }

    public void seedAgriculture() {
        for (int i = 0; i < 20; i++) {
            AgricultureQuestion agricultureQuestion = new AgricultureQuestion(
                    "2020-2021",
                    "02--03-2020",
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
}