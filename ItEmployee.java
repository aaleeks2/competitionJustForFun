package poligon.Konkurseł;

public class ItEmployee {

    private String name;
    private String programmingLanguage;
    private String job;
    private String company;
    private String hobby;
    private String features;
    private String tomaszewBlessing;

    public String getTomaszewBlessing() {
        return tomaszewBlessing;
    }

    public void setTomaszewBlessing(String tomaszewBlessing) {
        this.tomaszewBlessing = tomaszewBlessing;
    }

    public ItEmployee() {
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public ItEmployee(String name, String programmingLanguage, String job, String company, String features) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.job = job;
        this.company = company;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Dziękuję za wzięcie udziału, oto wyniki:" + "\n"
                + "Według udzielonych przec Ciebie odpowiedzi, wygenerowany został programista " + name + ", który: " + "\n"
                + "programuje w języku " + programmingLanguage + " w firmie " + company + " na stanowisku " + job + "." + "\n"
                + "W ramach hobby lubi " + hobby + ", a wśród kolegów z branży znany jest z " + features + ". " + "\n"
                + name + " ma przed sobą świetlaną przyszłość" + tomaszewBlessing +" i wszyscy z całych sił trzymamy za niego kciuki." +"\n"
                + "Pozdrawiamy," + "\n" + "Redakcja";
    }
}
