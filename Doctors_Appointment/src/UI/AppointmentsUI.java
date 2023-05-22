package UI; 

import Models.AppointmentsModels; 
import Models.DoctorModels; 

import java.util.*; 

public class AppointmentsUI {
    Scanner scanner = new Scanner(System.in); 
    List<AppointmentsModels> appointmentsList = new ArrayList<>();  
    ManagementUI managementUI = new ManagementUI(); 

    public void appointments() {

        int choose2 = -1; 
        while (choose2 != 0) {
            System.out.println("1. Show appointments"); 
            System.out.println("2. Add appointment"); 
            System.out.println("3. Edit appointment"); 
            System.out.println("4. Delete appointment"); 
            System.out.println("0. Back"); 

            System.out.println("\n Select your option: ");  
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
                managementUI.menu();  
            }

            if (choose4 < 0 || choose4 > 5) {
                System.out.println("Please use a valid option (0 - 5)");  
                appointments(); 
            }
        }
    }

    public void addAppointment() {
        AppointmentsModels appointmentsModels = new AppointmentsModels(); 

        System.out.println("Insert patient's first name: ");  
        String firstName = scanner.nextLine();  

        System.out.println("Insert patient's last name: ");  
        String lastName = scanner.nextLine();  

        System.out.println("Insert the appointment time: (hour [ENTER] min [ENTER])");  
        int hour = scanner.nextInt();  
        int minute = scanner.nextInt(); 

        System.out.println("Insert the appointment date: (dd [ENTER] mm [ENTER] yy) ");  
        int day = scanner.nextInt();  
        int month = scanner.nextInt();  
        int year = scanner.nextInt();  

        appointmentsModels.setFirstName(firstName);  
        appointmentsModels.setLastName(lastName);  
        appointmentsModels.setHour(hour);  
        appointmentsModels.setMinute(minute); 
        appointmentsModels.setDay(day);  
        appointmentsModels.setMonth(month);  
        appointmentsModels.setYear(year);  

        appointmentsList.add(appointmentsModels);  
        System.out.println("Appointment added successfully!");  
    }

    public void showAppointments() {
        for (AppointmentsModels appointmentsModels : appointmentsList) { 
            System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
        }
        if (appointmentsList.size() == 0) {
            System.out.println("No appointments found."); 
        }
    }

    public void deleteAppointment() {
        for (AppointmentsModels appointmentsModels : appointmentsList) {
            System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
        }
        if (appointmentsList.size() > 0) {
            System.out.println("Choose an appointment number to delete: "); 
            int appointmentNumber = -1; 
            appointmentNumber = scanner.nextInt(); 
            scanner.nextLine(); 
            if (appointmentNumber == 1) {
                appointmentsList.remove(0); 
            } else if (appointmentNumber == 2) {
                appointmentsList.remove(1);
            } else if (appointmentNumber == 3) {
                appointmentsList.remove(2); 
            } else if (appointmentNumber == 4) {
                appointmentsList.remove(3); 
            } else if (appointmentNumber == 5) {
                appointmentsList.remove(4); 
            }
            System.out.println("Appointment removed successfully!"); 
            if (appointmentNumber < 1 || appointmentNumber > 5) {
                System.out.println("Please use a valid option (1 - 5)"); 
            }
        } else {
            System.out.println("No appointments found."); 
        }
    }

    public void editAppointment() {
        if (appointmentsList.size() == 0) {
            System.out.println("No appointments found."); 
        } else {
            int option = -1;
            while (option != 0) {
                System.out.println("1. Edit first name"); 
                System.out.println("2. Edit last name"); 
                System.out.println("3. Edit hour"); 
                System.out.println("4. Edit minute"); 
                System.out.println("5. Edit day"); 
                System.out.println("6. Edit month"); 
                System.out.println("7. Edit year"); 
                System.out.println("0. Back"); 
                option = scanner.nextInt(); 
                scanner.nextLine(); 
                if (option == 1) {
                    System.out.println("\n" + "Enter the appointment number in which you want to change the patient's first name: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new first name: "); 
                        String newFirstName = scanner.nextLine(); 
                        appointmentsModels.setFirstName(newFirstName); 
                        System.out.println("First name updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new first name: "); 
                        String newFirstName = scanner.nextLine(); 
                        appointmentsModels.setFirstName(newFirstName); 
                        System.out.println("First name updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new first name: "); 
                        String newFirstName = scanner.nextLine(); 
                        appointmentsModels.setFirstName(newFirstName); 
                        System.out.println("First name updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new first name: "); 
                        String newFirstName = scanner.nextLine(); 
                        appointmentsModels.setFirstName(newFirstName); 
                        System.out.println("First name updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new first name: "); 
                        String newFirstName = scanner.nextLine(); 
                        appointmentsModels.setFirstName(newFirstName); 
                        System.out.println("First name updated successfully!"); 
                    }
                } else if (option == 2) {
                    System.out.println("Enter the appointment number in which you want to change the patient's last name: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new last name: "); 
                        String newLastName = scanner.nextLine(); 
                        appointmentsModels.setLastName(newLastName); 
                        System.out.println("Last name updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new last name: "); 
                        String newLastName = scanner.nextLine(); 
                        appointmentsModels.setLastName(newLastName); 
                        System.out.println("Last name updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new last name: "); 
                        String newLastName = scanner.nextLine(); 
                        appointmentsModels.setLastName(newLastName); 
                        System.out.println("Last name updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new last name: "); 
                        String newLastName = scanner.nextLine(); 
                        appointmentsModels.setLastName(newLastName); 
                        System.out.println("Last name updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new last name: "); 
                        String newLastName = scanner.nextLine(); 
                        appointmentsModels.setLastName(newLastName); 
                        System.out.println("Last name updated successfully!"); 
                    }
                } else if (option == 3) {
                    System.out.println("Enter the appointment number in which you want to change the hour: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new hour: "); 
                        int newHour = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setHour(newHour); 
                        System.out.println("Appointment hour updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new hour: "); 
                        int newHour = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setHour(newHour); 
                        System.out.println("Appointment hour updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new hour: "); 
                        int newHour = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setHour(newHour); 
                        System.out.println("Appointment hour updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new hour: "); 
                        int newHour = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setHour(newHour); 
                        System.out.println("Appointment hour updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new hour: "); 
                        int newHour = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setHour(newHour); 
                        System.out.println("Appointment hour updated successfully!"); 
                    }
                } else if (option == 4) {
                    System.out.println("Enter the appointment number in which you want to change the minute: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new minute: "); 
                        int newMinute = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMinute(newMinute); 
                        System.out.println("Appointment minute updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new minute: "); 
                        int newMinute = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMinute(newMinute); 
                        System.out.println("Appointment minute updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new minute: "); 
                        int newMinute = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMinute(newMinute); 
                        System.out.println("Appointment minute updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new minute: "); 
                        int newMinute = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMinute(newMinute); 
                        System.out.println("Appointment minute updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new minute: "); 
                        int newMinute = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMinute(newMinute); 
                        System.out.println("Appointment minute updated successfully!"); 
                    }
                } else if (option == 5) {
                    System.out.println("Enter the appointment number in which you want to change the day: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new day: "); 
                        int newDay = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setDay(newDay); 
                        System.out.println("Appointment day updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new day: "); 
                        int newDay = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setDay(newDay); 
                        System.out.println("Appointment day updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new day: "); 
                        int newDay = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setDay(newDay); 
                        System.out.println("Appointment day updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new day: "); 
                        int newDay = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setDay(newDay); 
                        System.out.println("Appointment day updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new day: "); 
                        int newDay = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setDay(newDay); 
                        System.out.println("Appointment day updated successfully!"); 
                    }
                } else if (option == 6) {
                    System.out.println("Enter the appointment number in which you want to change the month: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new month: "); 
                        int newMonth = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMonth(newMonth); 
                        System.out.println("Appointment month updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new month: "); 
                        int newMonth = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMonth(newMonth); 
                        System.out.println("Appointment month updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new month: "); 
                        int newMonth = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMonth(newMonth); 
                        System.out.println("Appointment month updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new month: "); 
                        int newMonth = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMonth(newMonth); 
                        System.out.println("Appointment month updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new month: "); 
                        int newMonth = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setMonth(newMonth); 
                        System.out.println("Appointment month updated successfully!"); 
                    }
                } else if (option == 7) {
                    System.out.println("Enter the appointment number in which you want to change the year: "); 
                    for (AppointmentsModels appointmentsModels : appointmentsList) {
                        System.out.println(appointmentsModels.getFirstName() + " " + appointmentsModels.getLastName() + " - " + appointmentsModels.getHour() + ":" + appointmentsModels.getMinute() + " " + appointmentsModels.getDay() + "/" + appointmentsModels.getMonth() + "/" + appointmentsModels.getYear());  
                    }
                    int appointmentNumber = scanner.nextInt(); 
                    scanner.nextLine(); 
                    if (appointmentNumber == 1) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(0); 
                        appointmentsList.get(0); 
                        System.out.println("Insert the new year: "); 
                        int newYear = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setYear(newYear); 
                        System.out.println("Appointment year updated successfully!"); 
                    } else if (appointmentNumber == 2) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(1); 
                        appointmentsList.get(1); 
                        System.out.println("Insert the new year: "); 
                        int newYear = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setYear(newYear); 
                        System.out.println("Appointment year updated successfully!"); 
                    } else if (appointmentNumber == 3) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(2); 
                        appointmentsList.get(2); 
                        System.out.println("Insert the new year: "); 
                        int newYear = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setYear(newYear); 
                        System.out.println("Appointment year updated successfully!"); 
                    } else if (appointmentNumber == 4) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(3); 
                        appointmentsList.get(3); 
                        System.out.println("Insert the new year: "); 
                        int newYear = scanner.nextInt(); 
                        scanner.nextLine(); 
                        appointmentsModels.setYear(newYear); 
                        System.out.println("Appointment year updated successfully!"); 
                    } else if (appointmentNumber == 5) {
                        AppointmentsModels appointmentsModels = appointmentsList.get(4); 
                        appointmentsList.get(4); 
                        System.out.println("Insert the new year: "); 
                        int newYear = scanner.nextInt();  
                        scanner.nextLine();  
                        appointmentsModels.setYear(newYear);  
                        System.out.println("Appointment year updated successfully!");  
                    } 
                } else if (option == 0) { 
                    appointments(); 
                }
            }
        }
    }
}
