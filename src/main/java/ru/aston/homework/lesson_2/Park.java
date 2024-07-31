package ru.aston.homework.lesson_2;
/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
информацию об аттракционах, времени их работы и стоимости.
 */
public class Park {
    private String namePark;
    Attraction[] attractions;

    public Park(String namePark) {

        this.namePark = namePark;
    }
    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public String getNamePark() {
        return namePark;
    }

    public class Attraction {
        private String nameAttraction;
        private String timeWork;
        private Integer price;
       public String getNameAttraction() {
           return nameAttraction;
       }

       public String getTimeWork() {
           return timeWork;
       }

       public Integer getPrice() {
           return price;
       }
        public Attraction(String nameAttraction, String timeWork, Integer price) {
            this.nameAttraction = nameAttraction;
            this.timeWork = timeWork;
            this.price = price;
        }
     /*   public String toString() {
           return "Информация о отракционе: " + '\n' +
                   "Расположен в "+ Park.this.namePark + '\n' +
                   "Аттракцион - " + Attraction.this.nameAttraction + '\n' +
                   "Время работы: " + Attraction.this.timeWork + '\n' +
                   "Стоимость билета: " + Attraction.this.price;
       }*/
    }
}
