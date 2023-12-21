public class Repairman {
    private int repairmanId;
    private String name;
    private String specialty;

    public Repairman(int repairmanId, String name, String specialty) {
        this.repairmanId = repairmanId;
        this.name = name;
        this.specialty = specialty;
    }

    public String diagnosePCs(PC pc) {
        return "Diagnosed: " + pc.toString();
    }

    public String repairPCs(PC pc) {
        return "Repaired: " + pc.toString();
    }
}
