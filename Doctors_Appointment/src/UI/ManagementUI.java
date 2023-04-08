package UI;

import java.util.Scanner;

public class ManagementUI {
    public void meniu() {

        int choose2 = -1;
        while (choose2 != 0) {
            System.out.println("Welcome!");
            System.out.println("--------");
            System.out.println("1. Doctors management");
            System.out.println("2. Patients management");
            System.out.println("3. Appointments");
            System.out.println("0. Close");

            DoctorsManagementUI doctorsManagementUI = new DoctorsManagementUI();
            PatientsManagementUI patientsManagementUI = new PatientsManagementUI();
            AppointmentsUI appointmentsUI = new AppointmentsUI();

            System.out.println("\n Selectati optiunea dorita: ");
            Scanner scanner = new Scanner(System.in);
            int choose1 = scanner.nextInt();

            if (choose1 == 1) {
                doctorsManagementUI.meniuDoctors();
            } else if (choose1 == 2) {
                patientsManagementUI.meniuPatients();
            } else if (choose1 == 3) {
                appointmentsUI.appointments();
            } else if (choose1 == 0) {
                System.exit(0);
            }

            if (choose1 < 0 || choose1 > 3) {
                System.out.println("Introduceti o optiune valida (0 - 3)");
                meniu();
            }
        }
    }
}
