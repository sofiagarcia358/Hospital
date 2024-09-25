package hospital.Service;

import hospital.model.paciente;
import java.util.ArrayList;

public class DataPaciente {

    // Método estático para obtener una lista con 20 pacientes
    public static ArrayList<paciente> obtenerPacientes() {
        ArrayList<paciente> pacientes = new ArrayList<>();

        // Agregamos 20 pacientes a la lista
        pacientes.add(new paciente("Juan Pérez", "juan.perez@example.com", "555-1234", "Calle 1, Ciudad", "15/03/1985", "10:00 AM", "Primera visita", "1", "Dr. Luis Reyes"));
        pacientes.add(new paciente("María López", "maria.lopez@example.com", "555-5678", "Calle 2, Ciudad", "22/07/1990", "11:00 AM", "Revisión general", "2", "Dr. Ana García"));
        pacientes.add(new paciente("Carlos García", "carlos.garcia@example.com", "555-8765", "Calle 3, Ciudad", "03/11/1972", "12:30 PM", "Chequeo anual", "3", "Dr. Pedro Jiménez"));
        pacientes.add(new paciente("Laura González", "laura.gonzalez@example.com", "555-4321", "Calle 4, Ciudad", "25/12/1995", "02:00 PM", "Consulta seguimiento", "4", "Dr. Marta Fernández"));
        pacientes.add(new paciente("Pedro Martínez", "pedro.martinez@example.com", "555-6789", "Calle 5, Ciudad", "18/06/1980", "03:30 PM", "Primera visita", "1", "Dr. Luis Reyes"));
        pacientes.add(new paciente("Ana Fernández", "ana.fernandez@example.com", "555-2468", "Calle 6, Ciudad", "10/09/2000", "04:00 PM", "Consulta seguimiento", "5", "Dr. Ana García"));
        pacientes.add(new paciente("José Ramírez", "jose.ramirez@example.com", "555-1357", "Calle 7, Ciudad", "07/02/1965", "08:30 AM", "Chequeo anual", "6", "Dr. Pedro Jiménez"));
        pacientes.add(new paciente("Lucía Torres", "lucia.torres@example.com", "555-8642", "Calle 8, Ciudad", "19/05/1988", "09:00 AM", "Primera visita", "1", "Dr. Marta Fernández"));
        pacientes.add(new paciente("Miguel Díaz", "miguel.diaz@example.com", "555-9753", "Calle 9, Ciudad", "30/08/1975", "09:30 AM", "Consulta seguimiento", "2", "Dr. Luis Reyes"));
        pacientes.add(new paciente("Patricia Silva", "patricia.silva@example.com", "555-3210", "Calle 10, Ciudad", "12/12/1992", "10:00 AM", "Revisión general", "3", "Dr. Ana García"));
        pacientes.add(new paciente("Javier Moreno", "javier.moreno@example.com", "555-4200", "Calle 11, Ciudad", "05/04/1983", "11:30 AM", "Chequeo anual", "4", "Dr. Pedro Jiménez"));
        pacientes.add(new paciente("Sandra Castillo", "sandra.castillo@example.com", "555-5123", "Calle 12, Ciudad", "17/10/1998", "12:00 PM", "Consulta seguimiento", "5", "Dr. Marta Fernández"));
        pacientes.add(new paciente("David Reyes", "david.reyes@example.com", "555-6199", "Calle 13, Ciudad", "01/01/1970", "01:30 PM", "Primera visita", "1", "Dr. Luis Reyes"));
        pacientes.add(new paciente("Carmen Ortiz", "carmen.ortiz@example.com", "555-7854", "Calle 14, Ciudad", "24/06/1986", "02:30 PM", "Revisión general", "2", "Dr. Ana García"));
        pacientes.add(new paciente("Sergio Gutiérrez", "sergio.gutierrez@example.com", "555-8421", "Calle 15, Ciudad", "15/11/1991", "03:00 PM", "Consulta seguimiento", "3", "Dr. Pedro Jiménez"));
        pacientes.add(new paciente("Paula Flores", "paula.flores@example.com", "555-9632", "Calle 16, Ciudad", "09/09/1996", "03:30 PM", "Chequeo anual", "4", "Dr. Marta Fernández"));
        pacientes.add(new paciente("Fernando Álvarez", "fernando.alvarez@example.com", "555-7410", "Calle 17, Ciudad", "26/03/1982", "04:00 PM", "Primera visita", "1", "Dr. Luis Reyes"));
        pacientes.add(new paciente("Isabel Herrera", "isabel.herrera@example.com", "555-8523", "Calle 18, Ciudad", "11/07/1978", "04:30 PM", "Consulta seguimiento", "2", "Dr. Ana García"));
        pacientes.add(new paciente("Adrián Castro", "adrian.castro@example.com", "555-9635", "Calle 19, Ciudad", "02/02/1985", "05:00 PM", "Chequeo anual", "3", "Dr. Pedro Jiménez"));
        pacientes.add(new paciente("Elena Rivas", "elena.rivas@example.com", "555-1746", "Calle 20, Ciudad", "21/12/1999", "05:30 PM", "Primera visita", "1", "Dr. Marta Fernández"));

        return pacientes;
    }
}
