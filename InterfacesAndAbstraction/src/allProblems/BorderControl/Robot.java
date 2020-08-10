package allProblems.BorderControl;
 class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
