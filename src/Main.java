
import PhonePack.*; // Импортируем наш пэкэдж



public class Main {
    public static void main(String[] args) {
    // Тип(класс) Название(Instance)     Инизиализация
        Phone          phonePrimer = new Phone(8777_777_77_77L, "Iphone 104", 120);

        Phone phone1 = new Phone(8777_777_77_77L, "Iphone 105", 120);
        Phone phone4 = new Phone(8777_777_77_77L, "Iphone 104", 120);


        System.out.println(phone1.equals(phone4));


        Phone phone2 = new Phone(8777_777_77_79L, "Samsung z fold 5", 200);
        Phone phone3 = new Phone(8777_777_77_78L, "Nothing 0", 80);



//        phone2.sendMessage(phone1.getNumber(), phone3.getNumber());

//        Long[] numbers = new Long[]{phone1.getNumber(), phone3.getNumber()};
//        phone2.sendMessage(numbers);

//        System.out.println(phone1.toString());
//        System.out.println(phone2.toString());
//        System.out.println(phone3.toString());

    }
}

