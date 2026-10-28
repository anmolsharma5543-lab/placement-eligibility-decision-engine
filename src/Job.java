
public class Job {

    private final String company;
    private final String role;
    private final double minimumPercentage;
    private final int maximumBacklogs;
    private final int requiredGraduationYear;

    public Job(String company, String role, double minimumPercentage, int maximumBacklogs, int requiredGraduationYear) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
}
