public class Main {
    public static void main(String[] args) {
        byte Byte = 0;
        short Short = 1;
        int Int = 2;
        long Long = 3;
        float Float = 0.5f;
        double Double = 1.5d;

        System.out.println("Задание 1:");
        System.out.println("Значение переменной Byte с типом byte равно " + Byte);
        System.out.println("Значение переменной Short с типом short равно " + Short);
        System.out.println("Значение переменной Int с типом int равно " + Int);
        System.out.println("Значение переменной Long с типом long равно " + Long);
        System.out.println("Значение переменной Float с типом float равно " + Float);
        System.out.println("Значение переменной Double с типом double равно " + Double);

        System.out.println(" ");

        short LP = 23;
        short AS = 27;
        short EA = 30;
        short Papers = 480;
        int PersonalNum = Papers/(LP+AS+EA);
        System.out.println("Задание 3:");
        System.out.println("На каждого ученика рассчитано " + PersonalNum + " листов бумаги.");

        System.out.println(" ");

        short Bottles = 16;
        short PerMinute = 2;
        short Minuts1 = 20;
        short Minuts2 = 24 * 60;
        short Minuts3 = 24 * 60 * 3;
        int Minuts4 = 24 * 60 * 30;
        int Total;
        System.out.println("Задание 4:");
        Total = Minuts1 * Bottles/PerMinute;
        System.out.println("За 20 минут машина произведет " + Total + " бутылок");
        Total = Minuts2 * Bottles/PerMinute;
        System.out.println("За сутки машина произведет " + Total + " бутылок");
        Total = Minuts3 * Bottles/PerMinute;
        System.out.println("За 3 суток машина произведет " + Total + " бутылок");
        Total = Minuts4 * Bottles/PerMinute;
        System.out.println("За месяц машина произведет " + Total + " бутылок");

        System.out.println(" ");

        short WhiteForOne = 2;
        short BrounForOne = 4;
        short ForSchool = 120;
        int ClassesNum = ForSchool/(WhiteForOne+BrounForOne);
        int WhiteForSchool = ClassesNum*WhiteForOne;
        int BrounForSchool = ClassesNum*BrounForOne;
        System.out.println("Задание 5:");
        System.out.println("В школе, где " +ClassesNum+ " классов, нужно " +WhiteForSchool+ " банок белой краски и " +BrounForSchool+ " банок коричневой краски.");

        System.out.println(" ");

        short BananaWeight = 80;
        short BananaNum = 5;
        short MilkWeight = 105;
        short MilkNum = 2;
        short IceCreamWeight = 100;
        short IceCreamNum = 2;
        short EggWeight = 70;
        short EggNum = 4;
        float TotalWeight = BananaWeight*BananaNum + MilkWeight*MilkNum + IceCreamWeight*IceCreamNum + EggWeight*EggNum;
        TotalWeight /= 1000;
        System.out.println("Задание 6:");
        System.out.println("Итоговая масса: " +TotalWeight+ " кг.");

        System.out.println(" ");

        short Min = 250;
        short Max = 500;
        short Overage = 7000;
        int MaxDaysNum = Overage/Min;
        System.out.println("Задание 7:");
        System.out.println("Наибольшее количество дней : " +MaxDaysNum);
        int MinDaysNum = Overage/Max;
        System.out.println("Наименьшее количество дней : " +MinDaysNum);
        int AverageDaysNum = (MaxDaysNum+MinDaysNum)/2;
        System.out.println("Среднее количество дней : " +AverageDaysNum);

        System.out.println(" ");

        float Coefficient = 0.1f;
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        float Defferense;
        Defferense = Masha*Coefficient*12;
        Masha *= Coefficient+1;
        System.out.println("Задание 8:");
        System.out.println("Теперь Маша получает " + Masha + " рублей. Годовой доход вырос на " + Defferense + " рублей.");
        Defferense = Denis*Coefficient*12;
        Denis *= Coefficient+1;
        System.out.println("Теперь Денис получает " + Denis + " рублей. Годовой доход вырос на " + Defferense + " рублей.");
        Defferense = Kristina*Coefficient*12;
        Kristina *= Coefficient+1;
        System.out.println("Теперь Кристина получает " + Kristina + " рублей. Годовой доход вырос на " + Defferense + " рублей.");
    }
}