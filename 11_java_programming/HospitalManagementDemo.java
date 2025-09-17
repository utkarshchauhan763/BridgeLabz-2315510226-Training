// Hospital Patient Management - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Patient.
 */
abstract class Patient {
    private final String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.isEmpty()) throw new IllegalArgumentException("Diagnosis cannot be empty");
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
}

/**
 * Interface for medical records.
 */
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

/**
 * InPatient implementation.
 */
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private StringBuilder records = new StringBuilder();

    public InPatient(String patientId, String name, int age, String diagnosis, double dailyRate, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("; ");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

/**
 * OutPatient implementation.
 */
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder records = new StringBuilder();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("; ");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

/**
 * Demo for polymorphic patient processing.
 */
public class HospitalManagementDemo {
    public static void main(String[] args) {
        Patient[] patients = new Patient[] {
            new InPatient("P001", "Rahul", 35, "Fracture", 2000, 4),
            new OutPatient("P002", "Sneha", 28, "Flu", 500)
        };
        ((MedicalRecord)patients[0]).addRecord("X-ray done");
        ((MedicalRecord)patients[1]).addRecord("Prescribed medication");
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());
            System.out.println("Records: " + ((MedicalRecord)p).viewRecords());
            System.out.println();
        }
    }
}
