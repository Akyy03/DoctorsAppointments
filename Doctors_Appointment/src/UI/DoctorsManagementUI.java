package UI;

import Models.DoctorModels;

import java.util.*;

public class DoctorsManagementUI {
    Scanner scanner = new Scanner(System.in);
    List<DoctorModels> listaDoctori = new ArrayList<>();
    ManagementUI managementUI = new ManagementUI();

    public void meniuDoctors() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("1. Show doctors list");
            System.out.println("2. Add doctor");
            System.out.println("3. Edit doctor");
            System.out.println("4. Delete doctor");
            System.out.println("0. Back");

            System.out.println("\n Selectati optiunea dorita: ");
            choose2 = scanner.nextInt();
            scanner.nextLine();

            if (choose2 == 1) {
                showDoctors();
            } else if (choose2 == 2) {
                addDoctor();
            } else if (choose2 == 3) {
                editDoctor();
            } else if (choose2 == 4) {
                deleteDoctor();
            } else if (choose2 == 0) {
                managementUI.meniu();
            }
            if (choose2 < 0 || choose2 > 4) {
                System.out.println("Introduceti o optiune valida (0 - 4)");
                managementUI.meniu();
            }
        }
    }

    public void addDoctor() {
        DoctorModels doctorModels = new DoctorModels();

        System.out.println("Introduceti numele doctorului: ");
        String nume = scanner.nextLine();

        System.out.println("Introduceti prenumele doctorului: ");
        String prenume = scanner.nextLine();

        System.out.println("Introduceti specializarea doctorului: ");
        String profession = scanner.nextLine();

        doctorModels.setNume(nume);
        doctorModels.setPrenume(prenume);
        doctorModels.setProfession(profession);

        listaDoctori.add(doctorModels);
        System.out.println("Doctor adaugat cu succes!");
    }

    public void showDoctors() {
        for (DoctorModels doctorModels : listaDoctori) {
            System.out.println(doctorModels.getNume() + " " + doctorModels.getPrenume() + " - " + doctorModels.getProfession());
        }
        if (listaDoctori.size() == 0) {
            System.out.println("Niciun doctor gasit.");
        }
    }

    public void deleteDoctor() {
        for (DoctorModels doctorModels : listaDoctori) {
            System.out.println(doctorModels.getNume() + " " + doctorModels.getPrenume() + " - " + doctorModels.getProfession());
        }
        if (listaDoctori.size() > 0) {
            System.out.println("Alegeti numarul doctorului pe care doriti sa il stergeti: ");
            int numarDoctor = -1;
            numarDoctor = scanner.nextInt();
            scanner.nextLine();
            if (numarDoctor == 1) {
                listaDoctori.remove(0);
            } else if (numarDoctor == 2) {
                listaDoctori.remove(1);
            } else if (numarDoctor == 3) {
                listaDoctori.remove(2);
            } else if (numarDoctor == 4) {
                listaDoctori.remove(3);
            } else if (numarDoctor == 5) {
                listaDoctori.remove(4);
            }
            System.out.println("Doctor sters cu succes!");
            if (numarDoctor < 1 || numarDoctor > 5) {
                System.out.println("Introduceti o optiune valida (1 - 5)");
            }
        } else {
            System.out.println("Niciun doctor gasit.");
        }
    }

    public void editDoctor() {
        if (listaDoctori.size() == 0) {
            System.out.println("Niciun doctor gasit.");
        } else {
            int optiune = -1;
            while (optiune != 0) {
                System.out.println("1. Editeaza numele");
                System.out.println("2. Editeaza prenumele");
                System.out.println("3. Editeaza specializarea");
                System.out.println("0. Back");
                optiune = scanner.nextInt();
                scanner.nextLine();
                if (optiune == 1) {
                    System.out.println("Introduceti numarul doctorului caruia doriti sa ii schimbati numele: ");
                    for (DoctorModels doctorModels : listaDoctori) {
                        System.out.println(doctorModels.getNume() + " " + doctorModels.getPrenume() + " - " + doctorModels.getProfession());
                    }
                    int numarDoctor = scanner.nextInt();
                    scanner.nextLine();
                    if (numarDoctor == 1) {
                        DoctorModels doctorModels = listaDoctori.get(0);
                        listaDoctori.get(0);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        doctorModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarDoctor == 2) {
                        DoctorModels doctorModels = listaDoctori.get(1);
                        listaDoctori.get(1);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        doctorModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarDoctor == 3) {
                        DoctorModels doctorModels = listaDoctori.get(2);
                        listaDoctori.get(2);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        doctorModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarDoctor == 4) {
                        DoctorModels doctorModels = listaDoctori.get(3);
                        listaDoctori.get(3);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        doctorModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarDoctor == 5) {
                        DoctorModels doctorModels = listaDoctori.get(4);
                        listaDoctori.get(4);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        doctorModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    }
                } else if (optiune == 2) {
                    System.out.println("Introduceti numarul doctorului caruia doriti sa ii schimbati prenumele: ");
                    for (DoctorModels doctorModels : listaDoctori) {
                        System.out.println(doctorModels.getNume() + " " + doctorModels.getPrenume() + " - " + doctorModels.getProfession());
                    }
                    int numarDoctor = scanner.nextInt();
                    scanner.nextLine();
                    if (numarDoctor == 1) {
                        DoctorModels doctorModels = listaDoctori.get(0);
                        listaDoctori.get(0);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        doctorModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarDoctor == 2) {
                        DoctorModels doctorModels = listaDoctori.get(1);
                        listaDoctori.get(1);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        doctorModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarDoctor == 3) {
                        DoctorModels doctorModels = listaDoctori.get(2);
                        listaDoctori.get(2);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        doctorModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarDoctor == 4) {
                        DoctorModels doctorModels = listaDoctori.get(3);
                        listaDoctori.get(3);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        doctorModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarDoctor == 5) {
                        DoctorModels doctorModels = listaDoctori.get(4);
                        listaDoctori.get(4);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        doctorModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    }
                } else if (optiune == 3) {
                    System.out.println("Introduceti numarul doctorului caruia doriti sa ii schimbati specializarea: ");
                    for (DoctorModels doctorModels : listaDoctori) {
                        System.out.println(doctorModels.getNume() + " " + doctorModels.getPrenume() + " - " + doctorModels.getProfession());
                    }
                    int numarDoctor = scanner.nextInt();
                    scanner.nextLine();
                    if (numarDoctor == 1) {
                        DoctorModels doctorModels = listaDoctori.get(0);
                        listaDoctori.get(0);
                        System.out.println("Introduceti noua specializare: ");
                        String specializareNoua = scanner.nextLine();
                        doctorModels.setProfession(specializareNoua);
                        System.out.println("Specializarea a fost schimbata cu succes!");
                    } else if (numarDoctor == 2) {
                        DoctorModels doctorModels = listaDoctori.get(1);
                        listaDoctori.get(1);
                        System.out.println("Introduceti noua specializare: ");
                        String specializareNoua = scanner.nextLine();
                        doctorModels.setProfession(specializareNoua);
                        System.out.println("Specializarea a fost schimbata cu succes!");
                    } else if (numarDoctor == 3) {
                        DoctorModels doctorModels = listaDoctori.get(2);
                        listaDoctori.get(2);
                        System.out.println("Introduceti noua specializare: ");
                        String specializareNoua = scanner.nextLine();
                        doctorModels.setProfession(specializareNoua);
                        System.out.println("Specializarea a fost schimbata cu succes!");
                    } else if (numarDoctor == 4) {
                        DoctorModels doctorModels = listaDoctori.get(3);
                        listaDoctori.get(3);
                        System.out.println("Introduceti noua specializare: ");
                        String specializareNoua = scanner.nextLine();
                        doctorModels.setProfession(specializareNoua);
                        System.out.println("Specializarea a fost schimbata cu succes!");
                    } else if (numarDoctor == 5) {
                        DoctorModels doctorModels = listaDoctori.get(4);
                        listaDoctori.get(4);
                        System.out.println("Introduceti noua specializare: ");
                        String specializareNoua = scanner.nextLine();
                        doctorModels.setProfession(specializareNoua);
                        System.out.println("Specializarea a fost schimbata cu succes!");
                    }
                } else if (optiune == 0) {
                    meniuDoctors();
                }
            }
        }
    }
}