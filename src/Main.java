
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading candidate details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        int candidateSkillCount = scanner.nextInt();
        String[] candidateSkills = new String[candidateSkillCount];

        for (int i = 0; i < candidateSkills.length; i++) {
            candidateSkills[i] = scanner.next();
        }

        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear,
                candidateSkills
        );

        // Reading multiple jobs dynamically
        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];

        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            int requiredSkillCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for (int j = 0; j < requiredSkillCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            jobs[i] = new Job(
                    company,
                    role,
                    minimumPercentage,
                    maximumBacklogs,
                    requiredGraduationYear,
                    requiredSkills
            );
        }

        // Displaying available jobs list
        System.out.println();
        System.out.println("AVAILABLE JOBS:");

        for (int i = 0; i < jobs.length; i++) {
            System.out.println(
                    (i + 1) + ". "
                    + jobs[i].getCompany() + " - "
                    + jobs[i].getRole()
            );
        }

        // Selecting a job at runtime based on user input
        int selectedJobNumber = scanner.nextInt();
        Job selectedJob = jobs[selectedJobNumber - 1];

        EligibilityChecker checker = new EligibilityChecker();

        // Evaluating candidate eligibility for the selected job
        System.out.println();
        System.out.println("=================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("=================================");
        System.out.println();

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company : " + selectedJob.getCompany());
        System.out.println("Role    : " + selectedJob.getRole());
        System.out.println();

        boolean eligible = checker.evaluate(candidate, selectedJob);

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("=================================");
        System.out.println();

        scanner.close();
    }
}
