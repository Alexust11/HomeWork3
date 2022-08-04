public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte clientOs = 1;// 1-для Android, 0-для iOS
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача 2
        // пересенная clientOs берется из задачи 1
        short clientDeviceYear = 2014;
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // Задача 3
        short yaer = 2000;
        if (yaer % 4 == 0)
            {if (yaer%100==0)
                {if (yaer%400==0) {System.out.println("Год високосный");}}
            else {System.out.println("Год високосный");}
            }
        else
        { System.out.println("Год не високосный");}
        if (yaer%100==0 && yaer%400!=0) {System.out.println("Год не високосный");}

        //задача 4
        int deliveryDistance=105;
        int step=40;
             if (deliveryDistance<=20) {System.out.println("Потребуется дней: 1");}
                else {System.out.println("Потребуется дней:"+((deliveryDistance-20)/40+2)); }


        //задача 5
        byte monthNumber=5;
                switch (monthNumber) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Не корректный номер месяца");
                }
        // Задача 6
        byte age=19;
        int salary=58000;
        double limit;
        if (age>=23) {limit=3*salary;}
            else {limit=2*salary;}
        if (salary>=50000 && salary<80000) {limit=limit*1.2;}
        if ( salary>=80000) {limit=limit*1.3;}
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+limit+" рублей");
        //Задача 7

        age=25;
        salary=60000;
        int wantedSum=330000;
        double stavka=10;
        double mountPlat;

        if (age<23){stavka=stavka+1;}
        if (age<30 && age >=23){stavka=stavka+0.5;}
        if (salary>80000){stavka=stavka-0.7;}
        mountPlat=(wantedSum+wantedSum*(stavka/100))/12;//расчет ежемесячного платежа
        if (mountPlat/salary<0.5) {System.out.println("Мы готовы выдать вам кредит.Ежемесячный платеж составляет "+mountPlat);}
            else {System.out.println("Мы не готовы выдать вам кредит. Ежемесячный платеж составляет "+mountPlat);}
    }

}



