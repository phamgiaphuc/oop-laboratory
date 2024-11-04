package org.example.mid_2024.question3;

public class DeliverySystem {
    public static void main(String[] args) {
        MyDeli();
    }

    public static void MyDeli() {
        Driver d1 = new Driver("Tuan");
        Driver d2 = new Driver("Phuc");
        Client c1 = new Client("Han");
        Client c2 = new Client("Huong");

        /**
         * Câu b
         */
        Service c1FoodDelivery = new Service(ServiceType.FoodDelivery, 2);
        Service c1ExpressDelivery = new Service(ServiceType.ExpressDelivery, 5);
        Service c2ExpressDelivery = new Service(ServiceType.ExpressDelivery, 10);

        c1.bookService(c1FoodDelivery);
        c1.bookService(c1ExpressDelivery);
        c2.bookService(c2ExpressDelivery);

        d1.acceptService(c1FoodDelivery);

        c1.showServiceStatus();

        d2.acceptService(c1ExpressDelivery);
        d2.finishService();
        d2.acceptService(c2ExpressDelivery);

        System.out.println(d1);
        System.out.println(d2);


        d1.finishService();
        d2.finishService();

        c2.showServiceStatus();

        /**
         * Câu c
         */
        Service c1InDayDelivery = new Service(ServiceType.InDayDelivery, 7);
        c1.bookService(c1InDayDelivery);

        Service c2InDayDelivery = new Service(ServiceType.InDayDelivery, 5);
        c2.bookService(c2InDayDelivery);

        Service combinedInDayDelivery = new Service(ServiceType.InDayDelivery, c1InDayDelivery.getDistance() + c2InDayDelivery.getDistance());

        if (c1InDayDelivery.getServiceStatus() == ServiceStatus.Booked && c2InDayDelivery.getServiceStatus() == ServiceStatus.Booked) {
            combinedInDayDelivery.setServiceStatus(ServiceStatus.Booked);
        }

        d1.acceptService(combinedInDayDelivery);

        System.out.println(d1);

        d1.finishService();

        System.out.println(d1);
    }
}
