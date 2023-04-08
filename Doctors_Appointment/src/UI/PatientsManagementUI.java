package UI;

import Models.DoctorModels;
import Models.PatientsModels;

import java.util.*;

public class PatientsManagementUI {
    Scanner scanner = new Scanner(System.in);
    List<PatientsModels> listaPacienti = new ArrayList<>();
    ManagementUI managementUI = new ManagementUI();

    public void meniuPatients() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("1. Show patients list");
            System.out.println("2. Add patient");
            System.out.println("3. Edit patient");
            System.out.println("4. Delete patient");
            System.out.println("0. Back");

            System.out.println("\n Selectati optiunea dorita: ");
            int choose3 = scanner.nextInt();
            scanner.nextLine();

            if (choose3 == 1) {
                showPatients();
            } else if (choose3 == 2) {
                addPatient();
            } else if (choose3 == 3) {
                editPatient();
            } else if (choose3 == 4) {
                deletePatient();
            } else if (choose3 == 0) {
                managementUI.meniu();
            }

            if (choose3 < 0 || choose3 > 4) {
                System.out.println("Introduceti o optiune valida (0 - 4)");
                meniuPatients();
            }
        }
    }

    public void addPatient() {
        PatientsModels patientsModels = new PatientsModels();

        System.out.println("Introduceti numele pacientului: ");
        String nume = scanner.nextLine();

        System.out.println("Introduceti prenumele pacientului: ");
        String prenume = scanner.nextLine();

        System.out.println("Introduceti diagnosticul pacientului: ");
        String diagnostic = scanner.nextLine();

        patientsModels.setNume(nume);
        patientsModels.setPrenume(prenume);
        patientsModels.setDiagnostic(diagnostic);

        listaPacienti.add(patientsModels);
        System.out.println("Pacient adaugat cu succes!");
    }

    public void showPatients() {
        for (PatientsModels patientsModels : listaPacienti) {
            System.out.println(patientsModels.getNume() + " " + patientsModels.getPrenume() + " - " + patientsModels.getDiagnostic());
        }
        if (listaPacienti.size() == 0) {
            System.out.println("Niciun pacient gasit.");
        }
    }

    public void deletePatient() {
        for (PatientsModels patientsModels : listaPacienti) {
            System.out.println(patientsModels.getNume() + " " + patientsModels.getPrenume() + " - " + patientsModels.getDiagnostic());
        }
        if (listaPacienti.size() > 0) {
            System.out.println("Alegeti numarul pacientului pe care doriti sa il stergeti: ");
            int numarPacient = -1;
            numarPacient = scanner.nextInt();
            scanner.nextLine();
            if (numarPacient == 1) {
                listaPacienti.remove(0);
            } else if (numarPacient == 2) {
                listaPacienti.remove(1);
            } else if (numarPacient == 3) {
                listaPacienti.remove(2);
            } else if (numarPacient == 4) {
                listaPacienti.remove(3);
            } else if (numarPacient == 5) {
                listaPacienti.remove(4);
            }
            System.out.println("Pacient sters cu succes!");
            if (numarPacient < 1 || numarPacient > 5) {
                System.out.println("Introduceti o optiune valida (1 - 5)");
            }
        } else {
            System.out.println("Niciun pacient gasit.");
        }
    }

    public void editPatient() {
        if (listaPacienti.size() == 0) {
            System.out.println("Niciun pacient gasit.");
        } else {
            int optiune = -1;
            while (optiune != 0) {
                System.out.println("1. Editeaza numele");
                System.out.println("2. Editeaza prenumele");
                System.out.println("3. Editeaza diagnosticul");
                System.out.println("0. Back");
                optiune = scanner.nextInt();
                scanner.nextLine();
                if (optiune == 1) {
                    System.out.println("Introduceti numarul pacientului caruia doriti sa ii schimbati numele: ");
                    for (PatientsModels patientsModels : listaPacienti) {
                        System.out.println(patientsModels.getNume() + " " + patientsModels.getPrenume() + " - " + patientsModels.getDiagnostic());
                    }
                    int numarPacient = scanner.nextInt();
                    scanner.nextLine();
                    if (numarPacient == 1) {
                        PatientsModels patientsModels = listaPacienti.get(0);
                        listaPacienti.get(0);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        patientsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarPacient == 2) {
                        PatientsModels patientsModels = listaPacienti.get(1);
                        listaPacienti.get(1);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        patientsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarPacient == 3) {
                        PatientsModels patientsModels = listaPacienti.get(2);
                        listaPacienti.get(2);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        patientsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarPacient == 4) {
                        PatientsModels patientsModels = listaPacienti.get(3);
                        listaPacienti.get(3);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        patientsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    } else if (numarPacient == 5) {
                        PatientsModels patientsModels = listaPacienti.get(4);
                        listaPacienti.get(4);
                        System.out.println("Introduceti noul nume: ");
                        String numeNou = scanner.nextLine();
                        patientsModels.setNume(numeNou);
                        System.out.println("Numele a fost schimbat cu succes!");
                    }
                } else if (optiune == 2) {
                    System.out.println("Introduceti numarul pacientului caruia doriti sa ii schimbati prenumele: ");
                    for (PatientsModels patientsModels : listaPacienti) {
                        System.out.println(patientsModels.getNume() + " " + patientsModels.getPrenume() + " - " + patientsModels.getDiagnostic());
                    }
                    int numarPacient = scanner.nextInt();
                    scanner.nextLine();
                    if (numarPacient == 1) {
                        PatientsModels patientsModels = listaPacienti.get(0);
                        listaPacienti.get(0);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        patientsModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarPacient == 2) {
                        PatientsModels patientsModels = listaPacienti.get(1);
                        listaPacienti.get(1);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        patientsModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarPacient == 3) {
                        PatientsModels patientsModels = listaPacienti.get(2);
                        listaPacienti.get(2);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        patientsModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarPacient == 4) {
                        PatientsModels patientsModels = listaPacienti.get(3);
                        listaPacienti.get(3);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        patientsModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    } else if (numarPacient == 5) {
                        PatientsModels patientsModels = listaPacienti.get(4);
                        listaPacienti.get(4);
                        System.out.println("Introduceti noul prenume: ");
                        String prenumeNou = scanner.nextLine();
                        patientsModels.setPrenume(prenumeNou);
                        System.out.println("Prenumele a fost schimbat cu succes!");
                    }
                } else if (optiune == 3) {
                    System.out.println("Introduceti numarul pacientului caruia doriti sa ii schimbati diagnosticul: ");
                    for (PatientsModels patientsModels : listaPacienti) {
                        System.out.println(patientsModels.getNume() + " " + patientsModels.getPrenume() + " - " + patientsModels.getDiagnostic());
                    }
                    int numarPacient = scanner.nextInt();
                    scanner.nextLine();
                    if (numarPacient == 1) {
                        PatientsModels patientsModels = listaPacienti.get(0);
                        listaPacienti.get(0);
                        System.out.println("Introduceti noul diagnostic: ");
                        String diagnosticNou = scanner.nextLine();
                        patientsModels.setDiagnostic(diagnosticNou);
                        System.out.println("Diagnosticul a fost schimbat cu succes!");
                    } else if (numarPacient == 2) {
                        PatientsModels patientsModels = listaPacienti.get(1);
                        listaPacienti.get(1);
                        System.out.println("Introduceti noul diagnostic: ");
                        String diagnosticNou = scanner.nextLine();
                        patientsModels.setDiagnostic(diagnosticNou);
                        System.out.println("Diagnosticul a fost schimbat cu succes!");
                    } else if (numarPacient == 3) {
                        PatientsModels patientsModels = listaPacienti.get(2);
                        listaPacienti.get(2);
                        System.out.println("Introduceti noul diagnostic: ");
                        String diagnosticNou = scanner.nextLine();
                        patientsModels.setDiagnostic(diagnosticNou);
                        System.out.println("Diagnosticul a fost schimbat cu succes!");
                    } else if (numarPacient == 4) {
                        PatientsModels patientsModels = listaPacienti.get(3);
                        listaPacienti.get(3);
                        System.out.println("Introduceti noul diagnostic: ");
                        String diagnosticNou = scanner.nextLine();
                        patientsModels.setDiagnostic(diagnosticNou);
                        System.out.println("Diagnosticul a fost schimbat cu succes!");
                    } else if (numarPacient == 5) {
                        PatientsModels patientsModels = listaPacienti.get(4);
                        listaPacienti.get(4);
                        System.out.println("Introduceti noul diagnostic: ");
                        String diagnosticNou = scanner.nextLine();
                        patientsModels.setDiagnostic(diagnosticNou);
                        System.out.println("Diagnosticul a fost schimbat cu succes!");
                    }
                } else if (optiune == 0) {
                    meniuPatients();
                }
            }
        }
    }
}
