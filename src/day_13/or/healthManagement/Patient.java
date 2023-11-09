package day_13.or.healthManagement;

public class Patient implements Comparable<Patient> {
	
	private String name;
	private int severity;

	//constructor
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	public String getName() {
		return name;
	}
	public int getSeverity() {
		return severity;
	}

	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.severity, other.severity);
	
	}
}
