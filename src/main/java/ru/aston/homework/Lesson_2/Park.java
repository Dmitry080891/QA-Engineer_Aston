package ru.aston.homework.Lesson_2;
/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
информацию об аттракционах, времени их работы и стоимости.
 */
public class Park {
    public String namePark;

    public Park(String namePark) {
        this.namePark = namePark;
    }
    public class Attraction {
        public String nameAttraction;
        public String timeWork;
        public Integer price;

        public Attraction(String nameAttraction, String timeWork, Integer price) {
            this.nameAttraction = nameAttraction;
            this.timeWork = timeWork;
            this.price = price;
        }
        public void getAttractionParam() {

            System.out.println("Информация о отракционе: " + '\n' +
                    "Расположен в "+ Park.this.namePark + '\n' +
                    "Аттракцион - " + Attraction.this.nameAttraction + '\n' +
                    "Время работы: " + Attraction.this.timeWork + '\n' +
                    "Стоимость билета: " + Attraction.this.price);
        }
    }
}
