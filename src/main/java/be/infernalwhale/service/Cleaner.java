package be.infernalwhale.service;

public class Cleaner {
    // Stofzuiger, bezem, CleaningProducts (Javel, Allesreiniger, Zeep,...), Dweil, ....
    private CleaningTool tool;

    public void setTool(CleaningTool tool) {
        this.tool = tool;
    }

    public void doJob() {
        this.tool.clean();
    }
}
