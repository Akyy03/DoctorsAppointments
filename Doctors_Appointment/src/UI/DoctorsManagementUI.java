package UI;

import Models.DoctorModels;

import java.util.*;

public class DoctorsManagementUI {
    Scanner scanner = new Scanner(System.in);
    List<DoctorModels> doctorsList = new ArrayList<>();
    ManagementUI managementUI = new ManagementUI();

    public void doctorsMenu() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("1. Show doctors list");
            System.out.println("2. Add doctor");
            System.out.println("3. Edit doctor");
            System.out.println("4. Delete doctor");
            System.out.println("0. Back");

            System.out.println("\n Select your option: ");
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
                managementUI.menu(); 
            }
            if (choose2 < 0 || choose2 > 4) {
                System.out.println("Please use a valid option (0 - 4)");
                managementUI.menu(); 
            }
        }
    }

    public void addDoctor() {
        DoctorModels doctorModels = new DoctorModels();

        System.out.println("Insert doctor's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Insert doctor's last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Insert doctor's specialty: ");
        String specialty = scanner.nextLine();

        doctorModels.setFirstName(firstName);
        doctorModels.setLastName(lastName);
        doctorModels.setSpecialty(specialty);

        doctorsList.add(doctorModels);
        System.out.println("Doctor successfully added!");
    }

    public void showDoctors() {
        for (DoctorModels doctorModels : doctorsList) {
            System.out.println(doctorModels.getFirstName() + " " + doctorModels.getLastName() + " - " + doctorModels.getSpecialty());
        }
        if (doctorsList.size() == 0) {
            System.out.println("No doctors found.");
        }
    }

    public void deleteDoctor() {
        for (DoctorModels doctorModels : doctorsList) {
            System.out.println(doctorModels.getFirstName() + " " + doctorModels.getLastName() + " - " + doctorModels.getSpecialty());
        }
        if (doctorsList.size() > 0) {
            System.out.println("Choose a doctor number to delete: ");
            int doctorNumber = -1;
            doctorNumber = scanner.nextInt();
            scanner.nextLine();
            if (doctorNumber == 1) {
                doctorsList.remove(0);
            } else if (doctorNumber == 2) {
                doctorsList.remove(1);
            } else if (doctorNumber == 3) {
                doctorsList.remove(2);
            } else if (doctorNumber == 4) {
                doctorsList.remove(3);
            } else if (doctorNumber == 5) {
                doctorsList.remove(4);
            }
            System.out.println("Doctor successfully removed!");
            if (doctorNumber < 1 || doctorNumber > 5) {
                System.out.println("Please use a valid option (1 - 5)");
            }
        } else {
            System.out.println("No doctors found.");
        }
    }

    public void editDoctor() {
        if (doctorsList.size() == 0) {
            System.out.println("No doctors found.");
        } else {
            int option = -1;
            while (option != 0) {
                System.out.println("1. Edit first name");
                System.out.println("2. Edit last name");
                System.out.println("3. Edit specialty");
                System.out.println("0. Back");
                option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    System.out.println("\n" + "Enter the doctor number in which you want to change the first name: ");
                    for (DoctorModels doctorModels : doctorsList) {
                        System.out.println(doctorModels.getFirstName() + " " + doctorModels.getLastName() + " - " + doctorModels.getSpecialty());
                    }
                    int doctorNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (doctorNumber == 1) {
                        DoctorModels doctorModels = doctorsList.get(0);
                        doctorsList.get(0);
                        System.out.println("Insert the new first name: ");
                        String newName = scanner.nextLine();
                        doctorModels.setFirstName(newName);
                        System.out.println("First name successfully updated!");
                    } else if (doctorNumber == 2) {
                        DoctorModels doctorModels = doctorsList.get(1);
                        doctorsList.get(1);
                        System.out.println("Insert the new first name: ");
                        String newName = scanner.nextLine();
                        doctorModels.setFirstName(newName);
                        System.out.println("First name successfully updated!");
                    } else if (doctorNumber == 3) {
                        DoctorModels doctorModels = doctorsList.get(2);
                        doctorsList.get(2);
                        System.out.println("Insert the new first name: ");
                        String newName = scanner.nextLine();
                        doctorModels.setFirstName(newName);
                        System.out.println("First name successfully updated!");
                    } else if (doctorNumber == 4) {
                        DoctorModels doctorModels = doctorsList.get(3);
                        doctorsList.get(3);
                        System.out.println("Insert the new first name: ");
                        String newName = scanner.nextLine();
                        doctorModels.setFirstName(newName);
                        System.out.println("First name successfully updated!");
                    } else if (doctorNumber == 5) {
                        DoctorModels doctorModels = doctorsList.get(4);
                        doctorsList.get(4);
                        System.out.println("Insert the new first name: ");
                        String newName = scanner.nextLine();
                        doctorModels.setFirstName(newName);
                        System.out.println("First name successfully updated!");
                    }
                } else if (option == 2) {
                    System.out.println("\n" + "Enter the doctor number in which you want to change the last name: ");
                    for (DoctorModels doctorModels : doctorsList) {
                        System.out.println(doctorModels.getFirstName() + " " + doctorModels.getLastName() + " - " + doctorModels.getSpecialty());
                    }
                    int doctorNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (doctorNumber == 1) {
                        DoctorModels doctorModels = doctorsList.get(0);
                        doctorsList.get(0);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        doctorModels.setLastName(newLastName);
                        System.out.println("Last name successfully updated!");
                    } else if (doctorNumber == 2) {
                        DoctorModels doctorModels = doctorsList.get(1);
                        doctorsList.get(1);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        doctorModels.setLastName(newLastName);
                        System.out.println("Last name successfully updated!");
                    } else if (doctorNumber == 3) {
                        DoctorModels doctorModels = doctorsList.get(2);
                        doctorsList.get(2);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        doctorModels.setLastName(newLastName);
                        System.out.println("Last name successfully updated!");
                    } else if (doctorNumber == 4) {
                        DoctorModels doctorModels = doctorsList.get(3);
                        doctorsList.get(3);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        doctorModels.setLastName(newLastName);
                        System.out.println("Last name successfully updated!");
                    } else if (doctorNumber == 5) {
                        DoctorModels doctorModels = doctorsList.get(4);
                        doctorsList.get(4);
                        System.out.println("Insert the new last name: ");
                        String newLastName = scanner.nextLine();
                        doctorModels.setLastName(newLastName);
                        System.out.println("Last name successfully updated!");
                    }
                } else if (option == 3) {
                    System.out.println("\n" + "Enter the doctor number in which you want to change the specialty: ");
                    for (DoctorModels doctorModels : doctorsList) {
                        System.out.println(doctorModels.getFirstName() + " " + doctorModels.getLastName() + " - " + doctorModels.getSpecialty());
                    }
                    int doctorNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (doctorNumber == 1) {
                        DoctorModels doctorModels = doctorsList.get(0);
                        doctorsList.get(0);
                        System.out.println("Insert the new specialty: ");
                        String newSpecialty = scanner.nextLine();
                        doctorModels.setSpecialty(newSpecialty);
                        System.out.println("Specialty successfully updated!");
                    } else if (doctorNumber == 2) {
                        DoctorModels doctorModels = doctorsList.get(1);
                        doctorsList.get(1);
                        System.out.println("Insert the new specialty: ");
                        String newSpecialty = scanner.nextLine();
                        doctorModels.setSpecialty(newSpecialty);
                        System.out.println("Specialty successfully updated!");
                    } else if (doctorNumber == 3) {
                        DoctorModels doctorModels = doctorsList.get(2);
                        doctorsList.get(2);
                        System.out.println("Insert the new specialty: ");
                        String newSpecialty = scanner.nextLine();
                        doctorModels.setSpecialty(newSpecialty);
                        System.out.println("Specialty successfully updated!");
                    } else if (doctorNumber == 4) {
                        DoctorModels doctorModels = doctorsList.get(3);
                        doctorsList.get(3);
                        System.out.println("Insert the new specialty: ");
                        String newSpecialty = scanner.nextLine();
                        doctorModels.setSpecialty(newSpecialty);
                        System.out.println("Specialty successfully updated!");
                    } else if (doctorNumber == 5) {
                        DoctorModels doctorModels = doctorsList.get(4);
                        doctorsList.get(4);
                        System.out.println("Insert the new specialty: ");
                        String newSpecialty = scanner.nextLine();
                        doctorModels.setSpecialty(newSpecialty);
                        System.out.println("Specialty successfully updated!");
                    }
                } else if (option == 0) {
                    doctorsMenu();
                }
            }
        }
    }
}