package UI;

import Models.PatientsModels;

import java.util.*;

public class PatientsManagementUI {
    Scanner scanner = new Scanner(System.in);
    List<PatientsModels> patientsList = new ArrayList<>();
    ManagementUI managementUI = new ManagementUI();

    public void patientsMenu() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("1. Show patients list");
            System.out.println("2. Add patient");
            System.out.println("3. Edit patient");
            System.out.println("4. Delete patient");
            System.out.println("0. Back");

            System.out.println("\n" + "Select your option ");
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
                managementUI.menu();
            }

            if (choose3 < 0 || choose3 > 4) {
                System.out.println("Please use a valid option (0 - 4)");
                patientsMenu();
            }
        }
    }

    public void addPatient() {
        PatientsModels patientsModels = new PatientsModels();

        System.out.println("Insert patient's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Insert patient's last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Insert patient's diagnosis: ");
        String diagnosis = scanner.nextLine();

        patientsModels.setFirstName(firstName);
        patientsModels.setLastName(lastName);
        patientsModels.setDiagnosis(diagnosis);

        patientsList.add(patientsModels);
        System.out.println("Patient successfully added!");
    }

    public void showPatients() {
        for (PatientsModels patientsModels : patientsList) {
            System.out.println(patientsModels.getFirstName() + " " + patientsModels.getLastName() + " - " + patientsModels.getDiagnosis());
        }
        if (patientsList.size() == 0) {
            System.out.println("No patients found.");
        }
    }

    public void deletePatient() {
        for (PatientsModels patientsModels : patientsList) {
            System.out.println(patientsModels.getFirstName() + " " + patientsModels.getLastName() + " - " + patientsModels.getDiagnosis());
        }
        if (patientsList.size() > 0) {
            System.out.println("Choose a patient number to delete: ");
            int patientNumber = -1;
            patientNumber = scanner.nextInt();
            scanner.nextLine();
            if (patientNumber == 1) {
                patientsList.remove(0);
            } else if (patientNumber == 2) {
                patientsList.remove(1);
            } else if (patientNumber == 3) {
                patientsList.remove(2);
            } else if (patientNumber == 4) {
                patientsList.remove(3);
            } else if (patientNumber == 5) {
                patientsList.remove(4);
            }
            System.out.println("Patient successfully removed!");
            if (patientNumber < 1 || patientNumber > 5) {
                System.out.println("Please use a valid option (1 - 5)");
            }
        } else {
            System.out.println("No patients found.");
        }
    }

    public void editPatient() {
        if (patientsList.size() == 0) {
            System.out.println("No patients found.");
        } else {
            int option = -1;
            while (option != 0) {
                System.out.println("1. Edit first name");
                System.out.println("2. Edit last name");
                System.out.println("3. Edit diagnosis");
                System.out.println("0. Back");
                option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    System.out.println("\n" + "Enter the patient number in which you want to change the first name: ");
                    for (PatientsModels patientsModels : patientsList) {
                        System.out.println(patientsModels.getFirstName() + " " + patientsModels.getLastName() + " - " + patientsModels.getDiagnosis());
                    }
                    int patientNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (patientNumber == 1) {
                        PatientsModels patientsModels = patientsList.get(0);
                        patientsList.get(0);
                        System.out.println("Insert the new first name: ");
                        String newFirstName = scanner.nextLine();
                        patientsModels.setFirstName(newFirstName);
                        System.out.println("First name successfully changed!");
                    } else if (patientNumber == 2) {
                        PatientsModels patientsModels = patientsList.get(1);
                        patientsList.get(1);
                        System.out.println("Insert the new first name: ");
                        String newFirstName = scanner.nextLine();
                        patientsModels.setFirstName(newFirstName);
                        System.out.println("First name successfully changed!");
                    } else if (patientNumber == 3) {
                        PatientsModels patientsModels = patientsList.get(2);
                        patientsList.get(2);
                        System.out.println("Insert the new first name: ");
                        String newFirstName = scanner.nextLine();
                        patientsModels.setFirstName(newFirstName);
                        System.out.println("First name successfully changed!");
                    } else if (patientNumber == 4) {
                        PatientsModels patientsModels = patientsList.get(3);
                        patientsList.get(3);
                        System.out.println("Insert the new first name: ");
                        String newFirstName = scanner.nextLine();
                        patientsModels.setFirstName(newFirstName);
                        System.out.println("First name successfully changed!");
                    } else if (patientNumber == 5) {
                        PatientsModels patientsModels = patientsList.get(4);
                        patientsList.get(4);
                        System.out.println("Insert the new first name: ");
                        String newFirstName = scanner.nextLine();
                        patientsModels.setFirstName(newFirstName);
                        System.out.println("First name successfully changed!");
                    }
                } else if (option == 2) {
                    System.out.println("\n" + "Enter the patient number in which you want to change the last name: ");
                    for (PatientsModels patientsModels : patientsList) {
                        System.out.println(patientsModels.getFirstName() + " " + patientsModels.getLastName() + " - " + patientsModels.getDiagnosis());
                    }
                    int patientNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (patientNumber == 1) {
                        PatientsModels patientsModels = patientsList.get(0);
                        patientsList.get(0);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        patientsModels.setLastName(newLastName);
                        System.out.println("Last name successfully changed!");
                    } else if (patientNumber == 2) {
                        PatientsModels patientsModels = patientsList.get(1);
                        patientsList.get(1);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        patientsModels.setLastName(newLastName);
                        System.out.println("Last name successfully changed!");
                    } else if (patientNumber == 3) {
                        PatientsModels patientsModels = patientsList.get(2);
                        patientsList.get(2);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        patientsModels.setLastName(newLastName);
                        System.out.println("Last name successfully changed!");
                    } else if (patientNumber == 4) {
                        PatientsModels patientsModels = patientsList.get(3);
                        patientsList.get(3);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        patientsModels.setLastName(newLastName);
                        System.out.println("Last name successfully changed!");
                    } else if (patientNumber == 5) {
                        PatientsModels patientsModels = patientsList.get(4);
                        patientsList.get(4);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        patientsModels.setLastName(newLastName);
                        System.out.println("Last name successfully changed!");
                    }
                } else if (option == 3) {
                    System.out.println("\n" + "Enter the patient number in which you want to change the diagnosis: ");
                    for (PatientsModels patientsModels : patientsList) {
                        System.out.println(patientsModels.getFirstName() + " " + patientsModels.getLastName() + " - " + patientsModels.getDiagnosis());
                    }
                    int patientNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (patientNumber == 1) {
                        PatientsModels patientsModels = patientsList.get(0);
                        patientsList.get(0);
                        System.out.println("Insert the new diagnosis: ");
                        String newDiagnosis = scanner.nextLine();
                        patientsModels.setDiagnosis(newDiagnosis);
                        System.out.println("Diagnosis successfully changed!");
                    } else if (patientNumber == 2) {
                        PatientsModels patientsModels = patientsList.get(1);
                        patientsList.get(1);
                        System.out.println("Insert the new diagnosis: ");
                        String newDiagnosis = scanner.nextLine();
                        patientsModels.setDiagnosis(newDiagnosis);
                        System.out.println("Diagnosis successfully changed!");
                    } else if (patientNumber == 3) {
                        PatientsModels patientsModels = patientsList.get(2);
                        patientsList.get(2);
                        System.out.println("Insert the new diagnosis: ");
                        String newDiagnosis = scanner.nextLine();
                        patientsModels.setDiagnosis(newDiagnosis);
                        System.out.println("Diagnosis successfully changed!");
                    } else if (patientNumber == 4) {
                        PatientsModels patientsModels = patientsList.get(3);
                        patientsList.get(3);
                        System.out.println("Insert the new diagnosis: ");
                        String newDiagnosis = scanner.nextLine();
                        patientsModels.setDiagnosis(newDiagnosis);
                        System.out.println("Diagnosis successfully changed!");
                    } else if (patientNumber == 5) {
                        PatientsModels patientsModels = patientsList.get(4);
                        patientsList.get(4);
                        System.out.println("Insert the new diagnosis: ");
                        String newDiagnosis = scanner.nextLine();
                        patientsModels.setDiagnosis(newDiagnosis);
                        System.out.println("Diagnosis successfully changed!");
                    }
                } else if (option == 0) {
                    patientsMenu();
                }
            }
        }
    }
}
