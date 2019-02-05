package oop;

public class Car {
    private boolean isEngineRunning;
    private String name;
    private int amountOfFuel;
    private int maxSpeed;

    public Car(String name, int amountOfFuel, int maxSpeed) {
        this.name = name;
        this.amountOfFuel = amountOfFuel;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        //если есть бензин в баке
        // то заводим двигатель
        // в isEngineRunning записываем true и выводим сообщение "завели двигатель"
        // если нет бензина, то выводи сообщение "нет бензина"
        if (isEngineRunning) {
            System.out.println("уже заведен");
        } else {
            if (amountOfFuel > 0) {
                isEngineRunning = true;
                System.out.println("завели двигатель");
            } else {
                System.out.println("нет бензина");
            }
        }
    }
//
//    public void go() {
//        //если двигатель заглушен, то попробуй заведи
//        //если не получилось завести, то выведи сообщение "не едем"
//        //если завели или он был ранее заведен, то выведи сообщение "ура! едем"
//        if (isEngineRunning == false) {
//            startEngine();
//        }
//        if (isEngineRunning == true) {
//            System.out.println("ура! едем");
//        } else {
//            System.out.println("не едем");
//        }
//    }
//
//    public void go(boolean withSpeedLimit) {
//        //если есть ограничение скорости, то едем как обычно, go()
//        //если нет ограничения скорости, то едем с максимальной скоростью, выводим в конце после "ура! едем"
//        //еще строчку "разгоняемся до максимальной скорости Н км\ч" где Н - maxSpeed
//        go();
//        if (withSpeedLimit == false && isEngineRunning == true) {
//            System.out.println("разгоняемся до максимальной скорости " + maxSpeed + " км\\ч");
//        }
//    }


    public void go() {
        //если двигатель заглушен, то попробуй заведи
        //если не получилось завести, то выведи сообщение "не едем"
        //если завели или он был ранее заведен, то выведи сообщение "ура! едем"
        go(true);
    }

    public void go(boolean withSpeedLimit) {
        //если есть ограничение скорости, то едем как обычно, go()
        //если нет ограничения скорости, то едем с максимальной скоростью, выводим в конце после "ура! едем"
        //еще строчку "разгоняемся до максимальной скорости Н км\ч" где Н - maxSpeed
        if (isEngineRunning == false) {
            startEngine();
        }
        if (isEngineRunning == true) {
            System.out.println("ура! едем");
            if (withSpeedLimit == false) {
                System.out.println("разгоняемся до максимальной скорости " + maxSpeed + " км\\ч");
            }
        } else {
            System.out.println("не едем");
        }
    }

    public void addMoreFuel(int liters) {
        //долить бензин в бак
        amountOfFuel = amountOfFuel + liters;
        System.out.println("долил в бак топлива литров " + liters);
    }
}
