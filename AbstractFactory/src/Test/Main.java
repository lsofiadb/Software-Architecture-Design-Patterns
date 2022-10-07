package Test;

import java.util.Scanner;

import Cars.Car;
import Factories.VehicleFactory;
import SUV.SUV;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Ejemplos
        // VehicleFactory luxuryFactory = VehicleFactory.getVehicleFactory("Luxury");
        // VehicleFactory nonLuxuryFactory = VehicleFactory.getVehicleFactory("Non-Luxury");

        // Car lambo = luxuryFactory.getCar();
        // System.out.println("Carro lujoso - modelo: " + lambo.getCarName());
        // System.out.println("Carro lujoso - features: " + lambo.getCarFeatures());
        
        // SUV jeep = luxuryFactory.getSUV();
        // System.out.println("SUV lujoso - modelo: " + jeep.getSUVName());
        // System.out.println("SUV lujoso - features: " + jeep.getSUVFeatures());

        // Car renault = nonLuxuryFactory.getCar();
        // System.out.println("Carro NO lujoso - modelo:" + renault.getCarName());
        // System.out.println("Carro NO lujoso - features:" + renault.getCarFeatures());

        // SUV nissan = nonLuxuryFactory.getSUV();
        // System.out.println("SUV NO lujoso - modelo: " + nissan.getSUVName());
        // System.out.println("SUV NO lujoso - features: " + nissan.getSUVFeatures());

        System.out.println("************MENU DE CREACIÓN DE VEHICULO************");
        System.out.println("Escoge la fabrica");
        System.out.println("1. Fabrica lujosa");
        System.out.println("2. Fabrica NO lujosa");
        int opcion = scan.nextInt();
        if(opcion == 1){
            VehicleFactory newLuxuryFactory = VehicleFactory.getVehicleFactory("Luxury");
            System.out.println("Escoge el tipo de vehiculo");
            System.out.println("1. Car");
            System.out.println("2. SUV");
            int tipo = scan.nextInt();

            if(tipo == 1){
                Car mercedes = newLuxuryFactory.getCar();
                System.out.println("La información de su nuevo carro lujoso es:");
                System.out.println("Carro lujoso - modelo: " + mercedes.getCarName());
                System.out.println("Carro lujoso - features: " + mercedes.getCarFeatures());
            }
            else if(tipo == 2){
                SUV toyota = newLuxuryFactory.getSUV();
                System.out.println("La información de su nuevo SUV lujoso es:");
                System.out.println("SUV lujoso - modelo: " + toyota.getSUVName());
                System.out.println("SUV lujoso - features: " + toyota.getSUVFeatures());
            }
            else{
                System.out.println("Ingrese una opción corecta");
            }
        }
        
        else if(opcion == 2){
            VehicleFactory newNonLuxuryFactory = VehicleFactory.getVehicleFactory("Non-Luxury");
            System.out.println("Escoge el tipo de vehiculo");
            System.out.println("1. Car");
            System.out.println("2. SUV");
            int tipo = scan.nextInt();

            if(tipo == 1){
                Car hyundai = newNonLuxuryFactory.getCar();
                System.out.println("La información de su nuevo carro NO lujoso es:");
                System.out.println("Carro NO lujoso - modelo: " + hyundai.getCarName());
                System.out.println("Carro NO lujoso - features: " + hyundai.getCarFeatures());
            }
            else if(tipo == 2){
                SUV chevrolet = newNonLuxuryFactory.getSUV();
                System.out.println("La información de su nuevo SUV NO lujoso es:");
                System.out.println("SUV NO lujoso - modelo: " + chevrolet.getSUVName());
                System.out.println("SUV NO lujoso - features: " + chevrolet.getSUVFeatures());
            }
            else{
                System.out.println("Ingrese una opción corecta");
            }
        }
        else{
            System.out.println("Ingrese una opción correcta");
        }

        scan.close();
    }
}