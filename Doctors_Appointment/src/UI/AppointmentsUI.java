package UI;

import Models.AppointmentsModels;
import Models.DoctorModels;

import java.util.*;

public class AppointmentsUI {
    Scanner scanner = new Scanner(System.in);
    List<AppointmentsModels> listaProgramari = new ArrayList<>();
    ManagementUI managementUI = new ManagementUI();

    public void appointments() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("1. Show appointments");
            System.out.println("2. Add appointment");
            System.out.println("3. Edit appointment");
            System.out.println("4. Delete appointment");
            System.out.println("0. Back");

            System.out.println("\n Selectati optiunea dorita: ");
            int choose4 = scanner.nextInt();
            scanner.nextLine();

            if (choose4 == 1) {
                showAppointments();
            } else if (choose4 == 2) {
                addAppointment();
            } else if (choose4 == 3) {
                editAppointment();
            } else if (choose4 == 4) {
                deleteAppointment();
            } else if (choose4 == 0) {
                managementUI.meniu();
            }

            if (choose4 < 0 || choose4 > 5) {
                System.out.println("Introduceti o optiune valida (0 - 5)");
                appointments();
            }
        }
    }

    public void addAppointment() {
        AppointmentsModels appointmentsModels = new AppointmentsModels();

        System.out.println("Introduceti numele pacientului: ");
        String nume = scanner.nextLine();

        System.out.println("Introduceti prenumele pacientului: ");
        String prenume = scanner.nextLine();

        System.out.println("Introduceti ora programarii: (ora [ENTER] minut [ENTER])");
        int ora = scanner.nextInt();
        int minute = scanner.nextInt();

        System.out.println("Introduceti data programarii: (zi [ENTER] luna [ENTER] an) ");
        int zi = scanner.nextInt();
        int luna = scanner.nextInt();
        int an = scanner.nextInt();

        appointmentsModels.setNume(nume);
        appointmentsModels.setPrenume(prenume);
        appointmentsModels.setOra(ora);
        appointmentsModels.setMinute(minute);
        appointmentsModels.setZi(zi);
        appointmentsModels.setLuna(luna);
        appointmentsModels.setAn(an);

        listaProgramari.add(appointmentsModels);
        System.out.println("Programare adaugata cu succes!");
    }

    public void showAppointments() {
        for (AppointmentsModels appointmentsModels : listaProgramari) {
            System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
        }
        if (listaProgramari.size() == 0) {
            System.out.println("Nicio programare gasita.");
        }
    }

    public void deleteAppointment() {
        for (AppointmentsModels appointmentsModels : listaProgramari) {
            System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
        }
        if (listaProgramari.size() > 0) {
            System.out.println("Alegeti numarul programarii pe care doriti sa o stergeti: ");
            int numarProgramare = -1;
            numarProgramare = scanner.nextInt();
            scanner.nextLine();
            if (numarProgramare == 1) {
                listaProgramari.remove(0);
            } else if (numarProgramare == 2) {
                listaProgramari.remove(1);
            } else if (numarProgramare == 3) {
                listaProgramari.remove(2);
            } else if (numarProgramare == 4) {
                listaProgramari.remove(3);
            } else if (numarProgramare == 5) {
                listaProgramari.remove(4);
            }
            System.out.println("Programare stearsa cu succes!");
            if (numarProgramare < 1 || numarProgramare > 5) {
                System.out.println("Introduceti o optiune valida (1 - 5)");
            }
        } else {
            System.out.println("Nicio programare gasita.");
        }
    }
    public void editAppointment(){
        if (listaProgramari.size() == 0){
            System.out.println("Nicio programare gasita.");
        } else{
            int optiune = -1;
            while (optiune != 0) {
                System.out.println("1. Editeaza numele");
                System.out.println("2. Editeaza prenumele");
                System.out.println("3. Editeaza ora");
                System.out.println("4. Editeaza minut");
                System.out.println("5. Editeaza zi");
                System.out.println("6. Editeaza luna");
                System.out.println("7. Editeaza an");
                System.out.println("0. Back");
                optiune = scanner.nextInt();
                scanner.nextLine();
                if (optiune == 1){
                    System.out.println("Introduceti numarul programarii in care doriti sa schimbati numele pacientului: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        appointmentsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        appointmentsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        appointmentsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        appointmentsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        appointmentsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    }
                } else if (optiune == 2){
                    System.out.println("Introduceti numarul programarii in care doriti sa schimbati prenumele pacientului: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        appointmentsModels.setPrenume(prenumeNou);
                        System.out.println("Preumele a fost schimbat cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        appointmentsModels.setPrenume(prenumeNou);
                        System.out.println("Preumele a fost schimbat cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        appointmentsModels.setPrenume(prenumeNou);
                        System.out.println("Preumele a fost schimbat cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        appointmentsModels.setPrenume(prenumeNou);
                        System.out.println("Preumele a fost schimbat cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        appointmentsModels.setPrenume(prenumeNou);
                        System.out.println("Preumele a fost schimbat cu succes!");
                    }
                } else if (optiune == 3){
                    System.out.println("Introduceti numarul programarii la care doriti sa schimbati ora: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noua ora: ");
                        int oraNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setOra(oraNoua);
                        System.out.println("Ora a fost schimbata cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noua ora: ");
                        int oraNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setOra(oraNoua);
                        System.out.println("Ora a fost schimbata cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noua ora: ");
                        int oraNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setOra(oraNoua);
                        System.out.println("Ora a fost schimbata cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noua ora: ");
                        int oraNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setOra(oraNoua);
                        System.out.println("Ora a fost schimbata cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noua ora: ");
                        int oraNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setOra(oraNoua);
                        System.out.println("Ora a fost schimbata cu succes!");
                    }
                } else if (optiune == 4){
                    System.out.println("Introduceti numarul programarii la care doriti sa schimbati minutele: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noul minut: ");
                        int minutNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setMinute(minutNou);
                        System.out.println("Minutele au fost schimbate cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noul minut: ");
                        int minutNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setMinute(minutNou);
                        System.out.println("Minutele au fost schimbate cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noul minut: ");
                        int minutNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setMinute(minutNou);
                        System.out.println("Minutele au fost schimbate cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noul minut: ");
                        int minutNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setMinute(minutNou);
                        System.out.println("Minutele au fost schimbate cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noul minut: ");
                        int minutNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setMinute(minutNou);
                        System.out.println("Minutele au fost schimbate cu succes!");
                    }
                } else if (optiune == 5) {
                    System.out.println("Introduceti numarul programarii la care doriti sa schimbati ziua: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noua zi: ");
                        int ziNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setZi(ziNoua);
                        System.out.println("Ziua a fost schimbata cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noua zi: ");
                        int ziNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setZi(ziNoua);
                        System.out.println("Ziua a fost schimbata cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noua zi: ");
                        int ziNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setZi(ziNoua);
                        System.out.println("Ziua a fost schimbata cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noua zi: ");
                        int ziNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setZi(ziNoua);
                        System.out.println("Ziua a fost schimbata cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noua zi: ");
                        int ziNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setZi(ziNoua);
                        System.out.println("Ziua a fost schimbata cu succes!");
                    }
                } else if (optiune == 6){
                    System.out.println("Introduceti numarul programarii la care doriti sa schimbati luna: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noua luna: ");
                        int lunaNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setLuna(lunaNoua);
                        System.out.println("Luna a fost schimbata cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noua luna: ");
                        int lunaNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setLuna(lunaNoua);
                        System.out.println("Luna a fost schimbata cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noua luna: ");
                        int lunaNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setLuna(lunaNoua);
                        System.out.println("Luna a fost schimbata cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noua luna: ");
                        int lunaNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setLuna(lunaNoua);
                        System.out.println("Luna a fost schimbata cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noua luna: ");
                        int lunaNoua = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setLuna(lunaNoua);
                        System.out.println("Luna a fost schimbata cu succes!");
                    }
                } else if (optiune == 7){
                    System.out.println("Introduceti numarul programarii la care doriti sa schimbati anul: ");
                    for (AppointmentsModels appointmentsModels : listaProgramari) {
                        System.out.println(appointmentsModels.getNume() + " " + appointmentsModels.getPrenume() + " - " + appointmentsModels.getOra() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getZi() + "/" + appointmentsModels.getLuna() + "/" + appointmentsModels.getAn());
                    }
                    int numarProgramare = scanner.nextInt();
                    scanner.nextLine();
                    if (numarProgramare == 1){
                        AppointmentsModels appointmentsModels = listaProgramari.get(0);
                        listaProgramari.get(0);
                        System.out.println("Introduceti noul an: ");
                        int anNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setAn(anNou);
                        System.out.println("Anul a fost schimbat cu succes!");
                    } else if (numarProgramare == 2){
                        AppointmentsModels appointmentsModels = listaProgramari.get(1);
                        listaProgramari.get(1);
                        System.out.println("Introduceti noul an: ");
                        int anNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setAn(anNou);
                        System.out.println("Anul a fost schimbat cu succes!");
                    } else if (numarProgramare == 3){
                        AppointmentsModels appointmentsModels = listaProgramari.get(2);
                        listaProgramari.get(2);
                        System.out.println("Introduceti noul an: ");
                        int anNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setAn(anNou);
                        System.out.println("Anul a fost schimbat cu succes!");
                    } else if (numarProgramare == 4){
                        AppointmentsModels appointmentsModels = listaProgramari.get(3);
                        listaProgramari.get(3);
                        System.out.println("Introduceti noul an: ");
                        int anNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setAn(anNou);
                        System.out.println("Anul a fost schimbat cu succes!");
                    } else if (numarProgramare == 5){
                        AppointmentsModels appointmentsModels = listaProgramari.get(4);
                        listaProgramari.get(4);
                        System.out.println("Introduceti noul an: ");
                        int anNou = scanner.nextInt();
                        scanner.nextLine();
                        appointmentsModels.setAn(anNou);
                        System.out.println("Anul a fost schimbat cu succes!");
                    }
                } else if (optiune == 0){
                    appointments();
                }
            }
        }
    }
}
